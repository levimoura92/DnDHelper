<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="DnDHelper.UserDnD"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DnD Helper</title>
</head>
<body>
	<div id='body' class='body'>
		<div id='linksPrincipais' class='linksPrincipais' align='center'>
			<%UserDnD userDnD = (UserDnD) session.getAttribute("user");%>
			Welcome <%=userDnD.getNome() %>:<br>
			<a href='cad_armas.jsp'>cadastro de armas</a><br>
			<a href='cad_magias.jsp'>cadastro de magias</a><br>
			<a href='cad_players.jsp'>cadastro de players</a><br>
			<a href='cad_campanhas.jsp'>cadastro de campanhas</a>	<br>					
		</div>
	</div>
</body>
</html>