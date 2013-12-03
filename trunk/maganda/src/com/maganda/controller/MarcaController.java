package com.maganda.controller;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.maganda.domain.Marca;
import com.maganda.logic.MarcaManager;

@Controller
public class MarcaController {
	
	private MarcaManager marcaManager;
	
	private Marca marca;
	
	@RequestMapping("/listarMarca")
	public ModelAndView listarMarca(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("listarMarca", "lstMarca", marcaManager.selectByExample(null));
	}
	
	@RequestMapping("/registrarMarca")
	public ModelAndView registroMarca(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("registrarMarca");
	}
	
	@RequestMapping("/consultarMarca")
	public ModelAndView consultarMarca(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("modificarMarca","marca",marcaManager.selectByPrimaryKey(Integer.parseInt(request.getParameter("idmarca"))));
	}

	@RequestMapping("/grabarMarca")
	public ModelAndView grabarMarca(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		marca = new Marca();
		
		if(request.getParameter("txtIdMarca")!=null) marca.setIdmarca(Integer.parseInt(request.getParameter("txtIdMarca")));
		
		marca.setNombre(request.getParameter("txtNombre"));
		marca.setEstado(request.getParameter("cboEstado"));
		marca.setFecregistro(new java.util.Date());
		
		if(marca.getIdmarca()!=null){
			marca.setFecmodificacion(new java.util.Date());
			marcaManager.updateByPrimaryKeySelective(marca);
		}else{
			marca.setFecregistro(new java.util.Date());
			marcaManager.insertSelective(marca);
		}
		
		return new ModelAndView("listarMarca", "lstMarca", marcaManager.selectByExample(null));
	}
	
	@RequestMapping("/eliminarMarca")
	public ModelAndView eliminarMarca(HttpServletRequest request, HttpServletResponse response) {
		marcaManager.deleteByPrimaryKey(Integer.parseInt(request.getParameter("idmarca")));
		return new ModelAndView("listarMarca", "lstMarca", marcaManager.selectByExample(null));
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
	
	public Date stringToDate(String date) throws Exception{
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return formatter.parse(date);
	}

}
