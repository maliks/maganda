<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modificar Datos del Proveedor</title>

<link rel="StyleSheet" type="text/css" href="js/dijit/themes/nihilo/nihilo.css">
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
		window.location.href = "${pageContext.request.contextPath}/listarProveedor.mgd";
	}

</script>

</head>
<body class="nihilo">
	<div align="center" class="tituloFormulario">Modificar Datos del Proveedor</div>
	<div align="center">
	<fieldset class="estiloFieldset">
	<div dojoType="dijit.form.Form" id="myForm" jsId="myForm" action="${pageContext.request.contextPath}/grabarProveedor.mgd" method="post">

	<script type="dojo/method" event="onSubmit">
			if (this.validate()) {
				return true;
			} else {
				alert('Por favor, ingrese los datos solicitados');
				return false;
			}
			return true;
	</script>
	
		<table width="400" border="0" align="center">
			<tr>
				<td align="right">Codigo del Proveedor:</td>
				<td align="left">
					<input
						type="text"
						name="idProveedor"
						id="idProveedor"
						required="true"
						trim="true"
						readonly="readonly"
						value="<c:out value="${proveedor.idproveedor}"/>"
						dojoType="dijit.form.ValidationTextBox"
					/>
				</td>
			</tr>
			<tr>
				<td align="right">Tipo de documento:</td>
				<td align="left">
					<select name="cboIdDocumento" id="cboIdDocumento" dojoType="dijit.form.FilteringSelect" autocomplete="true" readonly="readonly" required="true">
							<option value="1" <c:if test="${proveedor.iddocumento==1}">selected="selected"</c:if>>DNI</option>
							<option value="2" <c:if test="${proveedor.iddocumento==2}">selected="selected"</c:if>>RUC</option>
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
						trim="true"
						readonly="readonly"
						value="<c:out value="${proveedor.numdocumento}"/>"
						regExp="^\d+$"
						maxlength="11"
						dojoType="dijit.form.ValidationTextBox"
					/>
				</td>
			</tr>
			<tr>
				<td align="right">Apellido Paterno / Razon Social:</td>
				<td align="left">
					<input
						type="text"
						name="txtApellidoPaterno"
						id="txtApellidoPaterno"
						maxlength="30"
						required="true"
						value="<c:out value="${proveedor.apepaterno}"/>"
						trim="true"
						uppercase="true"
						dojoType="dijit.form.ValidationTextBox"
					/>
				</td>
			</tr>
			<tr>
				<td align="right">Apellido Materno:</td>
				<td align="left">
					<input
						type="text"
						name="txtApellidoMaterno"
						id="txtApellidoMaterno"
						maxlength="30"
						required="true"
						value="<c:out value="${proveedor.apematerno}"/><c:if test="${proveedor.iddocumento==2}">-</c:if>"
						<c:if test="${proveedor.iddocumento==2}">disabled="disabled"</c:if>
						trim="true"
						uppercase="true"
						dojoType="dijit.form.ValidationTextBox"
					/>
				</td>
			</tr>
			<tr>
				<td align="right">Nombres:</td>
				<td align="left">
					<input
						type="text"
						name="txtNombres"
						id="txtNombres"
						maxlength="30"
						required="true"
						trim="true"
						value="<c:out value="${proveedor.nombres}"/><c:if test="${proveedor.iddocumento==2}">-</c:if>"
						<c:if test="${proveedor.iddocumento==2}">disabled="disabled"</c:if>
						uppercase="true"
						dojoType="dijit.form.ValidationTextBox"
					/>
				</td>
			</tr>
			<tr>
				<td align="right">Direcci&oacute;n:</td>
				<td align="left">
					<input
						type="text"
						name="txtDireccion"
						id="txtDireccion"
						maxlength="100"
						required="true"
						trim="true"
						value="<c:out value="${proveedor.direccion}"/>"
						uppercase="true"
						dojoType="dijit.form.ValidationTextBox"
					/>
				</td>
			</tr>
			<tr>
				<td align="right">N&uacute;mero de tel&eacute;fono:</td>
				<td align="left">
					<input
						type="text"
						name="txtNumeroTelefono"
						id="txtNumeroTelefono"
						required="true"
						trim="true"
						maxlength="30"
						value="<c:out value="${proveedor.numtelefono}"/>"
						uppercase="true"
						dojoType="dijit.form.ValidationTextBox"
					/>
				</td>
			</tr>
			<tr>
				<td align="right">Estado:</td>
				<td align="left">
					<select name="cboEstado" id="cboEstado" dojoType="dijit.form.FilteringSelect" autocomplete="true" required="true">
						<option value="1" <c:if test="${proveedor.estado=='1'}">selected="selected"</c:if>>Activo</option>
						<option value="0" <c:if test="${proveedor.estado=='0'}">selected="selected"</c:if>>Baja</option>
				</select>
				</td>

			</tr>
			<tr>
				<td colspan="2" align="center">
					<button dojoType="dijit.form.Button" iconClass="dijitEditorIcon dijitEditorIconSave" type="submit" name="submitButton" value="Submit">Grabar</button>
		            <button dojoType="dijit.form.Button" iconClass="dijitEditorIcon dijitEditorIconUndo" type="button" onclick="volver()">Volver</button>
				</td>
			</tr>
		</table>

	</div>
	</fieldset>
	</div>
</body>
</html>