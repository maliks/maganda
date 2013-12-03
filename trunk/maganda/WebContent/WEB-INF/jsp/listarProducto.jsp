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
<title>Lista de Productos</title>
</head>
<body>

	<div align="right" style="font-family: serif;font-size: small;">
		
		<a href="<c:url value="/menu.jsp"/>">[Menu Principal]</a>&nbsp;
		<a href="<c:url value="/registrarProducto.mgd"/>">[Registrar nuevo producto]</a>&nbsp;
		<a href="<c:url value="j_spring_security_logout" />" >[Cerrar sesi&oacute;n]</a>
	</div>
	
	<div align="center">
		<table class="container">
			<caption>Lista de Productos</caption>
			<thead>
				<th align="center">C&oacute;digo de producto</th>
				<th align="center">Nombre</th>
				<th align="center">Categor&iacute;a</th>
				<th align="center">Talla</th>
				<th align="center">Color</th>
				<th align="center">Tip. Doc. Compra</th>
				<th align="center">Num. Compra</th>
				<th align="center">Fec. Compra</th>
				<th align="center">Costo</th>
				<th align="center">Precio</th>				
				<th align="center">Estado</th>
				<th align="center">Modificar</th>
			</thead>
			<c:forEach var="producto" items="${lstProducto}">
				<tr>

					<td align="center">${producto.codproducto}</td>
					<td align="left">${producto.nombre}</td>
					<td align="center">${producto.desCategoria}</td>
					<td align="center">${producto.talla}</td>
					<td align="center">${producto.desColor}</td>
					<td align="center">${producto.desDocTipCompra}</td>
					<td align="center">${producto.numcompra}</td>
					<td align="center"><fmt:formatDate pattern="dd/MM/yyyy" value="${producto.feccompra}" /></td>
					<td align="right"><fmt:formatNumber type="number" pattern="###,##0.00" value="${producto.moncosto}" /></td>
					<td align="right"><fmt:formatNumber type="number" pattern="###,##0.00" value="${producto.monventa}" /></td>
					<td align="center">${producto.desEstado}</td>
					<td align="center"><a href="<c:url value="/consultarProducto.mgd?idproducto="/>${producto.idproducto}">Modificar</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>