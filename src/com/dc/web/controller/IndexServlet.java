package com.dc.web.controller;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author:Teacher黄
 * @date:Created at 2019/02/17
 * 首页
 */
@WebServlet(name = "IndexServlet",urlPatterns = {"/index.action"})
public class IndexServlet extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        // 请求转发
        request.getRequestDispatcher("/pages/login.jsp").forward(request,response);




    }
}
