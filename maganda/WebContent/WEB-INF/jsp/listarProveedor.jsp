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
<title>Lista de Proveedores</title>
</head>
<body>
	<div align="right" style="font-family: serif;font-size: small;"><a href="<c:url value="/registrarProveedor.mgd"/>">Registrar nuevo proveedor</a></div>
	<div align="center">
		<table class="container">
			<caption>Lista de Proveedores</caption>
			<thead>
				<th align="center">C&oacute;digo Proveedor</th>
				<th align="center">Tipo de Documento</th>
				<th align="center">N&uacute;mero de Documento</th>
				<th align="center">Nombre / Raz&oacute;n Social</th>
				<th align="center">Direcci&oacute;n</th>
				<th align="center">N&uacute;mero de Tel&eacute;fono</th>
				<th align="center">Modificar</th>
				<th align="center">Eliminar</th>
			</thead>
			<c:forEach var="proveedor" items="${lstProveedor}">
				<tr>

					<td align="center">${proveedor.idproveedor}</td>
					<td align="center">${proveedor.desdocumento}</td>
					<td align="center">${proveedor.numdocumento}</td>
					<td align="center">${proveedor.apepaterno} ${proveedor.apematerno} ${proveedor.nombres}</td>
					<td align="left">${proveedor.direccion}</td>
					<td align="left">${proveedor.numtelefono}</td>
					<td align="center"><a href="<c:url value="/consultarProveedor.mgd?idproveedor="/>${proveedor.idproveedor}">Modificar</a></td>
					<td align="center"><a href="<c:url value="/eliminarProveedor.mgd?idproveedor="/>${proveedor.idproveedor}">Eliminar</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>