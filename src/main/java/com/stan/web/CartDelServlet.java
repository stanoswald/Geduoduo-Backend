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
import java.util.Map;

@WebServlet(name = "CartDelServlet", value = "/cart_del")
public class CartDelServlet extends HttpServlet {

    private final CartService cartService = new CartService();

    /**
     * get请求清空购物车
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String openid = request.getParameter("openid");

        String res = cartService.cartDel(openid, null) ? "success" : "fail";
        System.out.println("clear cart");

        response.getWriter().write(res);
    }

    /**
     * post请求删除某个物品
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String openId = request.getParameter("openid");
        String goodsId = request.getParameter("goodsId");

        String res = cartService.cartDel(openId, Integer.parseInt(goodsId)) ? "success" : "fail";
        System.out.println("del item");

        response.getWriter().write(res);
    }
}
