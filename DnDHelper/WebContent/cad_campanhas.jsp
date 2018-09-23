<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="DnDHelper.UserDnD" %>
<%-- <%@page import="" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de campanhas</title>
<%
	UserDnD user = new UserDnD();
	user = (UserDnD)session.getAttribute("user");
	
%>
</head>
<body>
	<div id='container' class='container'>
		<div id='form-campanha' class='form-campanha'>
			<form action='<%=request.getContextPath()%>/CadastrarCampanhas' method="post">
				<label>Nome da Campanha: </label>
				<input type="hidden" value='<%=user.getCod() %>' name='userCod'/>
				<input type="text" name='campName'/>
				<input type="submit" /> 
			</form>
		</div>
	</div>
</body>
</html>