package com.dc.web.controller;

import com.dc.pojo.Stuxx;
import com.dc.service.impl.stuxxServiceImpl;
import com.dc.service.stuxxService;
import com.dc.utils.PageUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import static net.sf.json.JSONObject.fromObject;

@WebServlet("/findAllstuAjaxServlet")
public class findAllstuAjaxServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * 获取班级号 的id
         */
        Integer class_id = Integer.valueOf(request.getParameter("classID"));

        System.out.println("ajax测试");
        //可能有中文
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/text;charset=utf-8");
        System.out.println("ClassId:"+class_id);//
        System.out.println("接受到前台请求........."); // 模拟读取数据库


        //调用service获取数据
        stuxxService stuxxService = new stuxxServiceImpl();
        // 获取当前的页数
        String pageStr = request.getParameter("page");
        Integer page = pageStr == null ? 1 : Integer.valueOf(pageStr);
        System.out.println("now page"+page);

        Integer pageSize = 2;
        //构造pageUtil对象
        PageUtil<Stuxx> pageUtil = new PageUtil<>();
        pageUtil.setPageSize(pageSize);
        pageUtil.setNowPage(page);
        stuxxService.getCategoryList(pageUtil,class_id);
        System.out.println("json:0");
        System.out.println(pageUtil);
        /*
        * 不用resquest响应
        * */
        //request.setAttribute("pageUtil",pageUtil);
        JSONObject jsonObject = JSONObject.fromObject(pageUtil);
        PrintWriter printWriter = response.getWriter();
        System.out.println("json:1");

        // 编码类型
        response.setCharacterEncoding("utf-8");
        // 请求头
        response.setContentType("text/html; charset=utf-8");//要加上编码类型跟请求头,中文最后能显示出来.
        printWriter.print(jsonObject.toString());
        //String json = pageUtil.toString();
        System.out.println("json:2");
        //printWriter.println(json);
        printWriter.flush();
        printWriter.close();
    }
}
