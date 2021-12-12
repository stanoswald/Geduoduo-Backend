package com.stan.web;

import com.alibaba.fastjson.JSON;
import com.stan.pojo.Goods;
import com.stan.service.GoodsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "GoodsServlet", value = "/good")
public class GoodsServlet extends HttpServlet {

    GoodsService goodsService = new GoodsService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String goods_id = request.getParameter("goods_id");
        Goods goods = goodsService.selectByGoodsId(Integer.valueOf(goods_id));
        System.out.println("Get goods...");

        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(JSON.toJSONString(goods));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Get goods by cat");
        String catId = request.getParameter("cat_id");
        List<Goods> goods = goodsService.selectByCatId(Integer.parseInt(catId));

        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(JSON.toJSONString(goods));
    }
}
