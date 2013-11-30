<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="left">Registrar Marca</h1> 
        <form action="${pageContext.request.contextPath}/grabarMarca" method="post"> 
        <table border="0" cellpadding="1" cellspacing="2" width="500">
     		<tr>
     			<td align="right">Nombre de marca:</td>
      			<td><input type="text" name="txtNombreMarca" value=""></td>
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
        </table><br>
        
        <div class="Submit">
        	<center>
                        <input type="submit" name="Guardar" value="Guardar Datos">
                        <input type="submit" name="Nuevo" value="Nuevo">
            </center>
        </div>
      </form>
</body>
</html>