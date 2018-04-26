<%-- 
    Document   : MainHome
    Created on : 2018-4-26, 13:59:02
    Author     : admin
--%>

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <title>首页</title>  
  </head>  
  <body>  
      ${xiaoxi} <br>    
            <a href="SearchAllServlet">查看所有用户</a>  
            
  </body>  
</html> 
