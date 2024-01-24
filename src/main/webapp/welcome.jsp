<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
<%
HttpSession session1 = request.getSession(false);

if(session1!= null && session1.getAttribute("userName") != null)
{
	String userName = (String) session1.getAttribute("userName");


%>

<h1>Welcome, <%= userName %></h1>

<a href="LoginServlet">LogOut</a>
<%
}else{
	response.sendRedirect("index.html");
}
%>



</body>
</html>