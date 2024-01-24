<%@page import="java.text.NumberFormat.Style"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<h1>Login</h1>

<form action="LoginServlet" method="post">

<div style="display: flex; flex-direction: column; width: 50vh; gap:10px;">

<input type="text" id="userName" name="userName" placeholder="Enter your Name" required="required">
<input type="password" id="password" name="password" placeholder="Enter your Password" required="required">

<button type="submit">Login</button>
<a href="index.html">Home</a>
</div>
</form>

<%--Error Message --%>
<% String error = request.getParameter("error");
   if(error != null && error.equals("1"))
   { %>
	   <p style="color: red;"> Invalid Username or Password</p> 
  <% }%> 
	   

</body>
</html>