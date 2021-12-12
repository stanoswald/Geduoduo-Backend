package com.stan.web;

import com.alibaba.fastjson.JSONReader;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet(name = "CategoriesServlet", value = "/categories")
public class CategoriesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        InputStream iStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("categories.json");

        System.out.println("Get categories...");
        assert iStream != null;
        InputStreamReader in = new InputStreamReader(iStream);
        JSONReader reader = new JSONReader(in);

        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(reader.readString());
    }
}
