package com.maganda.controller;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.maganda.domain.Cliente;
import com.maganda.domain.Detalleventa;
import com.maganda.domain.Persona;
import com.maganda.domain.ProductoExample;
import com.maganda.logic.ClienteManager;
import com.maganda.logic.PersonaManager;
import com.maganda.logic.ProductoManager;

@Controller
public class VentaController {
	
	private ProductoManager productoManager;
	private ProductoExample productoExample;
	private List<Detalleventa> lstDetalleVenta;
	private ClienteManager clienteManager;
	private PersonaManager personaManager;
	private List<Cliente> lstCliente;
	private Persona persona;
	private Map<String, Object> venta;
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/iniciarVenta")
	public ModelAndView iniciarVenta(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		if(request.getSession().getAttribute("carritoVenta")==null){
			lstDetalleVenta = new ArrayList<Detalleventa>();
			request.getSession().setAttribute("carritoVenta", lstDetalleVenta);
		}else{
			lstDetalleVenta = (List<Detalleventa>)request.getSession().getAttribute("carritoVenta");
		}

		cargarMapa(request);

		venta.put("lstDetalleVenta", lstDetalleVenta);
		
		return new ModelAndView("mostrarVenta","venta",venta);
	}
	
	@RequestMapping("/buscarProducto")
	public ModelAndView buscarProducto(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		productoExample = new ProductoExample();
		productoExample.setOrderByClause(" NOMBRE ");
		
		cargarMapa(request);
		
		return new ModelAndView("buscarProducto","lstProducto",productoManager.selectByExample(productoExample));
	}
	
	@RequestMapping("/agregarProducto")
	public ModelAndView agregarProducto(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Detalleventa detalleventa = new Detalleventa();
		
		detalleventa.setIdproducto(Integer.parseInt(request.getParameter("cboIdProducto")));
		detalleventa.setNomProducto(request.getParameter("txtNombre"));
		detalleventa.setCantidad(Integer.parseInt(request.getParameter("txtCantidad")));
		detalleventa.setMonto(new BigDecimal(Double.parseDouble(request.getParameter("txtMonto"))));
		detalleventa.setDescuento(new BigDecimal(Double.parseDouble(request.getParameter("txtDescuento"))));
				
		List<Detalleventa> lstDetalleVenta =  (List<Detalleventa>)request.getSession().getAttribute("carritoVenta");
		lstDetalleVenta.add(detalleventa);
		
		request.getSession().setAttribute("carritoVenta", lstDetalleVenta);
		
		cargarMapa(request);
		
		venta.put("lstDetalleVenta", lstDetalleVenta);
		
		return new ModelAndView("mostrarVenta","venta",venta);
		
	}
	
	@RequestMapping("/quitarProducto")
	public ModelAndView quitarProducto(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Detalleventa> lstDetalleVenta =  (List<Detalleventa>)request.getSession().getAttribute("carritoVenta");
		
		int idProducto = Integer.parseInt(request.getParameter("idproducto"));
		
		for (int i = 0; i < lstDetalleVenta.size(); i++) {
			if(idProducto == lstDetalleVenta.get(i).getIdproducto()){
				lstDetalleVenta.remove(i);
				break;
			}
		}
				
		request.getSession().setAttribute("carritoVenta", lstDetalleVenta);
		
		cargarMapa(request);
		
		venta.put("lstDetalleVenta", lstDetalleVenta);
		
		return new ModelAndView("mostrarVenta","venta",venta);
	}
	
	@RequestMapping("/cerrarVenta")
	public ModelAndView cerrarVenta(HttpServletRequest request, HttpServletResponse response) {
		request.getSession().removeAttribute("carritoVenta");
		return new ModelAndView("mostrarVenta");
	}
	
	public void listarClientes(){
		lstCliente = clienteManager.selectByExample(null);
		for (int i = 0; i < lstCliente.size(); i++) {
			persona = personaManager.selectByPrimaryKey(lstCliente.get(i).getIddocumento(), lstCliente.get(i).getNumdocumento());
			lstCliente.get(i).setApepaterno(persona.getApepaterno());
			lstCliente.get(i).setApematerno(persona.getApematerno());
			lstCliente.get(i).setNombres(persona.getNombres());
		}
	}
	
	public void cargarMapa(HttpServletRequest request) throws Exception{
		
		//Obtener cliente seleccionado
		String idCliente = request.getParameter("cboIdCliente");
		if(idCliente!=null){
			request.getSession().setAttribute("idCliente", idCliente);
		}else{
			idCliente = (String)request.getSession().getAttribute("idCliente");
		}
		
		//Obtener tipo de documento seleccionado
		String idDocumento = request.getParameter("cboIdDocumento");
		if(idDocumento!=null){
			request.getSession().setAttribute("idDocumento", idDocumento);
		}else{
			idDocumento = (String)request.getSession().getAttribute("idDocumento");
		}
		
		//Obtener numero de documento ingresado
		String numeroDocumento = request.getParameter("txtNumeroDocumento");
		if(numeroDocumento!=null){
			request.getSession().setAttribute("numeroDocumento", numeroDocumento);
		}else{
			numeroDocumento = (String)request.getSession().getAttribute("numeroDocumento");
		}
		
		//Obtener fecha de venta ingresada // yyyy-MM-dd
		String _fecVenta = request.getParameter("fecVenta");
		Date fecVenta;
		if(_fecVenta!=null){
			fecVenta = stringToDate(_fecVenta);
			request.getSession().setAttribute("fecVenta", fecVenta);
		}else{
			fecVenta = (Date)request.getSession().getAttribute("fecVenta");
		}
		
		//Cargar lista de clientes
		listarClientes();
		
		//Cargar el mapa
		venta = new HashMap<String, Object>();
		venta.put("lstCliente", getLstCliente());
		venta.put("idCliente", idCliente);
		venta.put("idDocumento",idDocumento);
		venta.put("numeroDocumento",numeroDocumento);
		venta.put("fecVenta",fecVenta);
	}
	
	public Date stringToDate(String date) throws Exception{
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return formatter.parse(date);
	}

	public ProductoManager getProductoManager() {
		return productoManager;
	}

	@Autowired
	public void setProductoManager(ProductoManager productoManager) {
		this.productoManager = productoManager;
	}

	public ProductoExample getProductoExample() {
		return productoExample;
	}

	public void setProductoExample(ProductoExample productoExample) {
		this.productoExample = productoExample;
	}

	public List<Detalleventa> getLstDetalleVenta() {
		return lstDetalleVenta;
	}

	public void setLstDetalleVenta(List<Detalleventa> lstDetalleVenta) {
		this.lstDetalleVenta = lstDetalleVenta;
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

	public List<Cliente> getLstCliente() {
		return lstCliente;
	}

	public void setLstCliente(List<Cliente> lstCliente) {
		this.lstCliente = lstCliente;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Map<String, Object> getVenta() {
		return venta;
	}

	public void setVenta(Map<String, Object> venta) {
		this.venta = venta;
	}

	
}
