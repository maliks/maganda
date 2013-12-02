package com.maganda.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.maganda.domain.Cliente;
import com.maganda.domain.ClienteExample;
import com.maganda.domain.Persona;
import com.maganda.domain.PersonaExample;
import com.maganda.logic.ClienteManager;
import com.maganda.logic.PersonaManager;

@Controller
public class ClienteController {
	
	private ClienteManager clienteManager;
	private PersonaManager personaManager;
	
	private Cliente cliente;
	private Persona persona;
	private PersonaExample personaExample;
	private ClienteExample clienteExample;
	private List<Cliente> lstCliente;

	
	@RequestMapping("/listarCliente")
	public ModelAndView listarCliente(HttpServletRequest request, HttpServletResponse response) {
		listarClientes();
		return new ModelAndView("listarCliente", "lstCliente", getLstCliente());
	}
	
	@RequestMapping("/consultarCliente")
	public ModelAndView consultarCliente(HttpServletRequest request, HttpServletResponse response) {
		
		cargarDatosCliente(Integer.parseInt(request.getParameter("idcliente")));
		
		return new ModelAndView("modificarCliente", "cliente", getCliente());
	}
	
	@RequestMapping("/registrarCliente")
	public ModelAndView registrarCliente(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("registrarCliente");
	}

	@RequestMapping("/grabarCliente")
	public ModelAndView grabarCliente(HttpServletRequest request, HttpServletResponse response) {
		
		
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
		
		cliente = new Cliente();
		
		if(request.getParameter("idCliente")!=null) cliente.setIdcliente(Integer.parseInt(request.getParameter("idCliente")));
						
		cliente.setIddocumento(Integer.parseInt(request.getParameter("cboIdDocumento")));
		cliente.setNumdocumento(request.getParameter("txtNumeroDocumento"));
		cliente.setNumtelefono(request.getParameter("txtNumeroTelefono"));
		cliente.setDireccion(request.getParameter("txtDireccion"));
		cliente.setEstado(request.getParameter("cboEstado"));
		cliente.setFecregistro(new java.util.Date());
		
		if(buscarCliente()){
			cliente.setFecmodificacion(new java.util.Date());
			clienteManager.updateByPrimaryKeySelective(cliente);
		}else{
			cliente.setFecregistro(new java.util.Date());
			clienteManager.insertSelective(cliente);
		}
				
		listarClientes();
		return new ModelAndView("listarCliente", "lstCliente", getLstCliente());
	}
	
	@RequestMapping("/eliminarCliente")
	public ModelAndView eliminarCliente(HttpServletRequest request, HttpServletResponse response) {
		
		clienteManager.deleteByPrimaryKey(Integer.parseInt(request.getParameter("idcliente")));
		
		listarClientes();
		
		return new ModelAndView("listarCliente", "lstCliente", getLstCliente());
	}
	
	public boolean buscarPersona(){
		personaExample = new PersonaExample();
		personaExample.createCriteria().andIddocumentoEqualTo(persona.getIddocumento()).andNumdocumentoEqualTo(persona.getNumdocumento());
		return personaManager.countByExample(personaExample) == 1; 
	}
	
	public boolean buscarCliente(){
		clienteExample = new ClienteExample();
		clienteExample.createCriteria().andIddocumentoEqualTo(cliente.getIddocumento()).andNumdocumentoEqualTo(cliente.getNumdocumento());
		return clienteManager.countByExample(clienteExample) == 1; 
	}
	
	public void listarClientes(){
		lstCliente = clienteManager.selectByExample(null);
		for (int i = 0; i < lstCliente.size(); i++) {
			persona = personaManager.selectByPrimaryKey(lstCliente.get(i).getIddocumento(), lstCliente.get(i).getNumdocumento());
			lstCliente.get(i).setApepaterno(persona.getApepaterno());
			lstCliente.get(i).setApematerno(persona.getApematerno());
			lstCliente.get(i).setNombres(persona.getNombres());
			
			if(lstCliente.get(i).getIddocumento()==1) lstCliente.get(i).setDesdocumento("DNI");
			else lstCliente.get(i).setDesdocumento("RUC");
		}
	}
	
	public void cargarDatosCliente(int idcliente){
		
		cliente = new Cliente();
		persona = new Persona();
		
		cliente = clienteManager.selectByPrimaryKey(idcliente);
		persona = personaManager.selectByPrimaryKey(cliente.getIddocumento(), cliente.getNumdocumento());
		
		cliente.setApepaterno(persona.getApepaterno());
		cliente.setApematerno(persona.getApematerno());
		cliente.setNombres(persona.getNombres());
		
		
	}
	
	public ClienteManager getClienteManager() {
		return clienteManager;
	}

	@Autowired
	public void setClienteManager(ClienteManager clienteManager) {
		this.clienteManager = clienteManager;
	}
	
	

	public PersonaManager getPersonaManager() {
		return personaManager;
	}

	@Autowired
	public void setPersonaManager(PersonaManager personaManager) {
		this.personaManager = personaManager;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	
	public PersonaExample getPersonaExample() {
		return personaExample;
	}

	
	public void setPersonaExample(PersonaExample personaExample) {
		this.personaExample = personaExample;
	}

	
	public List<Cliente> getLstCliente() {
		return lstCliente;
	}

	
	public void setLstCliente(List<Cliente> lstCliente) {
		this.lstCliente = lstCliente;
	}

	public ClienteExample getClienteExample() {
		return clienteExample;
	}

	public void setClienteExample(ClienteExample clienteExample) {
		this.clienteExample = clienteExample;
	}
}
