<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DnD Helper</title>
</head>
<body>
<%

%>

<div id='container' class='container'>
	<div id='login-form' class='login-form' >
		<form align="center" method="post" action='<%=request.getContextPath() %>/ServletLogin'	>
			<label>User: </label><br>
			<input type="text" name='user' label='usuario'/><br>
			<label>Pass:</label><br>
			<input type="password" name='pwd'><br>
			<input type="submit">
		</form>
	</div>
</div>
</body>
</html>