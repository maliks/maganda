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
public class ReporteController {
	
	@RequestMapping("/listaReporte")
	public ModelAndView listaReporte(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("listaReporte");
	}	
}
