<%@ page language="java" import="java.util.*,com.company.entiy.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Users.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <%
       List<Users> list = (List<Users>) request.getAttribute("list");
     %>
  </head>
  
  <body>
     <table border="2" cellspacing="0">
         <tr>
            <th>sid</th>
            <th>sname</th>
            <th>sage</th>
            <th>saddress</th>
            <th>simage</th>
         </tr>
         <% for(int i = 0;i < list.size(); i ++){%>
           <tr>
               <td><%=list.get(i).getSid() %></td>
               <td><%=list.get(i).getSname() %></td>
               <td><%=list.get(i).getSage() %></td>
               <td><%=list.get(i).getSaddress() %></td>
               <td><img src=<%="/headimage/".concat(list.get(i).getSimage()) %>></img></td>
           </tr>
         <%}%>
     </table>
  </body>
</html>
