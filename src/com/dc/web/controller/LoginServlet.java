package com.dc.web.controller;

import com.dc.dto.BaseDto;
import com.dc.pojo.User;
import com.dc.service.impl.userServiceImpl;
import com.dc.service.userService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "LoginServlet",urlPatterns = {"/login.action"})
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 1. 获取相应的数据,用户名和密码,验证码
        String user_nikname = request.getParameter("username");
        String user_pwd = request.getParameter("password");
        String memberVeriCode = request.getParameter("member_vericode");


        //组装User对象
        User user = new User();
        user.setUser_nikname(user_nikname);
        user.setUser_pwd(user_pwd);

        //得到session中的验证码
        String sessionCode = request.getSession().getAttribute("code").toString();
        //System.out.println("codedddd"+sessionCode);//已经获取到了正确的sessionCode

        // 3. 调用service
        userService userService = new userServiceImpl();
        /*
        获取当前老师教课的所有班级
         */
        List<User> userxx = userService.findAllTeacherxxByUsername(user_nikname);
        //System.out.println(userxx);


        /**
         * 判断用户是否存在等
         */
        BaseDto<User> login = userService.login(user,memberVeriCode,sessionCode);

        // 4. 判断是否登陆成功? 登陆成功我们需要讲member对象保存到session
        request.setAttribute("msg",login.getMsg());
        if(login.getCode() == 200){
            // 4.1 将user对象保存到session
            request.getSession().setAttribute("user",userxx);
            // 4.2 跳转到正确的页面
            request.getRequestDispatcher("/pages/member.jsp").forward(request,response);

        }else{
            //System.out.println("跳转到错误的提示页面");
            // 4.3 跳转到错误的提示页面
            request.getRequestDispatcher("/pages/loginFailed.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
