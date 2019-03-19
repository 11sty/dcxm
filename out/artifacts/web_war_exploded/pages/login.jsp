<%--
  Created by IntelliJ IDEA.
  User: 大哥
  Date: 2019/2/26
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>学生考勤系统</title>
    <!--<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/styles/navigation.css">-->
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/dist/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/dist/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/dist/css/adminlte.min.css">
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head>
<body id="bodybg",bgcolor="#F4F4F4">

<div class="login-box">
    <div class="login-logo">
        <b>学生考勤系统</b>
    </div>
    <div class="card">
        <div class="card-body login-card-body" id="row">
            <p class="login-box-msg">
                <b>login</b>
            </p>
            <!--<form action="${pageContext.request.contextPath}/login.action" method="post" style="border:3px solid black;background-color: #dddddd" id="t1">-->
            <!--  <h1>login</h1><br>-->
            <!--<img id="img" src="${pageContext.request.contextPath}/static/images/account.png" align="left">-->
            <!--Username:<input type="text" name="username"><br>
             Password:<input type="password" name="password"><br>-->

            <form action="${pageContext.request.contextPath}/login.action" onsubmit="return login();" method="post">
                <div class="form-group">
                    <div class="alert alert-danger" style="display: none;">错误信息展示栏。</div>
                </div>
                <div class="form-group has-feedback">
                    <span class="fa fa-user form-control-feedback"></span>
                    <input type="text" id="userName" name="username" class="form-control" placeholder="默认账号：admin">
                </div>
                <div class="form-group has-feedback">
                    <span class="fa fa-lock form-control-feedback"></span>
                    <input type="password" id="password" name="password" class="form-control" placeholder="默认密码：123456">
                </div>
                <div class="form-group has-feedback">
                    <label for="validateCode" class="col-sm-3 control-label">验证码</label>
                    <input type="text" class="form-control" id="validateCode" name="member_vericode">
                    <img id="loginform:vCode" src="${pageContext.request.contextPath}/code.action"
                         onclick="this.src='/code.action?d='+Math.random();" />
                </div>


                <!-- <input type="submit" name="submit" id="login" onclick="this.disabled=true; this.value='登录中...'; this.form.submit();" value="登录" ><br>-->
                <div class="row">
                    <div class="col-8">
                        <div class="checkbox icheck">
                            <label>
                                <input type="checkbox"> 记住我
                            </label>
                        </div>
                    </div>
                    <!-- /.col -->
                    <div class="col-4">
                        <input type="submit" onclick="return Cmd();" class="btn btn-primary btn-block btn-flat" value="登陆">
                        </input>
                    </div>
                    <!-- /.col -->
                </div>

            </form>
        </div>
    </div>
</div>

</body>
<!-- jQuery -->
<script src="${pageContext.request.contextPath}/static/dist/js/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="${pageContext.request.contextPath}/static/dist/js/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="${pageContext.request.contextPath}/static/dist/js/public.js"></script>
<script>
    function Cmd(){
        var ipt = document.getElementById("row").getElementsByTagName("input"); //查找divbox这个div里的所有文本框
        for(var i = 0; i < ipt.length; i++){ //循环
            if(ipt[i].value.length == 0){ //如果其中一个文本框没有填写
                alert("所有文本框都需要填写"); //弹出提示
                ipt[i].focus(); //定位到没有填写的文本框
                return false; //返回false
            }
        }
        return true; //都已经填写，返回true
    }
</script>
<%--<script>

    function Login() {

        var userName = document.getElementById("userName").value;//通过id获取需要验证的表单元素的值);
        var password = document.getElementById("password").value;
        if (isNull(userName)) {
            showErrorInfo("请输入用户名!");
            return;
        }
        if (!validUserName(userName)) {
            showErrorInfo("请输入正确的用户名!");
            return;
        }
        if (isNull(password)) {
            showErrorInfo("请输入密码!");
            return;
        }
        if (!validPassword(password)) {
            showErrorInfo("请输入正确的密码!");
            return;
        }
        var data = {"userName": userName, "password": password}
        $.ajax({
            type: "POST",//方法类型
            dataType: "json",//预期服务器返回的数据类型
            url: "users/login",
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify(data),
            success: function (result) {
                if (result.resultCode == 200) {
                    $('.alert-danger').css("display", "none");
                    setCookie("token", result.data.userToken);
                    alert("登录成功");
                    window.location.href = "/";
                }
                ;
                if (result.resultCode == 500) {
                    showErrorInfo("登陆失败!请检查账号和密码！");
                    return;
                }
            },
            error: function () {
                $('.alert-danger').css("display", "none");
                showErrorInfo("接口异常，请联系管理员！");
                return;
            }
        });
    }
</script>--%>
</html>