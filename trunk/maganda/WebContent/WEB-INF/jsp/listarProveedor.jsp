<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@page session="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<META http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/app.css"/>">
	<title>Lista de Clientes</title>
</head>	
<body>
	<a href="<c:url value="/registrarCliente.mgd"/>">Registrar Nuevo Cliente</a>
	<h1>Lista de Clientes</h1>
	<table class="container">
		<tr>
			<th>Codigo Cliente</th>
			<th>Nombres</th>
			<th>Direccion</th>
			<th>Modificar</th>
			<th>Eliminar</th>
		</tr>
		<c:forEach var="cliente" items="${lstCliente}">
		<tr>
		
			<td>${cliente.idcliente}</td>
			<td>${cliente.apepaterno} ${cliente.apematerno} ${cliente.nombres}</td>
			<td>${cliente.direccion}</td>
			<td><a href="<c:url value="/consultarCliente.mgd?idcliente="/>${cliente.idcliente}">Modificar</a></td>
			<td><a href="<c:url value="/eliminarCliente.mgd?idcliente="/>${cliente.idcliente}">Eliminar</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>