package com.dc.web.controller;

import com.dc.dao.classDao;
import com.dc.dao.impl.classDaoImpl;
import com.dc.pojo.Classxx;
import com.dc.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "findClassServlet",urlPatterns = {"/findClass.action"})
public class findClassServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        /**
         * 处理查找班级请求,
         * 找到所有班级并且返回对象在member.jsp上显示
         */
        //获取当前teacher
        User user = (User) request.getSession().getAttribute("user");
        classDao classDao = new classDaoImpl();
        //拿到当前班级
        List<Classxx> classList = classDao.findClass(user.getUser_id());
        //将班级存入当前session
        request.setAttribute("class_nums",classList);
        System.out.println("classList:"+classList);

        //转发
        request.getRequestDispatcher("/pages/member.jsp").forward(request,response);
    }
}
