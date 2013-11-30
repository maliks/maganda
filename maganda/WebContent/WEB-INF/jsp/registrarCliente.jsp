<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de Cliente</title>

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
</script>

</head>
<body class="nihilo">
	<h4>
		<center>Registro de Clientes</center>
	</h4>
	
	<div dojoType="dijit.form.Form" id="myForm" jsId="myForm" action="${pageContext.request.contextPath}/grabarCliente.mgd" method="post">
	
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

		<table width="400" border="0" align="center">
			<tr>
				<td align="right">Tipo de documento:</td>
				<td align="left">
					<select name="cboIdDocumento" id="cboIdDocumento" dojoType="dijit.form.FilteringSelect" autocomplete="true" required="true">
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
				<td align="right">Nombre / Raz&oacute;n Social:</td>
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
					<button dojoType="dijit.form.Button" type="submit" name="submitButton" value="Submit">Grabar</button>
		            <button dojoType="dijit.form.Button" type="reset">Limpiar</button>
				</td>
			</tr>
		</table>

	</form>
</body>
</html>