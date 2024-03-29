<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de Colores</title>

<link rel="StyleSheet" type="text/css" href="js/dijit/themes/tundra/tundra.css">

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
<body class="tundra">
	<h4>
		<center>Registro de Colores</center>
	</h4>
		
	<div dojoType="dijit.form.Form" id="myForm" jsId="myForm" action="${pageContext.request.contextPath}/grabarColor.mgd" method="post">
            
            <script type="dojo/method" event="onReset">
                //return confirm('Press OK to reset widget values');
				return true;
            </script>
            
            <script type="dojo/method" event="onSubmit">
                if (this.validate()) {
                    //return confirm('Form is valid, press OK to submit');
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
				<td align="left"><input type="text" name="txtNombre" id="txtNombre" required="true" dojoType="dijit.form.ValidationTextBox" />
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

	</div>
	
	
</body>
</html>