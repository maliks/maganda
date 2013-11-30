package com.maganda.controller;


import java.math.BigDecimal;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.maganda.domain.Mobiliario;
import com.maganda.logic.MobiliarioManager;

@Controller
public class MobiliarioController {
	
	private MobiliarioManager mobiliarioManager;
	
	private Mobiliario mobiliario;
	
	@RequestMapping("/listarMobiliario")
	public ModelAndView listarMobiliario(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("listarMobiliario", "lstMobiliario", mobiliarioManager.selectByExample(null));
	}
	
	@RequestMapping("/registrarMobiliario")
	public ModelAndView registroMobiliario(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("registrarMobiliario", "", "");
	}

	@RequestMapping("/grabarMobiliario")
	public ModelAndView grabarMobiliario(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		mobiliario = new Mobiliario();
		
		mobiliario.setNombre(request.getParameter("txtNombre"));
		mobiliario.setCantidad(Integer.parseInt(request.getParameter("txtCantidad")));
		mobiliario.setDescripcion(request.getParameter("txtDescripcion"));
		mobiliario.setFeccompra(stringToDate(request.getParameter("fecRegistroCompra")));
		mobiliario.setMonto(new BigDecimal(Double.parseDouble(request.getParameter("txtMonto"))));
		mobiliario.setEstado(request.getParameter("cboEstado"));
		mobiliario.setFecregistro(new java.util.Date());
		
		mobiliarioManager.insertSelective(mobiliario);
		
		return new ModelAndView("nuevoEmpleado", "", "");
	}
	
	@RequestMapping("/eliminarMobiliario")
	public ModelAndView eliminarMobiliario(HttpServletRequest request, HttpServletResponse response) {
		mobiliarioManager.deleteByPrimaryKey(Integer.parseInt(request.getParameter("idmobiliario")));
		return new ModelAndView("listarMobiliario", "lstMobiliario", mobiliarioManager.selectByExample(null));
	}
	
	public MobiliarioManager getMobiliarioManager() {
		return mobiliarioManager;
	}

	@Autowired
	public void setMobiliarioManager(MobiliarioManager mobiliarioManager) {
		this.mobiliarioManager = mobiliarioManager;
	}
	
	public Mobiliario getMobiliario() {
		return mobiliario;
	}

	public void setMobiliario(Mobiliario mobiliario) {
		this.mobiliario = mobiliario;
	}
	
	public Date stringToDate(String date) throws Exception{
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return formatter.parse(date);
	}

}
