<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de Empleado</title>
</head>
<body>
	<h4>
		<center>Registro de Empleados</center>
	</h4>
	<form action="${pageContext.request.contextPath}/grabarEmpleado" method="post">
		<table width="400" border="0" align="center">
			<tr>
				<td align="right">Tipo de documento:</td>
				<td align="left"><select name="cboIdDocumento"
					id="cboIdDocumento">
						<option value="1" selected="selected">DNI</option>
						<option value="2">RUC</option>
				</select>
				</td>
			</tr>
			<tr>
				<td align="right">Numero de documento:</td>
				<td align="left"><input type="text" name="txtNumeroDocumento"
					id="txtNumeroDocumento" value="" /></td>
			</tr>
			<tr>
				<td align="right">Nombre / Razon Social:</td>
				<td align="left"><input type="text" name="txtApellidoPaterno"
					id="txtApellidoPaterno" value="" />
				</td>
			</tr>
			<tr>
				<td align="right">Direccion:</td>
				<td align="left"><input type="text" name="txtDireccion"
					id="txtDireccion" value="" />
				</td>
			</tr>
			<tr>
				<td align="right">Numero de telefono:</td>
				<td align="left"><input type="text" name="txtNumeroTelefono"
					id="txtNumeroTelefono" value="" />
				</td>
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