package com.stan.web;

import com.alibaba.fastjson.JSONObject;
import com.stan.pojo.User;
import com.stan.service.UserService;
import com.stan.util.JSONUtils;
import com.stan.util.UserUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    private final UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        Map<String, String> map = JSONUtils.paramsToMap(request);

        String code = map.get("code");
        String appId = map.get("appId");
        String appSecret = map.get("appSecret");
        String nickname = map.get("nickName");

        JSONObject user = UserUtils.getSession(appId, appSecret, code);

        boolean res = false;
        if (user != null) {
            res = userService.login(new User(
                    (String) user.get("openid"),
                    (String) user.get("session_key"),
                    nickname));
        }
        response.getWriter().write(res ? (String) user.get("openid") : "fail");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }


}
