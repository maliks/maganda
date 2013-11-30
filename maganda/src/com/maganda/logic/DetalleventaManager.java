package com.maganda.logic;

import java.util.List;
import com.maganda.dao.DetalleventaMapper;
import com.maganda.domain.Detalleventa;
import com.maganda.domain.DetalleventaExample;

public class DetalleventaManager {
	
	private DetalleventaMapper detalleventaMapper;
	
	public DetalleventaMapper getDetalleventaMapper() {
		return detalleventaMapper;
	}
	
	public void setDetalleventaMapper(DetalleventaMapper detalleventaMapper) {
		this.detalleventaMapper = detalleventaMapper;
	}
	
	public int countByExample(DetalleventaExample example) {
		return detalleventaMapper.countByExample(example);
	}
	
	public int deleteByExample(DetalleventaExample example) {
		return detalleventaMapper.deleteByExample(example);
	}
	
	public int insert(Detalleventa record) {
		return detalleventaMapper.insert(record);
	}
	
	public int insertSelective(Detalleventa record) {
		return detalleventaMapper.insertSelective(record);
	}
	
	public List<Detalleventa> selectByExample(DetalleventaExample example) {
		return detalleventaMapper.selectByExample(example);
	}
	
	public int updateByExampleSelective(Detalleventa record, DetalleventaExample example) {
		return detalleventaMapper.updateByExampleSelective(record, example);
	}
	
	public int updateByExample(Detalleventa record, DetalleventaExample example) {
		return detalleventaMapper.updateByExample(record, example);
	}
}
