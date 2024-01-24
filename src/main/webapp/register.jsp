<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
<h1>Register</h1>
<form action="RegisterServlet" method="post">
<div style="display: flex; flex-direction: column; width: 50vh; gap:10px;">
<input type="text" id="userName" name="userName" placeholder="Enter your Name" required="required">
<input type="email" id="email" name="email" placeholder="Enter your Email" required="required">
<input type="password" id="password" name="password" placeholder="Enter your Password" required="required">

<button type="submit">Register</button>
<a href="index.html">Home</a>
</div>
</form>

</body>
</html>