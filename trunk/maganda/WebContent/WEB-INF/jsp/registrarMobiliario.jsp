<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de Mobiliarios</title>

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
    dojo.require("dijit.form.Textarea");
    dojo.require("dijit.form.SimpleTextarea");
    dojo.require("dijit.form.NumberTextBox");
    dojo.require("dijit.form.DateTextBox");
</script>

<script type="text/javascript">

	function volver(){
		window.location.href = "${pageContext.request.contextPath}/listarMobiliario.mgd";
	}
	
</script>

</head>
<body class="nihilo">
	
	<div align="center" class="tituloFormulario">Registro de Mobiliario</div>
	<div align="center">
	<fieldset class="estiloFieldset">
	
	<div dojoType="dijit.form.Form" id="myForm" jsId="myForm" action="${pageContext.request.contextPath}/grabarMobiliario.mgd" method="post">
	
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
				<td align="right">Nombre:</td>
				<td align="left">
					<input
						type="text"
						name="txtNombre"
						id="txtNombre"
						required="true"
						trim="true"
						uppercase="true"
						maxlength="30"
						dojoType="dijit.form.ValidationTextBox"
						/>
				</td>
			</tr>
			<tr>
			<tr>
				<td align="right">Cantidad:</td>
				<td align="left">
					<input
						type="textbox"
						name="txtCantidad"
						id="txtCantidad"
						required="true"
						trim="true"
						maxlength="9"
						dojoType="dijit.form.ValidationTextBox"	/>
						<!-- regExp="^[0-9]\d+$" -->
						
				
				</td>
				<tr>
				<td align="right">Descripcion:</td>
				<td align="left">
					<textarea
						name="txtDescripcion"
						id="txtDireccion"
						maxlength="250"
						required="true"
						uppercase="true"
						dojoType="dijit.form.SimpleTextarea">
					</textarea>
				</td>
			</tr>
			<tr>
				<td align="right">Monto:</td>
				<td align="left">
					<input
						type="textbox"
						name="txtMonto"
						id="txtMonto" 
						regExp="^\d+(\.\d{1,2})?$"
						maxlength="10"
						required="true"
						dojoType="dijit.form.ValidationTextBox"/>
				</td>
			</tr>
			<tr>
				<td align="right">Fecha de Compra:</td>
				<td align="left">
					<input type="text" name="fecRegistroCompra" id="fecRegistroCompra" dojoType="dijit.form.DateTextBox" required="true" />
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