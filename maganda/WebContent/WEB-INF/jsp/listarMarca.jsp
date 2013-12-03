<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@page session="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/lista.css"/>">
<title>Lista de Marcas</title>
</head>
<body>
	<div align="right" style="font-family: serif;font-size: small;">
		<a href="<c:url value="/menu.jsp"/>">[Menu Principal]</a>&nbsp;
		<a href="<c:url value="/registrarMarca.mgd"/>">[Registrar nueva marca]</a>&nbsp;
		<a href="<c:url value="j_spring_security_logout" />" >[Cerrar sesi&oacute;n]</a>
	</div>
	
	<div align="center">
		<table class="container">
			<caption>Lista de Marca</caption>
			<thead>
				<th align="center">C&oacute;digo Marca</th>
				<th align="center">Nombre</th>
				<th align="center">Estado</th>
				<th align="center">Fecha de registro</th>
				<th align="center">Modificar</th>
			</thead>
			<c:forEach var="marca" items="${lstMarca}">
				<tr>

					<td align="center">${marca.idmarca}</td>
					<td align="left">${marca.nombre}</td>
					<td align="left">${marca.estado}</td>
					<td align="center"><fmt:formatDate pattern="dd/MM/yyyy" value="${marca.fecregistro}" /></td>
					<td align="center"><a href="<c:url value="/consultarMarca.mgd?idmarca="/>${marca.idmarca}">Modificar</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>