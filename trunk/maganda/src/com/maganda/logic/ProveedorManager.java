package com.maganda.logic;

import java.util.List;
import com.maganda.dao.ProveedorMapper;
import com.maganda.domain.Proveedor;
import com.maganda.domain.ProveedorExample;

public class ProveedorManager {
	
	private ProveedorMapper proveedorMapper;
	
	public ProveedorMapper getProveedorMapper() {
		return proveedorMapper;
	}
	
	public void setProveedorMapper(ProveedorMapper proveedorMapper) {
		this.proveedorMapper = proveedorMapper;
	}
	
	public int countByExample(ProveedorExample example) {
		return proveedorMapper.countByExample(example);
	}
	
	public int deleteByExample(ProveedorExample example) {
		return proveedorMapper.deleteByExample(example);
	}
	
	public int deleteByPrimaryKey(Integer idproveedor) {
		return proveedorMapper.deleteByPrimaryKey(idproveedor);
	}
	
	public int insert(Proveedor record) {
		return proveedorMapper.insert(record);
	}
	
	public int insertSelective(Proveedor record) {
		return proveedorMapper.insertSelective(record);
	}
	
	public List<Proveedor> selectByExample(ProveedorExample example) {
		return proveedorMapper.selectByExample(example);
	}
	
	public Proveedor selectByPrimaryKey(Integer idproveedor) {
		return proveedorMapper.selectByPrimaryKey(idproveedor);
	}
	
	public int updateByExampleSelective(Proveedor record, ProveedorExample example) {
		return proveedorMapper.updateByExampleSelective(record, example);
	}
	
	public int updateByExample(Proveedor record, ProveedorExample example) {
		return proveedorMapper.updateByExample(record, example);
	}
	
	public int updateByPrimaryKeySelective(Proveedor record) {
		return proveedorMapper.updateByPrimaryKeySelective(record);
	}
	
	public int updateByPrimaryKey(Proveedor record) {
		return proveedorMapper.updateByPrimaryKey(record);
	}
}
