package com.maganda.logic;

import java.util.List;
import com.maganda.dao.ProductoMapper;
import com.maganda.domain.Producto;
import com.maganda.domain.ProductoExample;

public class ProductoManager {
	
	private ProductoMapper productoMapper;
	
	public ProductoMapper getProductoMapper() {
		return productoMapper;
	}
	
	public void setProductoMapper(ProductoMapper productoMapper) {
		this.productoMapper = productoMapper;
	}
	
	public int countByExample(ProductoExample example) {
		return productoMapper.countByExample(example);
	}
	
	public int deleteByExample(ProductoExample example) {
		return productoMapper.deleteByExample(example);
	}
	
	public int deleteByPrimaryKey(Integer idproducto) {
		return productoMapper.deleteByPrimaryKey(idproducto);
	}
	
	public int insert(Producto record) {
		return productoMapper.insert(record);
	}
	
	public int insertSelective(Producto record) {
		return productoMapper.insertSelective(record);
	}
	
	public List<Producto> selectByExample(ProductoExample example) {
		return productoMapper.selectByExample(example);
	}
	
	public Producto selectByPrimaryKey(Integer idproducto) {
		return productoMapper.selectByPrimaryKey(idproducto);
	}
	
	public int updateByExampleSelective(Producto record, ProductoExample example) {
		return productoMapper.updateByExampleSelective(record, example);
	}
	
	public int updateByExample(Producto record, ProductoExample example) {
		return productoMapper.updateByExample(record, example);
	}
	
	public int updateByPrimaryKeySelective(Producto record) {
		return productoMapper.updateByPrimaryKeySelective(record);
	}
	
	public int updateByPrimaryKey(Producto record) {
		return productoMapper.updateByPrimaryKey(record);
	}
}
