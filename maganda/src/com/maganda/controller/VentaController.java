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
import com.maganda.domain.Venta;
import com.maganda.domain.VentaExample;
import com.maganda.logic.ClienteManager;
import com.maganda.logic.DetalleventaManager;
import com.maganda.logic.PersonaManager;
import com.maganda.logic.ProductoManager;
import com.maganda.logic.VentaManager;

@Controller
public class VentaController {
	
	private ProductoManager productoManager;
	private ProductoExample productoExample;
	private List<Detalleventa> lstDetalleVenta;
	private ClienteManager clienteManager;
	private PersonaManager personaManager;
	private List<Cliente> lstCliente;
	private Persona persona;
	private Map<String, Object> ventaMap;
	private VentaManager ventaManager;
	private DetalleventaManager detalleventaManager;
	private Venta venta;
	private Detalleventa detalleventa;
	private List<Venta> lstVenta;
	private VentaExample ventaExample;
	private Cliente cliente;
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/iniciarVenta")
	public ModelAndView iniciarVenta(HttpServletRequest request, HttpServletResponse response){
		
		if(request.getSession().getAttribute("carritoVenta")==null){
			lstDetalleVenta = new ArrayList<Detalleventa>();
			request.getSession().setAttribute("carritoVenta", lstDetalleVenta);
		}else{
			lstDetalleVenta = (List<Detalleventa>)request.getSession().getAttribute("carritoVenta");
		}

		cargarMapa(request);

		ventaMap.put("lstDetalleVenta", lstDetalleVenta);
		
		return new ModelAndView("mostrarVenta","venta",ventaMap);
	}
	
	@RequestMapping("/listarVenta")
	public ModelAndView listarVenta(HttpServletRequest request, HttpServletResponse response){
		listarVentas();
		return new ModelAndView("listarVenta","lstVenta",getLstVenta());
	}
	
	@RequestMapping("/buscarProducto")
	public ModelAndView buscarProducto(HttpServletRequest request, HttpServletResponse response){
		
		productoExample = new ProductoExample();
		productoExample.setOrderByClause(" NOMBRE ");
		
		cargarMapa(request);
		
		return new ModelAndView("buscarProducto","lstProducto",productoManager.selectByExample(productoExample));
	}
	
	@RequestMapping("/agregarProducto")
	public ModelAndView agregarProducto(HttpServletRequest request, HttpServletResponse response){
		
		Detalleventa detalleventa = new Detalleventa();
		
		detalleventa.setIdproducto(Integer.parseInt(request.getParameter("cboIdProducto")));
		detalleventa.setNomProducto(request.getParameter("txtNombre"));
		detalleventa.setCantidad(Integer.parseInt(request.getParameter("txtCantidad")));
		detalleventa.setMonto(new BigDecimal(Double.parseDouble(request.getParameter("txtMonto"))));
		detalleventa.setDescuento(new BigDecimal(Double.parseDouble(request.getParameter("txtDescuento"))));
				
		@SuppressWarnings("unchecked")
		List<Detalleventa> lstDetalleVenta =  (List<Detalleventa>)request.getSession().getAttribute("carritoVenta");
		lstDetalleVenta.add(detalleventa);
		
		request.getSession().setAttribute("carritoVenta", lstDetalleVenta);
		
		cargarMapa(request);
		
		ventaMap.put("lstDetalleVenta", lstDetalleVenta);
		
		return new ModelAndView("mostrarVenta","venta",ventaMap);
		
	}
	
	@RequestMapping("/quitarProducto")
	public ModelAndView quitarProducto(HttpServletRequest request, HttpServletResponse response){
		
		@SuppressWarnings("unchecked")
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
		
		ventaMap.put("lstDetalleVenta", lstDetalleVenta);
		
		return new ModelAndView("mostrarVenta","venta",ventaMap);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/realizarVenta")
	public ModelAndView realizarVenta(HttpServletRequest request, HttpServletResponse response) {
		
		venta = new Venta();
		
		venta.setIddocumento(Integer.parseInt(request.getParameter("cboIdDocumento")));
		venta.setNumventa(Integer.parseInt(request.getParameter("txtNumeroDocumento")));
		venta.setIdcliente(Integer.parseInt(request.getParameter("cboIdCliente")));
		venta.setFecventa(stringToDate(request.getParameter("fecVenta")));
		venta.setEstado("1");
		
		Double montoVenta = new Double(0);
		Double montoDescuento = new Double(0);
		Double montoIGV = new Double(0);
		
		lstDetalleVenta = (List<Detalleventa>)request.getSession().getAttribute("carritoVenta");
		
		for (int i = 0; i < lstDetalleVenta.size(); i++) {
			montoVenta = lstDetalleVenta.get(i).getCantidad().doubleValue()*(lstDetalleVenta.get(i).getMonto().doubleValue() - lstDetalleVenta.get(i).getDescuento().doubleValue());
			montoDescuento = lstDetalleVenta.get(i).getCantidad().doubleValue()*lstDetalleVenta.get(i).getDescuento().doubleValue();
		}
		
		if(venta.getIddocumento() == 10){
			montoIGV = montoVenta*0.18;
		}
		
		venta.setMonventa(new BigDecimal(montoVenta));
		venta.setMondescuento(new BigDecimal(montoDescuento));
		venta.setMonigv(new BigDecimal(montoIGV));
		venta.setMonadelanto(new BigDecimal(0));
		
		venta.setFecregistro(new java.util.Date());
		venta.setFecentrega(new java.util.Date());	
		venta.setFecpago(new java.util.Date());
		
		ventaManager.insertSelective(venta);
		
		detalleventa = new Detalleventa();
		
		for (int i = 0; i < lstDetalleVenta.size(); i++) {

			detalleventa.setIdproducto(lstDetalleVenta.get(i).getIdproducto());
			detalleventa.setIddocumento(venta.getIddocumento());
			detalleventa.setNumventa(venta.getNumventa());
			detalleventa.setCantidad(lstDetalleVenta.get(i).getCantidad());
			detalleventa.setMonto(lstDetalleVenta.get(i).getMonto());
			detalleventa.setDescuento(lstDetalleVenta.get(i).getDescuento());
			detalleventa.setEstproducto("1");
			detalleventa.setFecregistro(new java.util.Date());
			
			detalleventaManager.insertSelective(detalleventa);
		}
		
		request.getSession().removeAttribute("carritoVenta");
		
		listarVentas();
		
		return new ModelAndView("listarVenta","lstVenta",getLstVenta());
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
	
	public void cargarMapa(HttpServletRequest request){
		
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
		ventaMap = new HashMap<String, Object>();
		ventaMap.put("lstCliente", getLstCliente());
		ventaMap.put("idCliente", idCliente);
		ventaMap.put("idDocumento",idDocumento);
		ventaMap.put("numeroDocumento",numeroDocumento);
		ventaMap.put("fecVenta",fecVenta);
	}
	
	public Date stringToDate(String date){
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try{
			return formatter.parse(date);
		}catch(Exception e){
			return new java.util.Date();
		}
		
	}
	
	public void listarVentas(){
		
		ventaExample = new VentaExample();
		ventaExample.setOrderByClause(" FECVENTA desc ");
		
		lstVenta = ventaManager.selectByExample(ventaExample);

		for (int i = 0; i < lstVenta.size(); i++) {
			
			if(lstVenta.get(i).getIddocumento()==10) lstVenta.get(i).setDesDocVenta("FACTURA");
			else lstVenta.get(i).setDesDocVenta("BOLETA");
			
			cliente = clienteManager.selectByPrimaryKey(lstVenta.get(i).getIdcliente());
			persona = personaManager.selectByPrimaryKey(cliente.getIddocumento(), cliente.getNumdocumento());
			
			if(cliente.getIddocumento()==1) lstVenta.get(i).setDesDocCliente("DNI");
			else lstVenta.get(i).setDesDocCliente("RUC");
			
			lstVenta.get(i).setNumDocCliente(cliente.getNumdocumento());
			lstVenta.get(i).setNomCliente(persona.getApepaterno()+" "+persona.getApematerno()+" "+persona.getNombres());
			
			lstVenta.get(i).setMonTotal(lstVenta.get(i).getMonventa().doubleValue() + lstVenta.get(i).getMonigv().doubleValue());
			
		}
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

	public Map<String, Object> getVentaMap() {
		return ventaMap;
	}

	public void setVentaMap(Map<String, Object> ventaMap) {
		this.ventaMap = ventaMap;
	}

	public VentaManager getVentaManager() {
		return ventaManager;
	}

	@Autowired
	public void setVentaManager(VentaManager ventaManager) {
		this.ventaManager = ventaManager;
	}

	public DetalleventaManager getDetalleventaManager() {
		return detalleventaManager;
	}

	@Autowired
	public void setDetalleventaManager(DetalleventaManager detalleventaManager) {
		this.detalleventaManager = detalleventaManager;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Detalleventa getDetalleventa() {
		return detalleventa;
	}

	public void setDetalleventa(Detalleventa detalleventa) {
		this.detalleventa = detalleventa;
	}

	public List<Venta> getLstVenta() {
		return lstVenta;
	}

	public void setLstVenta(List<Venta> lstVenta) {
		this.lstVenta = lstVenta;
	}

	public VentaExample getVentaExample() {
		return ventaExample;
	}

	public void setVentaExample(VentaExample ventaExample) {
		this.ventaExample = ventaExample;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
