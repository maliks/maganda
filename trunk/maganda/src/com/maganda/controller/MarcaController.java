package com.maganda.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.maganda.domain.Marca;
import com.maganda.logic.MarcaManager;;

@Controller
public class MarcaController {
	
	private MarcaManager marcaManager;
	private Marca marca;
	
	@RequestMapping("/registroMarca")
	public ModelAndView registroMarca(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("registroMarca", "", "");
	}
	
	@RequestMapping("/grabarMarca")
	public ModelAndView grabarMarca(HttpServletRequest request, HttpServletResponse response) {
		
		marca = new Marca();
		
		marca.setNombre(request.getParameter("txtNombreMarca"));
		marca.setEstado(request.getParameter("cboEstado"));
		marca.setFecregistro(new java.util.Date());
		
		marcaManager.insertSelective(marca);

		return new ModelAndView("listaMarca", "", "");
	}
	
	public MarcaManager getMarcaManager() {
		return marcaManager;
	}
	
	@Autowired
	public void setMarcaManager(MarcaManager marcaManager) {
		this.marcaManager = marcaManager;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	
}
