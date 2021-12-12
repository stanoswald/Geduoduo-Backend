package com.stan.web;

import com.stan.service.CartService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CartAddServlet", value = "/cart_add")
public class CartAddServlet extends HttpServlet {
    private final CartService cartService = new CartService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String openid = request.getParameter("openid");
        String goods_id = request.getParameter("goods_id");

        String res = cartService.addToCart(openid, Integer.parseInt(goods_id)) ? "success" : "fail";
        response.getWriter().write(res);
    }
}
