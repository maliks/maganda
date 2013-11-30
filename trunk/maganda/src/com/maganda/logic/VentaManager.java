package com.maganda.logic;

import java.util.List;
import com.maganda.dao.VentaMapper;
import com.maganda.domain.Venta;
import com.maganda.domain.VentaExample;

public class VentaManager {
	
	private VentaMapper ventaMapper;
	
	public VentaMapper getVentaMapper() {
		return ventaMapper;
	}
	
	public void setVentaMapper(VentaMapper ventaMapper) {
		this.ventaMapper = ventaMapper;
	}
	
	public int countByExample(VentaExample example) {
		return ventaMapper.countByExample(example);
	}
	
	public int deleteByExample(VentaExample example) {
		return ventaMapper.deleteByExample(example);
	}
	
	public int deleteByPrimaryKey(Integer iddocumento, Integer numventa) {
		return ventaMapper.deleteByPrimaryKey(iddocumento, numventa);
	}
	
	public int insert(Venta record) {
		return ventaMapper.insert(record);
	}
	
	public int insertSelective(Venta record) {
		return ventaMapper.insertSelective(record);
	}
	
	public List<Venta> selectByExample(VentaExample example) {
		return ventaMapper.selectByExample(example);
	}
	
	public Venta selectByPrimaryKey(Integer iddocumento, Integer numventa) {
		return ventaMapper.selectByPrimaryKey(iddocumento, numventa);
	}
	
	public int updateByExampleSelective(Venta record, VentaExample example) {
		return ventaMapper.updateByExampleSelective(record, example);
	}
	
	public int updateByExample(Venta record, VentaExample example) {
		return ventaMapper.updateByExample(record, example);
	}
	
	public int updateByPrimaryKeySelective(Venta record) {
		return ventaMapper.updateByPrimaryKeySelective(record);
	}
	
	public int updateByPrimaryKey(Venta record) {
		return ventaMapper.updateByPrimaryKey(record);
	}
}
