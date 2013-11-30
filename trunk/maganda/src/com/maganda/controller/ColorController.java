package com.maganda.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.maganda.domain.Color;
import com.maganda.logic.ColorManager;

@Controller
public class ColorController {
	
	private ColorManager colorManager;
	private Color color;
	
	@RequestMapping("/registroColor")
	public ModelAndView registroColor(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("registroColor", "", "");
	}
	
	@RequestMapping("/grabarColor")
	public ModelAndView grabarColor(HttpServletRequest request, HttpServletResponse response) {
		
		color = new Color();
		color.setNombre(request.getParameter("txtNombre"));
		color.setEstado(request.getParameter("cboEstado"));
		color.setFecregistro(new java.util.Date());
		
		colorManager.insertSelective(color);

		return new ModelAndView("listaColor", "", "");
	}
	
	
	public ColorManager getColorManager() {
		return colorManager;
	}
	
	@Autowired
	public void setColorManager(ColorManager colorManager) {
		this.colorManager = colorManager;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
}
