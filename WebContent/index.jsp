<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<title>Login</title>
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<section class="contenedor">
	<div class="estiloDiv">
		<h1>Bienvenido</h1>
		<form action="ValidaLogin" method="get">
			<p><input name="usuario" type="text" required="required" placeholder="Usuario"></p>
			<p><input name="password" type="password" required="required" placeholder="Contrasenia"></p>
			<p class="msjError"><input type="submit" value="entrar"></p>
		</form>
	</div>
	</section>
</body>
</html>