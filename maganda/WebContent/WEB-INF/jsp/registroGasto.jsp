<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de Mobiliarios</title>
</head>
<body>
	<h4>
		<center>Registro de Mobiliarios</center>
	</h4>
	<form action="${pageContext.request.contextPath}/grabarMobiliario" method="post">
		<table width="400" border="0" align="center">
		<tr>
				<td align="right">Nombre:</td>
				<td align="left"><input type="text" name="txtNombre"
					id="txtNombre" value="" />
				</td>
			</tr>
			<tr>
			<tr>
				<td align="right">Cantidad:</td>
				<td align="left"><input type="text" name="txtCantidad"
					id="txtCantidad" value="" />
				</td>
				<tr>
				<td align="right">Descripcion:</td>
				<td align="left"><input type="text" name="txtDescripcion"
					id="txtDireccion" value="" />
				</td>
			</tr>
			<tr>
				<td align="right">Monto:</td>
				<td align="left"><input type="text" name="txtMonto"
					id="txtMonto" value="" />
				</td>
			</tr>
			<tr>
				<td align="right">Fecha de Compra:</td>
				<td align="left"><input type="Date" name="fecRegistroCompra"
					id="fecRegistroCompra" value="" /></td>

			</tr>
			<tr>
				<td align="right">Estado:</td>
				<td align="left"><select name="cboEstado" id="cboEstado">
						<option value="1" selected="selected">Activo</option>
						<option value="0">Baja</option>
				</select>
				</td>

			</tr>
			<tr>	
				<td colspan="2" align="center">
					<input type="submit" value="Guardar"/>&nbsp;&nbsp;<input type="reset" value="Limpiar"/>
				</td>
			</tr>
			
			
		</table>

	</form>
</body>
</html>