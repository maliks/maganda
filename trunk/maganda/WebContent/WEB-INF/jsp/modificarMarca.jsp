<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modificar Marca</title>

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
		window.location.href = "${pageContext.request.contextPath}/listarMarca.mgd";
	}
	
</script>

</head>
<body class="nihilo">
	
	<div align="center" class="tituloFormulario">Modificar Marca</div>
	<div align="center">
	<fieldset class="estiloFieldset">
	
	<div dojoType="dijit.form.Form" id="myForm" jsId="myForm" action="${pageContext.request.contextPath}/grabarMarca.mgd" method="post">
	
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
				<td align="right">Identificador de la marcar:</td>
				<td align="left">
					<input
						type="text"
						name="txtIdMarca"
						id="txtIdMarca"
						required="true"
						value="<c:out value="${marca.idmarca}"/>"
						readonly="readonly"
						dojoType="dijit.form.ValidationTextBox"
					/>
				</td>
			</tr>
			<tr>
				<td align="right">Nombre:</td>
				<td align="left">
					<input
						type="text"
						name="txtNombre"
						id="txtNombre"
						required="true"
						value="<c:out value="${marca.nombre}"/>"
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
						<option value="1" <c:if test="${marca.estado=='1'}">selected="selected"</c:if>>Activo</option>
						<option value="0" <c:if test="${marca.estado=='0'}">selected="selected"</c:if>>Baja</option>
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