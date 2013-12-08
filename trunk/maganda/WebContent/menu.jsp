<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Maganda Huacho</title>
<link rel="stylesheet" type="text/css" href="css/form.css"/>
</head>

<body style="background-color: #FCD997"> 
<div align="right" style="font-family: serif;font-size: small;">
	<a href="<c:url value="j_spring_security_logout" />" >[Cerrar sesi&oacute;n]</a>
</div>
<div align="center" class="tituloMenu">M&Oacute;DULO PRINCIPAL</div>
<table align="center" border="0" width="800px">
	<tr>
		<td><a href="${pageContext.request.contextPath}/listarVenta.mgd"><img src="<c:url value="/img/venta.png"/>" height="100" width="100" style="border: 0"></a></td>
		<td><div class="itemMenu">Ventas</div></td>
		<td><!-- a href="${pageContext.request.contextPath}/listarGasto.mgd" --><img src="<c:url value="/img/gasto.png"/>" height="100" width="100" style="border: 0"><!--  /a --></td>
		<td><div class="itemMenu">Gastos</div></td>
	</tr>
	<tr>
		<td><a href="${pageContext.request.contextPath}/listarProducto.mgd"><img src="<c:url value="/img/producto.png"/>" height="100" width="100" style="border: 0"></a></td>
		<td><div class="itemMenu">Productos</div></td>
		<td><!-- a href="${pageContext.request.contextPath}/listarCategoria.mgd" --><img src="<c:url value="/img/categoria.png"/>" height="100" width="100" style="border: 0"><!--  /a --></td>
		<td><div class="itemMenu">Categor&iacute;as</div></td>
	</tr>
	<tr>
		<td><a href="${pageContext.request.contextPath}/listarCliente.mgd"><img src="<c:url value="/img/cliente.png"/>" height="100" width="100" style="border: 0"></a></td>
		<td><div class="itemMenu">Clientes</div></td>
		<td><a href="${pageContext.request.contextPath}/listarMarca.mgd"><img src="<c:url value="/img/marca.png"/>" height="100" width="100" style="border: 0"><!-- /a --></td>
		<td><div class="itemMenu">Marcas</div></td>
	</tr>
	<tr>
		<td><a href="${pageContext.request.contextPath}/listarProveedor.mgd"><img src="<c:url value="/img/proveedor.png"/>" height="100" width="100" style="border: 0"></a></td>
		<td><div class="itemMenu">Proveedores</div></td>
		<td><!-- a href="${pageContext.request.contextPath}/listarColor.mgd" --><img src="<c:url value="/img/color.png"/>" height="100" width="100" style="border: 0"><!-- /a --></td>
		<td><div class="itemMenu">Colores</div></td>
	</tr>
	<tr>
		<td><a href="${pageContext.request.contextPath}/listarMobiliario.mgd"><img src="<c:url value="/img/mobiliario.png"/>" height="100" width="100" style="border: 0"></a></td>
		<td><div class="itemMenu">Mobiliarios</div></td>
		<td><!--<a href="${pageContext.request.contextPath}/listaReporte.mgd">--><img src="<c:url value="/img/reporte.png"/>" height="100" width="100" style="border: 0"></a></td>
		<td><div class="itemMenu">Reportes</div></td>
	</tr>
</table>
</body>
</html>