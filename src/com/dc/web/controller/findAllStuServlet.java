package com.dc.web.controller;

import com.dc.dao.impl.stuxxDaoImpl;
import com.dc.dao.stuDao;
import com.dc.pojo.Stuxx;
import com.dc.service.impl.stuxxServiceImpl;
import com.dc.service.stuxxService;
import com.dc.utils.PageUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Time;
import java.util.List;

@WebServlet(name = "findAllStuServlet",urlPatterns = {"/findAllStu.action"})
public class findAllStuServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * 获取班级号 的id
         */
        Integer classxx_id = Integer.valueOf(request.getParameter("id"));

        /**
         * 获取设置迟到时间
         */
        //Time time = Time.valueOf(request.getParameter("lateTimes"));


        /**
         * 获取当前班级所有人的信息,调用Dao层方法，（本来应该是再service中还有一层，但由于偷懒暂时没写）
         */
        stuDao stuDao = new stuxxDaoImpl();
        //定义一个学生类的集合来存储
        // 2019/3/5该学生信息用不到，因为后面将学生信息加到
        List<Stuxx> stuxx = null;
        stuxx = stuDao.findStuxxByClassId(classxx_id);
        //把学生信息存到request对象中
        request.setAttribute("classID",classxx_id);
        //System.out.println(stuxx);

        //调用service获取数据
        stuxxService stuxxService = new stuxxServiceImpl();

        // 获取当前的页数
        String pageStr = request.getParameter("page");
        Integer page = pageStr == null ? 1 : Integer.valueOf(pageStr);

        Integer pageSize = 1;
        //构造pageUtil对象
        PageUtil<Stuxx> pageUtil = new PageUtil<>();
        pageUtil.setPageSize(pageSize);
        pageUtil.setNowPage(page);
        stuxxService.getCategoryList(pageUtil,classxx_id);
        request.setAttribute("pageUtil",pageUtil);

        //转发
        request.getRequestDispatcher("/pages/member.jsp").forward(request,response);


    }
}
