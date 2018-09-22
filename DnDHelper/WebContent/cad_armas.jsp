<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de armas</title>
</head>
<body>
	<div id='container' class='container'>
		<div id='formCadArmas' class='formCadArmas'>
			<form method="post" align="center" action='<%=request.getContextPath()%>/CadastraArmas'>
				<label>Nome da Arma: </label><br>
				<input type="text" name='wpnName'  class='somente-numero'/><br>
				<label>Tipo de Dado: </label><br>
				<input type="number" name='wpnDice' class='somente-numero'/><br>
				<label>Numero de Dados: </label><br>
				<input type="number" name='wpnNumDice' class='somente-numero'/><br>
				<label>Efeito da arma: </label><br>
				<input type="text" name='wpnEffect' class='somente-numero'/><br>
				<input type="submit">
			</form>
		</div>
	</div>

</body>
</html>