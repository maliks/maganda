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
	function imprimir(){
		var fecha = document.getElementById("fecVenta").value;
		if(fecha == ""){
			alert("Favor de seleccionar el dia para generar el reporte");
		}else{			
			window.open(
					"${pageContext.request.contextPath}/generadorreportes?reporte=ventasDiarias&fecha="+fecha,
					  '_blank' // <- This is what makes it open in a new window.
					);
		}
	}
</script>

</head>

<body style="background-color: #FCD997" class="nihilo"> 
<div align="right" style="font-family: serif;font-size: small;">		
	<a href="<c:url value="/menu.jsp"/>">[Menu Principal]</a>&nbsp;
	<a href="<c:url value="j_spring_security_logout" />" >[Cerrar sesi&oacute;n]</a>
</div>
<div align="center" class="tituloMenu">Reportes</div>
<table align="center" border="0" width="800px">
	<tr>
		<td><center><b>Reporte de Venta Diaria</b></center></td>
	</tr>
	<tr>
		<td><center><b>Seleccione el dia de la venta: <input type="text" name="fecVenta" id="fecVenta" dojoType="dijit.form.DateTextBox"/></b></center></td>
	</tr>
	<tr>
		<td><center><button dojoType="dijit.form.Button" type="button" onclick="imprimir()">Imprimir</button></center></td>
	</tr>
</table>
</body>
</html>