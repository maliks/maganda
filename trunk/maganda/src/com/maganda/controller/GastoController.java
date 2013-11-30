package com.maganda.controller;

import java.math.BigDecimal;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.maganda.domain.Gasto;
import com.maganda.logic.GastoManager;

@Controller
public class GastoController {
	
	private GastoManager gastoManager;
	private Gasto gasto;
	
	@RequestMapping("/registroGasto")
	public ModelAndView registroGasto(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("registroGasto", "", "");
	}
	
	@RequestMapping("/grabarGasto")
	public ModelAndView grabarGasto(HttpServletRequest request, HttpServletResponse response) {
		
		gasto = new Gasto();
		
		gasto.setIdgasto(Integer.parseInt((request.getParameter("txtNombre"))));
		gasto.setDescripcion(request.getParameter("txtDescripcion"));
		gasto.setFecgasto(new java.util.Date());
		gasto.setMonto(new BigDecimal(Double.parseDouble(request.getParameter("txtMonto"))));
		gasto.setFecregistro(new java.util.Date());
		
		gastoManager.insertSelective(gasto);

		return new ModelAndView("listaGasto", "", "");
	}
	
	
	public GastoManager getGastoManager() {
		return gastoManager;
	}
	
	@Autowired
	public void setGastoManager(GastoManager gastoManager) {
		this.gastoManager = gastoManager;
	}
	
	public Gasto getGasto() {
		return gasto;
	}
	
	public void setGasto(Gasto gasto) {
		this.gasto = gasto;
	}
}
