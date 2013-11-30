package com.maganda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.maganda.domain.Persona;
import com.maganda.domain.PersonaExample;
import com.maganda.domain.Proveedor;
import com.maganda.domain.ProveedorExample;
import com.maganda.logic.PersonaManager;
import com.maganda.logic.ProveedorManager;

@Controller
public class ProveedorController {
	
	private ProveedorManager proveedorManager;
	private PersonaManager personaManager;
	
	private Proveedor proveedor;
	private Persona persona;
	private PersonaExample personaExample;
	private ProveedorExample proveedorExample;
	private List<Proveedor> lstProveedor;
	
	@RequestMapping("/listarProveedor")
	public ModelAndView listarProveedor(HttpServletRequest request, HttpServletResponse response) {
		cargarListaProveedor();
		return new ModelAndView("listarProveedor", "lstProveedor", getLstProveedor());
	}
	
	@RequestMapping("/registrarProveedor")
	public ModelAndView registrarProveedor(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("registrarProveedor");
	}
	
	@RequestMapping("/consultarProveedor")
	public ModelAndView consultarProveedor(HttpServletRequest request, HttpServletResponse response) {
		
		cargarDatosProveedor(Integer.parseInt(request.getParameter("idproveedor")));
		
		return new ModelAndView("modificarProveedor","proveedor",getProveedor());
	}

	@RequestMapping("/grabarProveedor")
	public ModelAndView grabarProveedor(HttpServletRequest request, HttpServletResponse response) {
		
		persona = new Persona();
		
		persona.setIddocumento(Integer.parseInt(request.getParameter("cboIdDocumento")));
		persona.setTippersona(request.getParameter("cboIdDocumento"));
		persona.setNumdocumento(request.getParameter("txtNumeroDocumento"));
		persona.setApepaterno(request.getParameter("txtApellidoPaterno"));
		persona.setApematerno(request.getParameter("txtApellidoMaterno"));
		persona.setNombres(request.getParameter("txtNombres"));
		
		if(buscarPersona()){
			persona.setFecmodificacion(new java.util.Date());
			personaManager.updateByPrimaryKeySelective(persona);
		}else{
			persona.setFeccreacion(new java.util.Date());
			personaManager.insertSelective(persona);
		}
		
		proveedor = new Proveedor();
		
		if(request.getParameter("idProveedor")!=null) proveedor.setIdproveedor(Integer.parseInt(request.getParameter("idProveedor")));
		
		proveedor.setIddocumento(Integer.parseInt(request.getParameter("cboIdDocumento")));
		proveedor.setNumdocumento(request.getParameter("txtNumeroDocumento"));
		proveedor.setNumtelefono(request.getParameter("txtNumeroTelefono"));
		proveedor.setDireccion(request.getParameter("txtDireccion"));
		proveedor.setEstado(request.getParameter("cboEstado"));
		
		if(buscarProveedor()){
			proveedor.setFecmodificacion(new java.util.Date());
			proveedorManager.updateByPrimaryKeySelective(proveedor);
		}else{
			proveedor.setFecregistro(new java.util.Date());
			proveedorManager.insertSelective(proveedor);
		}
		
		cargarListaProveedor();
		
		return new ModelAndView("listarProveedor", "lstProveedor", getLstProveedor());
	}
	
	@RequestMapping("/eliminarProveedor")
	public ModelAndView eliminarProveedor(HttpServletRequest request, HttpServletResponse response) {
		proveedorManager.deleteByPrimaryKey(Integer.parseInt(request.getParameter("idproveedor")));
		cargarListaProveedor();
		return new ModelAndView("listarProveedor", "lstProveedor", getLstProveedor());
	}
	
	public boolean buscarPersona(){
		personaExample = new PersonaExample();
		personaExample.createCriteria().andIddocumentoEqualTo(persona.getIddocumento()).andNumdocumentoEqualTo(persona.getNumdocumento());
		return personaManager.countByExample(personaExample) == 1; 
	}
	
	public boolean buscarProveedor(){
		proveedorExample = new ProveedorExample();
		proveedorExample.createCriteria().andIddocumentoEqualTo(proveedor.getIddocumento()).andNumdocumentoEqualTo(proveedor.getNumdocumento());
		return proveedorManager.countByExample(proveedorExample) == 1; 
	}
	
	public void cargarListaProveedor(){
		
		lstProveedor = new ArrayList<Proveedor>();
		
		lstProveedor = proveedorManager.selectByExample(null);
		
		for (int i = 0; i < lstProveedor.size(); i++) {
			persona = personaManager.selectByPrimaryKey(lstProveedor.get(i).getIddocumento(), lstProveedor.get(i).getNumdocumento());
			
			lstProveedor.get(i).setApepaterno(persona.getApepaterno());
			lstProveedor.get(i).setApematerno(persona.getApematerno());
			lstProveedor.get(i).setNombres(persona.getNombres());
			
			if(lstProveedor.get(i).getIddocumento()==1) lstProveedor.get(i).setDesdocumento("DNI");
			else lstProveedor.get(i).setDesdocumento("RUC");
			
		}
	}
	
	public void cargarDatosProveedor(int idproveedor){
		
		proveedor = new Proveedor();
		persona = new Persona();
		
		proveedor = proveedorManager.selectByPrimaryKey(idproveedor);
		persona = personaManager.selectByPrimaryKey(proveedor.getIddocumento(), proveedor.getNumdocumento());
		
		proveedor.setApepaterno(persona.getApepaterno());
		proveedor.setApematerno(persona.getApematerno());
		proveedor.setNombres(persona.getNombres());
		
		
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

	public List<Proveedor> getLstProveedor() {
		return lstProveedor;
	}

	public void setLstProveedor(List<Proveedor> lstProveedor) {
		this.lstProveedor = lstProveedor;
	}

	public PersonaExample getPersonaExample() {
		return personaExample;
	}

	public void setPersonaExample(PersonaExample personaExample) {
		this.personaExample = personaExample;
	}

	public ProveedorExample getProveedorExample() {
		return proveedorExample;
	}

	public void setProveedorExample(ProveedorExample proveedorExample) {
		this.proveedorExample = proveedorExample;
	}
	
}
