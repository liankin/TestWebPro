<%-- 
    Document   : login
    Created on : 2018-4-26, 11:31:32
    Author     : admin
--%>

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <title>登录页面</title>  
  </head>  
  <body >  
         <form action="LoginServlet"  method="post"  style="padding-top:-700px;">  
        用户名：<input type="text" name="name"value=""><br><br>  
        密码：  <input type="password" name="pwd"value=""><br><br>  
                    <input type="submit"value="登录"name="denglu"><input type="reset"value="重置"><br>  
     </form>  
     <form action="register.jsp">  
        <input type="submit"value="新用户注册">  
         </form>  
      
  </body>  
</html>  