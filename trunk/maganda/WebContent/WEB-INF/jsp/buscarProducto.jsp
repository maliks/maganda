<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agregar Producto</title>

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
</script>

<script type="text/javascript">

	function volver(){
		window.location.href = "${pageContext.request.contextPath}/iniciarVenta.mgd";
	}
	
	function actualizarNombreProducto(){
		document.getElementById("txtNombre").value = document.getElementById("cboIdProducto").value;
	}
	
</script>

</head>
<body class="nihilo">
	<div align="center" class="tituloFormulario">Agregar Producto</div>
	<div align="center">
	<fieldset class="estiloFieldset">	
	<div dojoType="dijit.form.Form" id="myForm" jsId="myForm" action="${pageContext.request.contextPath}/agregarProducto.mgd" method="post">

	<script type="dojo/method" event="onSubmit">
			if (this.validate()) {
				if(document.getElementById("txtMonto").value<=0){
					alert("El precio del producto debe ser mayor a 0");
					return false;
				}else{
					if(document.getElementById("txtMonto").value<=document.getElementById("txtDescuento").value){
						alert("El descuento debe ser menor que el precio del producto");
						return false;
					}else{
						return true;
					}
				}
	
				//return true;
			} else {
				alert('Por favor, ingrese los datos solicitados');
				return false;
			}
			return true;
	</script>
	
		<table width="600px" border="0" align="center" height="250px">
			<tr>
				<td align="right">Seleccionar producto: </td>
				<td align="left">
					<select
						name="cboIdProducto"
						id="cboIdProducto"
						dojoType="dijit.form.FilteringSelect"
						autocomplete="true"
						required="true"
						value=""
						pageSize=5
						style="width:450px"
						onchange="actualizarNombreProducto()"
					>
						<c:forEach var="producto" items="${lstProducto}">
							<option value="${producto.idproducto}">${producto.nombre}</option>
						</c:forEach>
					</select>
					<input type="hidden" name="txtNombre" id="txtNombre" value=""/>
				</td>
			</tr>
			<tr>
				<td align="right">Cantidad:</td>
				<td align="left">
					<input
						type="text"
						name="txtCantidad"
						id="txtCantidad"
						required="true"
						trim="true"
						regExp="^\d+$"
						value="1"
						readonly="readonly"
						maxlength="10"
						dojoType="dijit.form.ValidationTextBox"
					/>
				</td>
			</tr>
			<tr>
				<td align="right">Monto:</td>
				<td align="left">
					<input
						type="text"
						name="txtMonto"
						id="txtMonto"
						maxlength="10"
						required="true"
						trim="true"
						regExp="^\d+(\.\d{1,2})?$"
						dojoType="dijit.form.ValidationTextBox"
					/>
				</td>
			</tr>
			<tr>
				<td align="right">Descuento:</td>
				<td align="left">
					<input
						type="text"
						name="txtDescuento"
						id="txtDescuento"
						maxlength="10"
						required="true"
						trim="true"
						value="0"
						regExp="^\d+(\.\d{1,2})?$"
						dojoType="dijit.form.ValidationTextBox"
					/>
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<button dojoType="dijit.form.Button" iconClass="dijitEditorIcon dijitEditorIconSave" type="submit" name="submitButton" value="Submit">Agregar</button>
		            <button dojoType="dijit.form.Button" iconClass="dijitEditorIcon dijitEditorIconUndo" type="button" onclick="volver()">Volver</button>
				</td>
			</tr>
		</table>

	</div>
	</fieldset>
	</div>
</body>
</html>