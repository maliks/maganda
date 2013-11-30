package com.maganda.logic;

import java.util.List;
import com.maganda.dao.DetallecompraMapper;
import com.maganda.domain.Detallecompra;
import com.maganda.domain.DetallecompraExample;

public class DetallecompraManager {
	
	private DetallecompraMapper detallecompraMapper;
	
	public DetallecompraMapper getDetallecompraMapper() {
		return detallecompraMapper;
	}
	
	public void setDetallecompraMapper(DetallecompraMapper detallecompraMapper) {
		this.detallecompraMapper = detallecompraMapper;
	}
	
	public int countByExample(DetallecompraExample example) {
		return detallecompraMapper.countByExample(example);
	}
	
	public int deleteByExample(DetallecompraExample example) {
		return detallecompraMapper.deleteByExample(example);
	}
	
	public int insert(Detallecompra record) {
		return detallecompraMapper.insert(record);
	}
	
	public int insertSelective(Detallecompra record) {
		return detallecompraMapper.insertSelective(record);
	}
	
	public List<Detallecompra> selectByExample(DetallecompraExample example) {
		return detallecompraMapper.selectByExample(example);
	}
	
	public int updateByExampleSelective(Detallecompra record, DetallecompraExample example) {
		return detallecompraMapper.updateByExampleSelective(record, example);
	}
	
	public int updateByExample(Detallecompra record, DetallecompraExample example) {
		return detallecompraMapper.updateByExample(record, example);
	}
}
