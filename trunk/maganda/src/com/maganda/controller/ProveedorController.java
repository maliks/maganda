package com.maganda.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.maganda.domain.Persona;
import com.maganda.domain.Proveedor;
import com.maganda.logic.PersonaManager;
import com.maganda.logic.ProveedorManager;

@Controller
public class ProveedorController {
	
	private ProveedorManager proveedorManager;
	private PersonaManager personaManager;
	
	private Proveedor proveedor;
	private Persona persona;
	
	@RequestMapping("/registroProveedor")
	public ModelAndView registroProveedor(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("registroProveedor", "", "");
	}

	@RequestMapping("/grabarProveedor")
	public ModelAndView grabarProveedor(HttpServletRequest request, HttpServletResponse response) {
		
		persona = new Persona();
		
		persona.setIddocumento(Integer.parseInt(request.getParameter("cboIdDocumento")));
		persona.setNumdocumento(request.getParameter("txtNumeroDocumento"));
		persona.setTippersona("2");
		persona.setApepaterno(request.getParameter("txtApellidoPaterno"));
		persona.setFeccreacion(new java.util.Date());
		
		personaManager.insertSelective(persona);
		
		proveedor = new Proveedor();
		
		proveedor.setIddocumento(Integer.parseInt(request.getParameter("cboIdDocumento")));
		proveedor.setNumdocumento(request.getParameter("txtNumeroDocumento"));
		proveedor.setNumtelefono(request.getParameter("txtNumeroTelefono"));
		proveedor.setDireccion(request.getParameter("txtDireccion"));
		proveedor.setEstado(request.getParameter("cboEstado"));
		proveedor.setFecregistro(new java.util.Date());
		
		proveedorManager.insertSelective(proveedor);
		
		return new ModelAndView("nuevoProveedor", "", "");
	}
	
	public ProveedorManager getProveedorManager() {
		return proveedorManager;
	}

	@Autowired
	public void setProveedorManager(ProveedorManager proveedorManager) {
		this.proveedorManager = proveedorManager;
	}

	public PersonaManager getPersonaManager() {
		return personaManager;
	}

	@Autowired
	public void setPersonaManager(PersonaManager personaManager) {
		this.personaManager = personaManager;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
}
