<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@page session="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="
		<c:url value="/css/lista.css"/>
		">
		<link rel="stylesheet" type="text/css" href="
		<c:url value="/css/form.css"/>
		">
		<link rel="StyleSheet" type="text/css" href="js/dijit/themes/nihilo/nihilo.css">
		<script type="text/javascript">
			var djConfig = {
				baseScriptUri : "js/",
				parseOnLoad : true
			};
		</script>
		<script type="text/javascript" src="js/dojo/dojo.js"></script>
		<script>
			dojo.require("dojo.parser");
			dojo.require("dijit.form.Form");
			dojo.require("dijit.form.Button");
			dojo.require("dijit.form.ValidationTextBox");
			dojo.require("dijit.form.DateTextBox");
			dojo.require("dijit.form.FilteringSelect");
			dojo.require("dijit.form.Textarea");
			dojo.require("dijit.form.SimpleTextarea");
			dojo.require("dijit.form.NumberTextBox");
			dojo.require("dijit.form.DateTextBox");
		</script>
		<script type="text/javascript">
			function volver(){
				window.location.href = "${pageContext.request.contextPath}/listarVenta.mgd";
			}
			
			function agregarProducto(){
				document.getElementById("myForm").action = "${pageContext.request.contextPath}/buscarProducto.mgd";
				document.getElementById("myForm").submit();
			}
			
		</script>
		<title>Carrito de Venta</title>
	</head>
	<body class="nihilo">
		<div align="center">
			<div class="tituloFormulario">Venta de Productos</div>
			<div dojoType="dijit.form.Form" id="myForm" jsId="myForm" action="${pageContext.request.contextPath}/realizarVenta.mgd" method="post">
				<script type="dojo/method" event="onSubmit">
					if (this.validate()<c:if test="${empty venta.lstDetalleVenta}"> && false</c:if>) {
						return true;
					} else {
						alert('Por favor, ingrese los datos solicitados. Agregue al menos un producto');
						return false;
					}
					return true;
				</script>
				<fieldset class="estiloFieldset">
					<legend>Informacion general</legend>
					<input type="text" value="Cliente:" style="text-align: right;border-width: 0px;width: 200px">
					<select
						name="cboIdCliente"
						id="cboIdCliente"
						dojoType="dijit.form.FilteringSelect"
						autocomplete="true"
						required="true"
						value="${venta.idCliente}"
						pageSize=5
						style="width:350px"
						>
						<c:forEach var="cliente" items="${venta.lstCliente}">
							<option value="${cliente.idcliente}">${cliente.apepaterno} ${cliente.apematerno} ${cliente.nombres}</option>
						</c:forEach>
					</select>
					</br>
					<input type="text" value="Tipo de documento:" style="text-align: right;border-width: 0px;width: 200px">
					<select
						name="cboIdDocumento"
						id="cboIdDocumento"
						dojoType="dijit.form.FilteringSelect"
						autocomplete="true"
						required="true"
						value="${venta.idDocumento}"
						>
						<option value="10">Factura</option>
						<option value="11">Boleta de venta</option>
					</select>
					</br>
					<input type="text" value="Numero de documento:" style="text-align: right;border-width: 0px;width: 200px">
					<input
						type="text"
						name="txtNumeroDocumento"
						id="txtNumeroDocumento"
						required="true"
						trim="true"
						value="${venta.numeroDocumento}"
						maxlength="30"
						dojoType="dijit.form.ValidationTextBox"
						/>
					</br>
					<input type="text" value="Fecha de venta:" style="text-align: right;border-width: 0px;width: 200px">
					<input type="text" name="fecVenta" id="fecVenta" dojoType="dijit.form.DateTextBox" required="true" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${venta.fecVenta}" />" />
				</fieldset>
				</br>
				<button dojoType="dijit.form.Button" iconClass="dijitEditorIcon dijitEditorIconSave" type="submit" name="submitButton" value="Submit">Registrar venta</button>
				<button dojoType="dijit.form.Button" iconClass="dijitEditorIcon dijitEditorIconInsertUnorderedList" type="button" onclick="agregarProducto()">Agregar producto</button>
				<button dojoType="dijit.form.Button" iconClass="dijitEditorIcon dijitEditorIconUndo" type="button" onclick="volver()">Volver</button>
			</div>
			<table>
				<caption>Lista de productos seleccionados</caption>
				<thead>
					<th align="center">Nombre</th>
					<th align="center">Cantidad</th>
					<th align="center">Precio</th>
					<th align="center">Descuento</th>
					<th align="center">Sub - Total</th>
					<th align="center">Quitar</th>
				</thead>
				<c:forEach var="carrito" items="${venta.lstDetalleVenta}">
					<tr>
						<td align="left">${carrito.nomProducto}</td>
						<td align="right">${carrito.cantidad}</td>
						<td align="right">
							<fmt:formatNumber type="number" pattern="###,##0.00" value="${carrito.monto}" />
						</td>
						<td align="right">
							<fmt:formatNumber type="number" pattern="###,##0.00" value="${carrito.descuento}" />
						</td>
						<td align="right">
							<fmt:formatNumber type="number" pattern="###,##0.00" value="${(carrito.monto-carrito.descuento)*carrito.cantidad}" />
						</td>
						<td align="center"><a href="<c:url value="/quitarProducto.mgd?idproducto="/>${carrito.idproducto}">Quitar</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</body>
</html>