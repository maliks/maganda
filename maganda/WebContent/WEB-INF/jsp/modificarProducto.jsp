<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modificar datos del producto</title>

<link rel="StyleSheet" type="text/css" href="js/dijit/themes/nihilo/nihilo.css"/>
<link rel="stylesheet" type="text/css" href="css/form.css"/>

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
		window.location.href = "${pageContext.request.contextPath}/listarProducto.mgd";
	}
	
</script>

</head>
<body class="nihilo">
	<div align="center" class="tituloFormulario">Modificar datos del producto</div>
	<div align="center">
	<fieldset class="estiloFieldset">	
	<div dojoType="dijit.form.Form" id="myForm" jsId="myForm" action="${pageContext.request.contextPath}/grabarProducto.mgd" method="post">
	
	<script type="dojo/method" event="onReset">
			return true;
	</script>

	<script type="dojo/method" event="onSubmit">
			if (this.validate()) {
				return true;
			} else {
				alert('Por favor, ingrese los datos solicitados');
				return false;
			}
			return true;
	</script>
	
		<table width="600" border="0" align="center" height="350px">
			
			<tr>
				<td align="right">Identificador del producto:</td>
				<td align="left">
					<input
						type="text"
						name="txtIdProducto"
						id="txtIdProducto"
						required="true"
						value="<c:out value="${mapProducto.producto.idproducto}"/>"
						readonly="readonly"
						dojoType="dijit.form.ValidationTextBox"
					/>
				</td>
			</tr>
			
			<tr>
				<td align="right">C&oacute;digo del producto:</td>
				<td align="left">
					<input
						type="text"
						name="txtCodigoProducto"
						id="txtCodigoProducto"
						required="true"
						trim="true"
						value="<c:out value="${mapProducto.producto.codproducto}"/>"
						uppercase="true"
						readonly="readonly"
						maxlength="30"
						dojoType="dijit.form.ValidationTextBox"
					/>
				</td>
			</tr>
			
			<tr>
				<td align="right">Nombre del producto:</td>
				<td align="left">
					<input
						type="text"
						name="txtNombreProducto"
						id="txtNombreProducto"
						required="true"
						trim="true"
						uppercase="true"
						value="<c:out value="${mapProducto.producto.nombre}"/>"
						maxlength="250"
						dojoType="dijit.form.ValidationTextBox"
					/>
				</td>
			</tr>
			
			<tr>
				<td align="right">Descripci&oacute;n del producto:</td>
				<td align="left">
					<input
						type="text"
						name="txtDescripcionProducto"
						id="txtDescripcionProducto"
						required="true"
						trim="true"
						value="<c:out value="${mapProducto.producto.descripcion}"/>"
						uppercase="true"
						maxlength="250"
						dojoType="dijit.form.ValidationTextBox"
					/>
				</td>
			</tr>
			
			<tr>
				<td align="right">Talla:</td>
				<td align="left">
					<select name="cboTalla" id="cboTalla" dojoType="dijit.form.FilteringSelect" value="<c:out value="${mapProducto.producto.talla}"/>" autocomplete="true" required="true">
							<option value="XS">X-SMALL</option>
							<option value="S">SMALL</option>
							<option value="M">MEDIUM</option>
							<option value="L">LARGE</option>
							<option value="XL">X-LARGE</option>
					</select>
				</td>
			</tr>
			
			<tr>
				<td align="right">Proveedor: </td>
				<td align="left">
					<select
						name="cboIdProveedor"
						id="cboIdProveedor"
						dojoType="dijit.form.FilteringSelect"
						autocomplete="true"
						required="true"
						value="<c:out value="${mapProducto.producto.idproveedor}"/>"
						pageSize=5
						style="width:300px"
					>
						<c:forEach var="proveedor" items="${mapProducto.lstProveedor}">
							<option value="${proveedor.idproveedor}">${proveedor.apepaterno} ${proveedor.apematerno} ${proveedor.nombres}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			
			<tr>
				<td align="right">Tipo de documento:</td>
				<td align="left">
					<select name="cboIdDocumento" id="cboIdDocumento" dojoType="dijit.form.FilteringSelect" value="<c:out value="${mapProducto.producto.iddocumento}"/>" autocomplete="true" required="true">
							<option value="10">FACTURA</option>
							<option value="11">BOLETA DE VENTA</option>
					</select>
				</td>
			</tr>
			
			<tr>
				<td align="right">N&uacute;mero de documento:</td>
				<td align="left">
					<input
						type="text"
						name="txtNumeroDocumento"
						id="txtNumeroDocumento"
						required="true"
						value="<c:out value="${mapProducto.producto.numcompra}"/>"
						trim="true"
						uppercase="true"
						maxlength="30"
						dojoType="dijit.form.ValidationTextBox"
					/>
				</td>
			</tr>
			
			<tr>
				<td align="right">Categor&iacute;a: </td>
				<td align="left">
					<select
						name="cboIdCategoria"
						id="cboIdCategoria"
						dojoType="dijit.form.FilteringSelect"
						autocomplete="true"
						required="true"
						value="<c:out value="${mapProducto.producto.idcategoria}"/>"
						pageSize=5
						style="width:300px"
					>
						<c:forEach var="categoria" items="${mapProducto.lstCategoria}">
							<option value="${categoria.idcategoria}">${categoria.nombre}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			
			<tr>
				<td align="right">Marca: </td>
				<td align="left">
					<select
						name="cboIdMarca"
						id="cboIdMarca"
						dojoType="dijit.form.FilteringSelect"
						autocomplete="true"
						required="true"
						value="<c:out value="${mapProducto.producto.idmarca}"/>"
						pageSize=5
						style="width:300px"
					>
						<c:forEach var="marca" items="${mapProducto.lstMarca}">
							<option value="${marca.idmarca}">${marca.nombre}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			
			<tr>
				<td align="right">Color: </td>
				<td align="left">
					<select
						name="cboIdColor"
						id="cboIdColor"
						dojoType="dijit.form.FilteringSelect"
						autocomplete="true"
						required="true"
						value="<c:out value="${mapProducto.producto.idcolor}"/>"
						pageSize=5
						style="width:300px"
					>
						<c:forEach var="color" items="${mapProducto.lstColor}">
							<option value="${color.idcolor}">${color.nombre}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			
			<tr>
				<td align="right">Costo:</td>
				<td align="left">
					<input
						type="text"
						name="txtCosto"
						id="txtCosto"
						maxlength="10"
						required="true"
						value="<c:out value="${mapProducto.producto.moncosto}"/>"
						trim="true"
						regExp="^\d+(\.\d{1,2})?$"
						dojoType="dijit.form.ValidationTextBox"
					/>
				</td>
			</tr>
			
			<tr>
				<td align="right">Precio venta:</td>
				<td align="left">
					<input
						type="text"
						name="txtPrecio"
						id="txtPrecio"
						maxlength="10"
						required="true"
						value="<c:out value="${mapProducto.producto.monventa}"/>"
						trim="true"
						regExp="^\d+(\.\d{1,2})?$"
						dojoType="dijit.form.ValidationTextBox"
					/>
				</td>
			</tr>
			
			<tr>
				<td align="right">Fecha de Compra:</td>
				<td align="left">
					<input type="text" name="fecRegistroCompra" id="fecRegistroCompra" dojoType="dijit.form.DateTextBox" required="true" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${mapProducto.producto.feccompra}" />" />
				</td>
			</tr>
		</table>

	<div align="center">
		<button dojoType="dijit.form.Button" iconClass="dijitEditorIcon dijitEditorIconSave" type="submit" name="submitButton" value="Submit">Grabar</button>
		<button dojoType="dijit.form.Button" iconClass="dijitEditorIcon dijitEditorIconUndo" type="button" onclick="volver()">Volver</button>
	</div>
	
	</div>
	</fieldset>
	</div>
</body>
</html>