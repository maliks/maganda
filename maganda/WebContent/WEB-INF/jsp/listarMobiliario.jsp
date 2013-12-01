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
<title>Lista de Mobiliarios</title>
</head>
<body>
	<div align="right" style="font-family: serif;font-size: small;"><a href="<c:url value="/registrarMobiliario.mgd"/>">Registrar nuevo mobiliario</a></div>
	<div align="center">
		<table class="container">
			<caption>Lista de Mobiliarios</caption>
			<thead>
				<th align="center">C&oacute;digo Mobiliario</th>
				<th align="center">Nombre</th>
				<th align="center">Descripci&oacute;n</th>
				<th align="center">Cantidad</th>
				<th align="center">Fecha de compra</th>
				<th align="center">Precio unitario</th>
				<th align="center">Sub - Total</th>
				<th align="center">Modificar</th>
				<th align="center">Eliminar</th>
			</thead>
			<c:forEach var="mobiliario" items="${lstMobiliario}">
				<tr>

					<td align="center">${mobiliario.idmobiliario}</td>
					<td align="left">${mobiliario.nombre}</td>
					<td align="left">${mobiliario.descripcion}</td>
					<td align="right">${mobiliario.cantidad}</td>
					<td align="center"><fmt:formatDate pattern="dd/MM/yyyy" value="${mobiliario.feccompra}" /></td>
					<td align="right"><fmt:formatNumber type="number" pattern="###,##0.00" value="${mobiliario.monto}" /></td>
					<td align="right"><fmt:formatNumber type="currency" currencySymbol="S/."  currencyCode="USD" pattern="###,##0.00" value="${mobiliario.monto*mobiliario.cantidad}" /></td>
					<td align="center"><a href="<c:url value="/consultarMobiliario.mgd?idmobiliario="/>${mobiliario.idmobiliario}">Modificar</a></td>
					<td align="center"><a href="<c:url value="/eliminarMobiliario.mgd?idmobiliario="/>${mobiliario.idmobiliario}">Eliminar</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>