package com.maganda.controller;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanComparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.maganda.domain.Categoria;
import com.maganda.domain.CategoriaExample;
import com.maganda.domain.Color;
import com.maganda.domain.ColorExample;
import com.maganda.domain.Marca;
import com.maganda.domain.MarcaExample;
import com.maganda.domain.Persona;
import com.maganda.domain.PersonaExample;
import com.maganda.domain.Producto;
import com.maganda.domain.ProductoExample;
import com.maganda.domain.Proveedor;
import com.maganda.domain.ProveedorExample;
import com.maganda.logic.CategoriaManager;
import com.maganda.logic.ColorManager;
import com.maganda.logic.MarcaManager;
import com.maganda.logic.PersonaManager;
import com.maganda.logic.ProductoManager;
import com.maganda.logic.ProveedorManager;

@Controller
public class ProductoController {
	
	private ProductoManager productoManager;
	private Producto producto;
	private ProductoExample productoExample;
	private List<Producto> lstProducto;
	
	private MarcaManager marcaManager;
	private Marca marca;
	private MarcaExample marcaExample;
	private List<Marca> lstMarca;
	
	private ColorManager colorManager;
	private Color color;
	private ColorExample colorExample;
	private List<Color> lstColor;

	private ProveedorManager proveedorManager;
	private Proveedor proveedor;
	private ProveedorExample proveedorExample;
	private List<Proveedor> lstProveedor;
	
	private CategoriaManager categoriaManager;
	private Categoria categoria;
	private CategoriaExample categoriaExample;
	private List<Categoria> lstCategoria;
	
	private PersonaManager personaManager;
	private Persona persona;
	private PersonaExample personaExample;
	private List<Persona> lstPersona;
	
	
	@RequestMapping("/listarProducto")
	public ModelAndView listarProducto(HttpServletRequest request, HttpServletResponse response) {
		listarProductos();
		return new ModelAndView("listarProducto", "lstProducto", getLstProducto());
	}
	
	@RequestMapping("/consultarProducto")
	public ModelAndView consultarProducto(HttpServletRequest request, HttpServletResponse response) {
		
		listarCategorias();
		listarColores();
		listarMarcas();
		listarProveedores();
		
		Map<String, Object> mapProducto = new HashMap<String, Object>();
		
		mapProducto.put("lstCategoria", getLstCategoria());
		mapProducto.put("lstColor", getLstColor());
		mapProducto.put("lstMarca", getLstMarca());
		mapProducto.put("lstProveedor", getLstProveedor());
		mapProducto.put("producto", productoManager.selectByPrimaryKey(Integer.parseInt(request.getParameter("idproducto"))));
		
		return new ModelAndView("modificarProducto","mapProducto",mapProducto);
	}
	
	@RequestMapping("/registrarProducto")
	public ModelAndView registrarProducto(HttpServletRequest request, HttpServletResponse response) {
		
		listarCategorias();
		listarColores();
		listarMarcas();
		listarProveedores();
		
		Map<String, Object> mapProducto = new HashMap<String, Object>();
		
		mapProducto.put("lstCategoria", getLstCategoria());
		mapProducto.put("lstColor", getLstColor());
		mapProducto.put("lstMarca", getLstMarca());
		mapProducto.put("lstProveedor", getLstProveedor());
		
		return new ModelAndView("registrarProducto","mapProducto",mapProducto);
	}
	
	@RequestMapping("/grabarProducto")
	public ModelAndView grabarProducto(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		producto = new Producto();
		
		if(request.getParameter("txtIdProducto")!=null) producto.setIdproducto(Integer.parseInt(request.getParameter("txtIdProducto")));
		
		producto.setCodproducto(request.getParameter("txtCodigoProducto"));
		producto.setNombre(request.getParameter("txtNombreProducto"));
		producto.setDescripcion(request.getParameter("txtDescripcionProducto"));
		producto.setTalla(request.getParameter("cboTalla"));
		producto.setIdcolor(Integer.parseInt(request.getParameter("cboIdColor")));
		producto.setIdcategoria(Integer.parseInt(request.getParameter("cboIdCategoria")));
		producto.setIdmarca(Integer.parseInt(request.getParameter("cboIdMarca")));
		producto.setIddocumento(Integer.parseInt(request.getParameter("cboIdDocumento")));
		producto.setNumcompra(request.getParameter("txtNumeroDocumento"));
		producto.setIdproveedor(Integer.parseInt(request.getParameter("cboIdProveedor")));
		producto.setMoncosto(new BigDecimal(request.getParameter("txtCosto")));
		producto.setMonventa(new BigDecimal(request.getParameter("txtPrecio")));
		producto.setFeccompra(stringToDate(request.getParameter("fecRegistroCompra")));
		
		if(producto.getIdproducto() == null ) producto.setEstado("1");
		
		producto.setFecregistro(new java.util.Date());
		
		if(producto.getIdproducto() == null ) productoManager.insertSelective(producto);
		else productoManager.updateByPrimaryKeySelective(producto);
		
		listarProductos();
		return new ModelAndView("listarProducto", "lstProducto", getLstProducto());
	}
	
	@SuppressWarnings("unchecked")
	public void listarProductos(){
		
		lstProducto = new ArrayList<Producto>();
		
		productoExample = new ProductoExample();
		productoExample.setOrderByClause( "NOMBRE" );
		
		lstProducto = productoManager.selectByExample(productoExample);
		
		for (int i = 0; i < lstProducto.size(); i++) {
			
			lstProducto.get(i).setDesCategoria(categoriaManager.selectByPrimaryKey(lstProducto.get(i).getIdcategoria()).getNombre());
			lstProducto.get(i).setDesColor(colorManager.selectByPrimaryKey(lstProducto.get(i).getIdcolor()).getNombre());
			lstProducto.get(i).setDesMarca(marcaManager.selectByPrimaryKey(lstProducto.get(i).getIdmarca()).getNombre());
			
			persona = new Persona();
			proveedor = new Proveedor();
			
			proveedor = proveedorManager.selectByPrimaryKey(lstProducto.get(i).getIdproveedor());
			persona = personaManager.selectByPrimaryKey(proveedor.getIddocumento(),proveedor.getNumdocumento());
			
			if(persona.getApepaterno() != null) lstProducto.get(i).setDesProveedor(persona.getApepaterno());
			if(persona.getApematerno() != null) lstProducto.get(i).setDesProveedor(lstProducto.get(i).getDesProveedor() + " " + persona.getApematerno());
			if(persona.getNombres() != null) lstProducto.get(i).setDesProveedor(lstProducto.get(i).getDesProveedor() + " " + persona.getNombres());
			
			if(lstProducto.get(i).getIddocumento() == 10) lstProducto.get(i).setDesDocTipCompra("FACTURA");
			else lstProducto.get(i).setDesDocTipCompra("BOLETA");
			
			if("1".equals(lstProducto.get(i).getEstado())) lstProducto.get(i).setDesEstado("DISPONIBLE");
			else lstProducto.get(i).setDesEstado("VENDIDO");
			
		}
		
		Collections.sort(lstProducto, new BeanComparator("feccompra"));
	}
	
	public void listarColores(){
		
		lstColor = new ArrayList<Color>();
		
		colorExample = new ColorExample();
		colorExample.setOrderByClause( "NOMBRE" );
		colorExample.createCriteria().andEstadoEqualTo("1");
		
		lstColor = colorManager.selectByExample(colorExample);
		
	}
	
	public void listarMarcas(){
		
		lstMarca = new ArrayList<Marca>();
		
		marcaExample = new MarcaExample();
		marcaExample.setOrderByClause( "NOMBRE" );
		marcaExample.createCriteria().andEstadoEqualTo("1");
		
		lstMarca = marcaManager.selectByExample(marcaExample);
		
	}
	
	public void listarCategorias(){
		
		lstCategoria = new ArrayList<Categoria>();
		
		categoriaExample = new CategoriaExample();
		categoriaExample.setOrderByClause( "NOMBRE" );
		
		lstCategoria = categoriaManager.selectByExample(categoriaExample);
		
	}
	
	@SuppressWarnings("unchecked")
	public void listarProveedores(){
		
		lstProveedor = new ArrayList<Proveedor>();
		
		proveedorExample = new ProveedorExample();
		proveedorExample.createCriteria().andEstadoEqualTo("1");
		
		lstProveedor = proveedorManager.selectByExample(proveedorExample);
		
		for (int i = 0; i < lstProveedor.size(); i++) {
			
			persona = new Persona();
			persona = personaManager.selectByPrimaryKey(lstProveedor.get(i).getIddocumento(),lstProveedor.get(i).getNumdocumento());
			
			lstProveedor.get(i).setApepaterno(persona.getApepaterno());
			lstProveedor.get(i).setApematerno(persona.getApematerno());
			lstProveedor.get(i).setNombres(persona.getNombres());
		}

		Collections.sort(lstProveedor, new BeanComparator("apepaterno"));
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


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public ProductoExample getProductoExample() {
		return productoExample;
	}


	public void setProductoExample(ProductoExample productoExample) {
		this.productoExample = productoExample;
	}


	public List<Producto> getLstProducto() {
		return lstProducto;
	}


	public void setLstProducto(List<Producto> lstProducto) {
		this.lstProducto = lstProducto;
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


	public MarcaExample getMarcaExample() {
		return marcaExample;
	}


	public void setMarcaExample(MarcaExample marcaExample) {
		this.marcaExample = marcaExample;
	}


	public List<Marca> getLstMarca() {
		return lstMarca;
	}


	public void setLstMarca(List<Marca> lstMarca) {
		this.lstMarca = lstMarca;
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


	public ColorExample getColorExample() {
		return colorExample;
	}


	public void setColorExample(ColorExample colorExample) {
		this.colorExample = colorExample;
	}


	public List<Color> getLstColor() {
		return lstColor;
	}


	public void setLstColor(List<Color> lstColor) {
		this.lstColor = lstColor;
	}


	public ProveedorManager getProveedorManager() {
		return proveedorManager;
	}


	@Autowired
	public void setProveedorManager(ProveedorManager proveedorManager) {
		this.proveedorManager = proveedorManager;
	}


	public Proveedor getProveedor() {
		return proveedor;
	}


	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}


	public ProveedorExample getProveedorExample() {
		return proveedorExample;
	}


	public void setProveedorExample(ProveedorExample proveedorExample) {
		this.proveedorExample = proveedorExample;
	}


	public List<Proveedor> getLstProveedor() {
		return lstProveedor;
	}


	public void setLstProveedor(List<Proveedor> lstProveedor) {
		this.lstProveedor = lstProveedor;
	}


	public CategoriaManager getCategoriaManager() {
		return categoriaManager;
	}


	@Autowired
	public void setCategoriaManager(CategoriaManager categoriaManager) {
		this.categoriaManager = categoriaManager;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public CategoriaExample getCategoriaExample() {
		return categoriaExample;
	}


	public void setCategoriaExample(CategoriaExample categoriaExample) {
		this.categoriaExample = categoriaExample;
	}


	public List<Categoria> getLstCategoria() {
		return lstCategoria;
	}


	public void setLstCategoria(List<Categoria> lstCategoria) {
		this.lstCategoria = lstCategoria;
	}

	public PersonaManager getPersonaManager() {
		return personaManager;
	}

	@Autowired
	public void setPersonaManager(PersonaManager personaManager) {
		this.personaManager = personaManager;
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

	public List<Persona> getLstPersona() {
		return lstPersona;
	}

	public void setLstPersona(List<Persona> lstPersona) {
		this.lstPersona = lstPersona;
	}

}
