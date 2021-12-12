package com.stan.web;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.stan.service.CartService;
import com.stan.util.JSONUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

@WebServlet(name = "CartServlet", value = "/cart_list")
public class CartServlet extends HttpServlet {

    private final CartService cartService = new CartService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String openid = request.getParameter("openid");

        String jsonString = JSONObject.toJSONString(cartService.getCart(openid));
        System.out.println("Get Cart...");

        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Cart Update");
        JSONObject json = JSONUtils.paramsToJSON(request);
        assert json != null;
        String openId = (String) json.get("openId");
        JSONArray cart = (JSONArray) json.get("orderItem");

        String res = cartService.updateCart(openId, cart) ? "success" : "fail";

        response.getWriter().write(res);
    }
}
