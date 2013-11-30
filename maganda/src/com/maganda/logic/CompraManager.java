package com.maganda.logic;

import java.util.List;
import com.maganda.dao.CompraMapper;
import com.maganda.domain.Compra;
import com.maganda.domain.CompraExample;

public class CompraManager {
	
	private CompraMapper compraMapper;
	
	public CompraMapper getCompraMapper() {
		return compraMapper;
	}
	
	public void setCompraMapper(CompraMapper compraMapper) {
		this.compraMapper = compraMapper;
	}
	
	public int countByExample(CompraExample example) {
		return compraMapper.countByExample(example);
	}
	
	public int deleteByExample(CompraExample example) {
		return compraMapper.deleteByExample(example);
	}
	
	public int deleteByPrimaryKey(Integer iddocumento, String numcompra) {
		return compraMapper.deleteByPrimaryKey(iddocumento, numcompra);
	}
	
	public int insert(Compra record) {
		return compraMapper.insert(record);
	}
	
	public int insertSelective(Compra record) {
		return compraMapper.insertSelective(record);
	}
	
	public List<Compra> selectByExample(CompraExample example) {
		return compraMapper.selectByExample(example);
	}
	
	public Compra selectByPrimaryKey(Integer iddocumento, String numcompra) {
		return compraMapper.selectByPrimaryKey(iddocumento, numcompra);
	}
	
	public int updateByExampleSelective(Compra record, CompraExample example) {
		return compraMapper.updateByExampleSelective(record, example);
	}
	
	public int updateByExample(Compra record, CompraExample example) {
		return compraMapper.updateByExample(record, example);
	}
	
	public int updateByPrimaryKeySelective(Compra record) {
		return compraMapper.updateByPrimaryKeySelective(record);
	}
	
	public int updateByPrimaryKey(Compra record) {
		return compraMapper.updateByPrimaryKey(record);
	}
}
