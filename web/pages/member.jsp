<%--
  Created by IntelliJ IDEA.
  User: 大哥
  Date: 2019/2/26
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>AdminLTE 3 | Widgets</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/dist/css/adminlte.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/dist/css/adminlte.css">
    <!-- Google Font: Source Sans Pro -->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js" charset="UTF-8"></script>
</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">
    <!-- Navbar -->
    <nav class="main-header navbar navbar-expand bg-white navbar-light border-bottom">
        <!-- Left navbar links -->
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" data-widget="pushmenu" href="#"><i class="fa fa-bars"></i></a>
            </li>
            <li class="nav-item d-none d-sm-inline-block">
                <a href="#" class="nav-link">Home</a>
            </li>
            <li class="nav-item d-none d-sm-inline-block">
                <a href="#" class="nav-link">Contact</a>
            </li>
        </ul>

        <!-- SEARCH FORM -->
        <form class="form-inline ml-3">
            <div class="input-group input-group-sm">
                <input class="form-control form-control-navbar" type="search" placeholder="Search" aria-label="Search">
                <div class="input-group-append">
                    <button class="btn btn-navbar" type="submit">
                        <i class="fa fa-search"></i>
                    </button>
                </div>
            </div>
        </form>

        <!-- Right navbar links -->
        <%--<ul class="navbar-nav ml-auto">
            <!-- Messages Dropdown Menu -->
            <li class="nav-item dropdown">
                <a class="nav-link" data-toggle="dropdown" href="#">
                    <i class="fa fa-comments-o"></i>
                    <span class="badge badge-danger navbar-badge">3</span>
                </a>
                <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
                    <a href="#" class="dropdown-item">
                        <!-- Message Start -->
                        <div class="media">
                            <img src="${pageContext.request.contextPath}/static/dist/img/user1-128x128.jpg" alt="User Avatar" class="img-size-50 mr-3 img-circle">
                            <div class="media-body">
                                <h3 class="dropdown-item-title">
                                    Brad Diesel
                                    <span class="float-right text-sm text-danger"><i class="fa fa-star"></i></span>
                                </h3>
                                <p class="text-sm">Call me whenever you can...</p>
                                <p class="text-sm text-muted"><i class="fa fa-clock-o mr-1"></i> 4 Hours Ago</p>
                            </div>
                        </div>
                        <!-- Message End -->
                    </a>
                    <div class="dropdown-divider"></div>
                    <a href="#" class="dropdown-item">
                        <!-- Message Start -->
                        <div class="media">
                            <img src="${pageContext.request.contextPath}/static/dist/img/user8-128x128.jpg" alt="User Avatar" class="img-size-50 img-circle mr-3">
                            <div class="media-body">
                                <h3 class="dropdown-item-title">
                                    John Pierce
                                    <span class="float-right text-sm text-muted"><i class="fa fa-star"></i></span>
                                </h3>
                                <p class="text-sm">I got your message bro</p>
                                <p class="text-sm text-muted"><i class="fa fa-clock-o mr-1"></i> 4 Hours Ago</p>
                            </div>
                        </div>
                        <!-- Message End -->
                    </a>
                    <div class="dropdown-divider"></div>
                    <a href="#" class="dropdown-item">
                        <!-- Message Start -->
                        <div class="media">
                            <img src="${pageContext.request.contextPath}/static/dist/img/user3-128x128.jpg" alt="User Avatar" class="img-size-50 img-circle mr-3">
                            <div class="media-body">
                                <h3 class="dropdown-item-title">
                                    Nora Silvester
                                    <span class="float-right text-sm text-warning"><i class="fa fa-star"></i></span>
                                </h3>
                                <p class="text-sm">The subject goes here</p>
                                <p class="text-sm text-muted"><i class="fa fa-clock-o mr-1"></i> 4 Hours Ago</p>
                            </div>
                        </div>
                        <!-- Message End -->
                    </a>
                    <div class="dropdown-divider"></div>
                    <a href="#" class="dropdown-item dropdown-footer">See All Messages</a>
                </div>
            </li>
            <!-- Notifications Dropdown Menu -->
            <li class="nav-item dropdown">
                <a class="nav-link" data-toggle="dropdown" href="#">
                    <i class="fa fa-bell-o"></i>
                    <span class="badge badge-warning navbar-badge">15</span>
                </a>
                <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
                    <span class="dropdown-item dropdown-header">15 Notifications</span>
                    <div class="dropdown-divider"></div>
                    <a href="#" class="dropdown-item">
                        <i class="fa fa-envelope mr-2"></i> 4 new messages
                        <span class="float-right text-muted text-sm">3 mins</span>
                    </a>
                    <div class="dropdown-divider"></div>
                    <a href="#" class="dropdown-item">
                        <i class="fa fa-users mr-2"></i> 8 friend requests
                        <span class="float-right text-muted text-sm">12 hours</span>
                    </a>
                    <div class="dropdown-divider"></div>
                    <a href="#" class="dropdown-item">
                        <i class="fa fa-file mr-2"></i> 3 new reports
                        <span class="float-right text-muted text-sm">2 days</span>
                    </a>
                    <div class="dropdown-divider"></div>
                    <a href="#" class="dropdown-item dropdown-footer">See All Notifications</a>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link" data-widget="control-sidebar" data-slide="true" href="#">
                    <i class="fa fa-th-large"></i>
                </a>
            </li>
        </ul>--%>
    </nav>
    <!-- /.navbar -->

    <!-- Main Sidebar Container -->
    <aside class="main-sidebar sidebar-dark-primary elevation-4">
        <!-- Brand Logo -->
        <a href="#" class="brand-link">
            <img src="${pageContext.request.contextPath}/static/dist/img/AdminLTELogo.png"
                 alt="AdminLTE Logo"
                 class="brand-image img-circle elevation-3"
                 style="opacity: .8">
            <span class="brand-text font-weight-light">AdminLTE 3</span>
        </a>

        <!-- Sidebar -->
        <div class="sidebar">
            <!-- Sidebar user panel (optional) -->
            <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                <div class="image">
                    <img src="${pageContext.request.contextPath}/static/dist/img/user2-160x160.jpg"
                         class="img-circle elevation-2" alt="User Image">
                </div>
                <div class="info">
                    <c:forEach items="${user}" var="user" end="0">
                        <a href="#" class="d-block">${user.user_name}</a>
                    </c:forEach>

                </div>
            </div>

            <!-- Sidebar Menu -->
            <nav class="mt-2">
                <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu"
                    data-accordion="false">
                    <!-- Add icons to the links using the .nav-icon class
                         with font-awesome or any other icon font library -->
                    <%--基本信息--%>
                    <li class="nav-item has-treeview">
                        <a href="#" class="nav-link">
                            <i class="nav-icon fa fa-dashboard"></i>
                            <p>
                                基本信息
                                <i class="right fa fa-angle-left"></i>
                            </p>
                        </a>
                        <ul class="nav nav-treeview">
                            <c:forEach items="${user}" var="class_num">
                                <li class="nav-item">
                                    <a onclick="ajaxtest1(this,${class_num.classxx.class_id},${p})" class="nav-link">
                                        <i class="fa fa-circle-o nav-icon"></i>
                                        <p>${class_num.classxx.class_id}班</p>
                                    </a>
                                </li>
                            </c:forEach>

                            <!-- 在线引入jQery，这里也可以换成引入本地的jQuery -->
                            <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js" charset="UTF-8"></script>
                            <script type="text/javascript">
                                var curPage = 1; //当前页码
                                var total,pageSize,totalPage; //总记录数，每页显示数，总页数

                                function ajaxtest1(obj,a,page) {
                                    var value = a;
                                    // 使用ajax发送请求
                                    $.ajax({
                                        url: "findAllstuAjaxServlet", // 要访问的地址，这里访问的是servlet映射地址
                                        cache: false,  // 是否缓存
                                        data: {classID:value,page:page}, // 相当于地址栏后面的参数
                                        contentType: "application/json;charset=UTF-8",
                                        success: function (result) { // 访问成功后，执行的方法，参数是后台的结果
                                            // 将获取到的数据写入span标签
                                            var jsonData = JSON.parse(result);
                                            total = jsonData.totalNums;
                                            pageSize = jsonData.pageSize;
                                            totalPage = jsonData.totalPages;
                                            var str="";
                                            var th2 = "";
                                            var page = "";
                                            if(result==null){
                                                alert("last");
                                            }else {
                                                $(".card-title").html("班级："+a+"班");
                                                $("#test2").html("");
                                                $("#th2").html("");
                                                $(".pagination").html("");
                                                th2  =  "<tr>" +
                                                    "<th>" +"学号"+ "</th>" +
                                                    "<th>" +"学生姓名"+ "</th>" +
                                                    "<th>" +"手机MAC地址"+ "</th>" +
                                                    "<th>" +"迟到时间"+ "</th>" +
                                                    "<th>" +"是否迟到"+ "</th>" +
                                                    "</tr>";
                                                $("#th2").append(th2);
                                                for (var i=0;i<jsonData.pageSize;i++){
                                                    str =  "<tr>" +
                                                        "<td>"+jsonData.content[i].stuid + "</td>" +
                                                        "<td>"+jsonData.content[i].stuname+ "</td>" +
                                                        "<td>"+jsonData.content[i].latetimes + "</td>" +
                                                        "<td>"+jsonData.content[i].phoneIp + "</td>" +
                                                        "<td>"+jsonData.content[i].islate + "</td>" +
                                                        "</tr>";
                                                    $("#test2").append(str);
                                                }

                                                /*
                                                    * 上一页*/
                                                page += "<li class='sy'><a class='page-link'>&laquo;</a></li>";
                                                /*
                                                * 加载分页*/
                                                for(var i=1;i<=jsonData.totalPages;i++){
                                                    /*var pe = jsonData.nowPage == i ? "active" : "";*/
                                                    if(jsonData.nowPage == i) {
                                                        page += "<li class='active list'>" +
                                                            "<a class=page-link>" + i + "</a>" +
                                                            "</li>";
                                                        /*$(".pagination").append(page);*/
                                                    }else{
                                                        page += "<li class='list'" + ">" +
                                                            "<a class='page-link'>" + i + "</a>" +
                                                            "</li>";
                                                    }
                                                }
                                                /*
                                                * 下一页
                                                * */
                                                page += "<li class='xy'><a class='page-link'>&raquo;</a></li>";
                                                $(".pagination").append(page);

                                                $(".list").click(function () {
                                                    ajaxtest1(obj,a,$(this).text());
                                                })

                                                /*
                                                * 上一页
                                                * */
                                                $(".sy").click(function () {
                                                    if(jsonData.nowPage>1){
                                                        var page = jsonData.nowPage-1;
                                                        ajaxtest1(obj,a,page);
                                                    }
                                                })


                                                /**
                                                 * 下一页
                                                 * */
                                                $(".xy").click(function () {
                                                    if(jsonData.nowPage<totalPage){//如果小于最大的页数则将当前页数加1并传给服务器，如果不是就什么都不做
                                                        var page = jsonData.nowPage+1;
                                                        ajaxtest1(obj,a,page);
                                                    }
                                                })
                                            }
                                        },
                                    });
                                }


                            </script>


                        </ul>
                    </li>

                    <%--考勤信息--%>
                    <li class="nav-item has-treeview">
                        <a href="#" class="nav-link">
                            <i class="nav-icon fa fa-th"></i>
                            <p>
                                考勤信息
                                <i class="right fa fa-angle-left"></i>
                            </p>
                        </a>
                        <ul class="nav nav-treeview">
                            <c:forEach items="${user}" var="class_num" >
                                <li class="nav-item">
                                        <%--${pageContext.request.contextPath}/findKQInfo.action?id=${class_num.classxx.class_id}--%>
                                    <a onclick="ajaxtest(this,${class_num.classxx.class_id},${p})" class="nav-link">
                                        <i class="fa fa-circle-o nav-icon"></i>
                                        <p class="ajaxval">${class_num.classxx.class_id}班</p>
                                    </a>
                                </li>
                            </c:forEach>

                            <!-- 在线引入jQery，这里也可以换成引入本地的jQuery -->
                            <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js" charset="UTF-8"></script>
                            <script type="text/javascript">
                                var curPage = 1; //当前页码
                                var total,pageSize,totalPage; //总记录数，每页显示数，总页数

                                function ajaxtest(obj,a,page) {
                                        var value = a;
                                        // 使用ajax发送请求
                                        $.ajax({
                                            url: "findAllstuAjaxServlet", // 要访问的地址，这里访问的是servlet映射地址
                                            cache: false,  // 是否缓存
                                            data: {classID:value,page:page}, // 相当于地址栏后面的参数
                                            contentType: "application/json;charset=UTF-8",
                                            success: function (result) { // 访问成功后，执行的方法，参数是后台的结果
                                                // 将获取到的数据写入span标签
                                                var jsonData = JSON.parse(result);
                                                total = jsonData.totalNums;
                                                pageSize = jsonData.pageSize;
                                                totalPage = jsonData.totalPages;
                                                var str="";
                                                var th2 = "";
                                                var page = "";
                                                if(result==null){
                                                    alert("last");
                                                }else {
                                                    $(".card-title").html("班级："+a+"班");
                                                    $("#test2").html("");
                                                    $("#th2").html("");
                                                    $(".pagination").html("");
                                                    th2  =  "<tr>" +
                                                                "<th>" +"学号"+ "</th>" +
                                                                "<th>" +"学生姓名"+ "</th>" +
                                                                "<th>" +"手机MAC地址"+ "</th>" +
                                                                "<th>" +"迟到时间"+ "</th>" +
                                                                "<th>" +"是否迟到"+ "</th>" +
                                                            "</tr>";
                                                    $("#th2").append(th2);
                                                    for (var i=0;i<jsonData.pageSize;i++){
                                                        str =  "<tr>" +
                                                                "<td>"+jsonData.content[i].stuid + "</td>" +
                                                                "<td>"+jsonData.content[i].stuname+ "</td>" +
                                                                "<td>"+jsonData.content[i].latetimes + "</td>" +
                                                                "<td>"+jsonData.content[i].phoneIp + "</td>" +
                                                                "<td>"+jsonData.content[i].islate + "</td>" +
                                                            "</tr>";
                                                        $("#test2").append(str);
                                                    }

                                                    /*
                                                    * 上一页*/
                                                    page += "<li class='sy'><a class='page-link'>&laquo;</a></li>";
                                                    /*
                                                    * 加载分页*/
                                                    for(var i=1;i<=jsonData.totalPages;i++){
                                                            /*var pe = jsonData.nowPage == i ? "active" : "";*/
                                                            if(jsonData.nowPage == i) {
                                                                page += "<li class='active list'>" +
                                                                    "<a class=page-link>" + i + "</a>" +
                                                                    "</li>";
                                                                /*$(".pagination").append(page);*/
                                                            }else{
                                                                page += "<li class='list'" + ">" +
                                                                    "<a class='page-link'>" + i + "</a>" +
                                                                    "</li>";
                                                            }
                                                    }
                                                    /*
                                                    * 下一页
                                                    * */
                                                    page += "<li class='xy'><a class='page-link'>&raquo;</a></li>";
                                                    $(".pagination").append(page);

                                                    $(".list").click(function () {
                                                        //
                                                        ajaxtest(obj,a,$(this).text());
                                                        /*alert("this.vla"+$(this).text());*/
                                                    })

                                                    /*
                                                    * 上一页
                                                    * */
                                                    $(".sy").click(function () {
                                                        if(jsonData.nowPage>1){
                                                            var page = parseInt($(this).text())-1;
                                                            ajaxtest(obj,a,page);
                                                        }
                                                    })


                                                    /**
                                                     * 下一页
                                                     * */
                                                    $(".xy").click(function () {
                                                        if(jsonData.nowPage<totalPage){//如果小于最大的页数则将当前页数加1并传给服务器，如果不是就什么都不做
                                                            var page = parseInt($(this).text())+1;
                                                            ajaxtest(obj,a,page);
                                                        }
                                                    })

                                                }
                                            },
                                        });
                                }

                            </script>

                        </ul>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link active">
                            <i class="nav-icon fa fa-th"></i>
                            <p>
                                导出文件
                            </p>
                        </a>
                    </li>
                </ul>
            </nav>
            <!-- /.sidebar-menu -->
        </div>
        <!-- /.sidebar -->
    </aside>


    <%--Content表格内容--%>
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <div class="container-fluid">
                <div class="row mb-2">
                    <div class="col-sm-6">
                        <h1>Data Tables</h1>
                    </div>
                    <div class="col-sm-6">
                        <ol class="breadcrumb float-sm-right">
                            <input type="time" name="lateTimes" id="lateTimes"><a
                                href="${pageContext.request.contextPath}/findAllStu.action"> 设置迟到时间</a>
                        </ol>
                    </div>
                </div>
            </div><!-- /.container-fluid -->
        </section>

        <!-- Main content -->
        <section class="content">
            <div class="row">
                <div class="col-12">
                    <div class="card">
                        <div class="card-header">
                            <%--<c:forEach items="${stuxx}" var="onclass_id" end="0">--%>
                            <h3 class="card-title">班级：${classID}班</h3>
                            <%--</c:forEach>--%>
                        </div>
                        <!-- /.card-header -->
                        <div class="card-body">
                            <table id="example2" class="table table-bordered table-hover">
                                <thead id="th1">
                                <%--<tr>
                                    &lt;%&ndash;基本信息查询&ndash;%&gt;
                                    <c:if test="${pageUtil!=null}">
                                        <th>学号</th>
                                        <th>学生姓名</th>
                                        <th>手机MAC地址</th>
                                        <th>迟到时间</th>
                                        <th>是否迟到</th>
                                    </c:if>
                                    &lt;%&ndash;首页显示&ndash;%&gt;
                                </tr>--%>
                                </thead>
                                <tbody id="test1">
                                <%--循环遍历学生信息--%>
                                <%--基本信息--%>
                                <%--<c:if test="${pageUtil!=null}">
                                    <c:forEach items="${pageUtil.content}" var="stuxx">
                                        <tr>
                                            <td>${stuxx.stuid}</td>
                                            <td>${stuxx.stuname}</td>
                                            <td>${stuxx.phoneIp}</td>
                                            <td>${stuxx.latetimes}</td>
                                            <td>${stuxx.islate}</td>
                                        </tr>
                                    </c:forEach>
                                </c:if>--%>

                                </tbody>
                            </table>
                            <table id="example3" class="table table-bordered table-hover">
                                <thead id="th2">
                                <%--<tr>
                                    &lt;%&ndash;详情&ndash;%&gt;
                                        <th>学号</th>
                                        <th>学生姓名</th>
                                        <th>手机MAC地址</th>
                                        <th>迟到时间</th>
                                        <th>是否迟到</th>
                                </tr>--%>
                                </thead>

                                <tbody id="test2">
                                <%--循环遍历学生信息--%>
                                <%--基本信息--%>

                                       <%-- <tr>
                                            <td>${vol.content.stuid}</td>
                                            <td>${vol.content.stuname}</td>
                                            <td>${vol.content.phoneIp}</td>
                                            <td>${vol.content.latetimes}</td>
                                            <td>${vol.content.islate}</td>
                                        </tr>--%>

                                </tbody>


                            </table>
                        </div>
                        <!-- /.card-body -->

                        <div class="card-footer clearfix">
                            <ul class="pagination pagination-sm m-0 float-right">
                                   <%-- <li class="">
                                        <a href="" class="page-link" id="page"></a>
                                    </li>--%>
                            </ul>
                        </div>
                    </div>
                </div>
                <!-- /.col -->
            </div>
            <!-- /.row -->
        </section>
        <!-- /.content -->
    </div>


</div>
<!-- ./wrapper -->

<!-- jQuery -->
<script src="${pageContext.request.contextPath}/static/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="${pageContext.request.contextPath}/static/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath}/static/dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="${pageContext.request.contextPath}/static/dist/js/demo.js"></script>

</body>
</html>
