<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@page session="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<META http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/lista.css"/>">
	<title>Lista de Clientes</title>
</head>	
<body>
	
	<div align="right" style="font-family: serif;font-size: small;">		
		<a href="<c:url value="/menu.jsp"/>">[Menu Principal]</a>&nbsp;
		<a href="<c:url value="/registrarCliente.mgd"/>">[Registrar nuevo cliente]</a>&nbsp;
		<a href="<c:url value="j_spring_security_logout" />" >[Cerrar sesi&oacute;n]</a>
	</div>
	
	<div align="center">

	<table class="container">
	<caption>Lista de Clientes</caption>
		<thead>
			<th>C&oacute;digo Cliente</th>
			<th align="center">Tipo de Documento</th>
			<th align="center">N&uacute;mero de Documento</th>
			<th align="center">Nombre / Raz&oacute;n Social</th>
			<th align="center">Direcci&oacute;n</th>
			<th align="center">N&uacute;mero de Tel&eacute;fono</th>
			<th>Modificar</th>
		</thead>
		<c:forEach var="cliente" items="${lstCliente}">
		<tr>
		
			<td align="center">${cliente.idcliente}</td>
			<td align="center">${cliente.desdocumento}</td>
			<td align="center">${cliente.numdocumento}</td>
			<td align="left">${cliente.apepaterno} ${cliente.apematerno} ${cliente.nombres}</td>
			<td align="left">${cliente.direccion}</td>
			<td align="center">${cliente.numtelefono}</td>
			<td align="center"><a href="<c:url value="/consultarCliente.mgd?idcliente="/>${cliente.idcliente}">Modificar</a></td>
		</tr>
		</c:forEach>
	</table>
	
	</div>
</body>
</html>