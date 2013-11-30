<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de Proveedor</title>

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
		window.location.href = "${pageContext.request.contextPath}/listarProveedor.mgd";
	}
	
	function validarTipoDocumento(){
		var tipoDocumento = dijit.byId('cboIdDocumento').attr('value');
		if(tipoDocumento == "1"){
			dojo.attr('txtApellidoPaterno', 'disabled', false);
			dojo.attr('txtApellidoMaterno', 'disabled', false);
			document.getElementById("txtApellidoMaterno").value = "";
			dojo.attr('txtNombres', 'disabled', false);
			document.getElementById("txtNombres").value = "";
		}else{
			dojo.attr('txtApellidoPaterno', 'disabled', false);
			document.getElementById("txtApellidoMaterno").value = "-";
			dojo.attr('txtApellidoMaterno', 'disabled', true);
			document.getElementById("txtNombres").value = "-";
			dojo.attr('txtNombres', 'disabled', true);
		}
	}

</script>

</head>
<body class="nihilo">
	<div align="center" class="tituloFormulario">Registro de Proveedores</div>
	<div align="center">
	<fieldset class="estiloFieldset">	
	<div dojoType="dijit.form.Form" id="myForm" jsId="myForm" action="${pageContext.request.contextPath}/grabarProveedor.mgd" method="post">
	
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
	
		<table width="400" border="0" align="center" height="350px">
			<tr>
				<td align="right">Tipo de documento:</td>
				<td align="left">
					<select name="cboIdDocumento" id="cboIdDocumento" dojoType="dijit.form.FilteringSelect" autocomplete="true" required="true" onchange="validarTipoDocumento()">
							<option value="1" selected="selected">DNI</option>
							<option value="2">RUC</option>
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
						trim="true"
						propercase="true"
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
						trim="true"
						propercase="true"
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
						propercase="true"
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
						propercase="true"
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
						uppercase="true"
						dojoType="dijit.form.ValidationTextBox"
					/>
				</td>
			</tr>
			<tr>
				<td align="right">Estado:</td>
				<td align="left">
					<select name="cboEstado" id="cboEstado" dojoType="dijit.form.FilteringSelect" autocomplete="true" required="true">
						<option value="1" selected="selected">Activo</option>
						<option value="0">Baja</option>
				</select>
				</td>

			</tr>
			<tr>
				<td colspan="2" align="center">
					<button dojoType="dijit.form.Button" iconClass="dijitEditorIcon dijitEditorIconSave" type="submit" name="submitButton" value="Submit">Grabar</button>
		            <button dojoType="dijit.form.Button" iconClass="dijitEditorIcon dijitEditorIconRemoveFormat" type="reset">Limpiar</button>
		            <button dojoType="dijit.form.Button" iconClass="dijitEditorIcon dijitEditorIconUndo" type="button" onclick="volver()">Volver</button>
				</td>
			</tr>
		</table>

	</div>
	</fieldset>
	</div>
</body>
</html>