package com.maganda.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.maganda.domain.Empleado;
import com.maganda.domain.Persona;
import com.maganda.logic.EmpleadoManager;
import com.maganda.logic.PersonaManager;

@Controller
public class EmpleadoController {
	
	private EmpleadoManager empleadoManager;
	private PersonaManager personaManager;
	
	private Empleado empleado;
	private Persona persona;
	
	@RequestMapping("/registroEmpleado")
	public ModelAndView registroEmpleado(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("registroEmpleado", "", "");
	}

	@RequestMapping("/grabarEmpleado")
	public ModelAndView grabarEmpleado(HttpServletRequest request, HttpServletResponse response) {
		
		persona = new Persona();
		
		persona.setIddocumento(Integer.parseInt(request.getParameter("cboIdDocumento")));
		persona.setNumdocumento(request.getParameter("txtNumeroDocumento"));
		persona.setTippersona("1");
		persona.setApepaterno(request.getParameter("txtApellidoPaterno"));
		persona.setFeccreacion(new java.util.Date());
		
		personaManager.insertSelective(persona);
		
		empleado = new Empleado();
		
		empleado.setIddocumento(Integer.parseInt(request.getParameter("cboIdDocumento")));
		empleado.setNumdocumento(request.getParameter("txtNumeroDocumento"));
		empleado.setNumtelefono(request.getParameter("txtNumeroTelefono"));
		empleado.setDireccion(request.getParameter("txtDireccion"));
		empleado.setEstado(request.getParameter("cboEstado"));
		empleado.setFecregistro(new java.util.Date());
		
		empleadoManager.insertSelective(empleado);
		
		return new ModelAndView("nuevoEmpleado", "", "");
	}
	
	public EmpleadoManager getEmpleadoManager() {
		return empleadoManager;
	}

	@Autowired
	public void setEmpleadoManager(EmpleadoManager empleadoManager) {
		this.empleadoManager = empleadoManager;
	}
	
	
	public PersonaManager getPersonaManager() {
		return personaManager;
	}

	@Autowired
	public void setPersonaManager(PersonaManager personaManager) {
		this.personaManager = personaManager;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}
