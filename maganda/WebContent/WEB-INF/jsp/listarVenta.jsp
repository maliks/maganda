<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@page session="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/lista.css"/>">
<title>Lista de Ventas</title>

<script type="text/javascript">

	function validarRegistro(){
		var mensaje = '<c:if test="${not empty ventaMap.Mensaje}"><c:out value="${ventaMap.Mensaje}"/></c:if>';
		if(mensaje != "") alert (mensaje);
	}

</script>

</head>
<body onload="validarRegistro()">
	<div align="right" style="font-family: serif;font-size: small;">
		
		<a href="<c:url value="/menu.jsp"/>">[Menu Principal]</a>&nbsp;
		<a href="<c:url value="/iniciarVenta.mgd"/>">[Registrar nuevo venta]</a>&nbsp;
		<a href="<c:url value="j_spring_security_logout" />" >[Cerrar sesi&oacute;n]</a>
	
	</div>
	
	<div align="center">
		<table>
			<caption>Lista de ventas realizadas</caption>
			<thead>
				<th align="center">Tip. Doc. Venta</th>
				<th align="center">Num. Venta</th>
				<th align="center">Tip. Doc. Cliente</th>
				<th align="center">Num. Cliente</th>
				<th align="center">Nombre / Raz&oacute;n Social</th>
				<th align="center">Descuento</th>
				<th align="center">IGV</th>
				<th align="center">Total</th>
				<th align="center">Fec. Venta</th>
				<th align="center">Fec. Registro</th>
				<th align="center">Ver detalle</th>
				<th align="center">Eliminar</th>
			</thead>
			<c:forEach var="venta" items="${ventaMap.lstVenta}">
				<tr>

					<td align="center">${venta.desDocVenta}</td>
					<td align="right">${venta.numventa}</td>
					<td align="center">${venta.desDocCliente}</td>
					<td align="right">${venta.numDocCliente}</td>
					<td align="left">${venta.nomCliente}</td>
					<td align="right"><fmt:formatNumber type="number" pattern="###,##0.00" value="${venta.mondescuento}" /></td>
					<td align="right"><fmt:formatNumber type="number" pattern="###,##0.00" value="${venta.monigv}" /></td>
					<td align="right"><fmt:formatNumber type="number" pattern="###,##0.00" value="${venta.monTotal}" /></td>
					<td align="center"><fmt:formatDate pattern="dd/MM/yyyy" value="${venta.fecventa}" /></td>
					<td align="center"><fmt:formatDate pattern="dd/MM/yyyy" value="${venta.fecregistro}" /></td>
					<td align="center"><a href="<c:url value="/consultarVenta.mgd?iddocumento="/>${venta.iddocumento}&numventa=${venta.numventa}">Ver detalle</a></td>
					<td align="center"><a href="<c:url value="/eliminarVenta.mgd?iddocumento="/>${venta.iddocumento}&numventa=${venta.numventa}">Eliminar</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>