package com.utilitarios;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperRunManager;

/**
 * Servlet implementation class GeneradorReportes
 */
public class GeneradorReportes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GeneradorReportes() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		
		String reporte = request.getParameter("reporte");
		
		Map<String, Object> parametros = new HashMap<String, Object>();
		
		if("VentaUnitaria".equalsIgnoreCase(reporte)){
			parametros.put("iddocumento", Integer.parseInt(request.getParameter("iddocumento")));
			parametros.put("numdocumento", (String) request.getParameter("numdocumento"));
		}
		if("ventasDiarias".equalsIgnoreCase(reporte)){
			parametros.put("fecha", request.getParameter("fecha"));
		}
		
		ServletOutputStream servletOutputStream = response.getOutputStream();
		File reportFile = new File(getServletConfig().getServletContext().getRealPath("/reportes/"+reporte+".jasper"));
		byte[] bytes = null;

		try {

			bytes = JasperRunManager.runReportToPdf(reportFile.getPath(),parametros, getConexion());

			response.setContentType("application/pdf");
			response.setContentLength(bytes.length);

			servletOutputStream.write(bytes, 0, bytes.length);
			servletOutputStream.flush();
			servletOutputStream.close();
		} catch (JRException e) {
			// display stack trace in the browser
			StringWriter stringWriter = new StringWriter();
			PrintWriter printWriter = new PrintWriter(stringWriter);
			e.printStackTrace(printWriter);
			response.setContentType("text/plain");
			response.getOutputStream().print(stringWriter.toString());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	public static Connection getConexion() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String servidor = "jdbc:mysql://localhost/maganda";
			String usuarioDB = "root";
			String passwordDB = "123456";
			return DriverManager.getConnection(servidor, usuarioDB, passwordDB);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
