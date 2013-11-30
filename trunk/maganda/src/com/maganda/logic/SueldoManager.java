package com.maganda.logic;

import java.util.List;
import com.maganda.dao.SueldoMapper;
import com.maganda.domain.Sueldo;
import com.maganda.domain.SueldoExample;

public class SueldoManager {
	
	private SueldoMapper sueldoMapper;
	
	public SueldoMapper getSueldoMapper() {
		return sueldoMapper;
	}
	
	public void setSueldoMapper(SueldoMapper sueldoMapper) {
		this.sueldoMapper = sueldoMapper;
	}
	
	public int countByExample(SueldoExample example) {
		return sueldoMapper.countByExample(example);
	}
	
	public int deleteByExample(SueldoExample example) {
		return sueldoMapper.deleteByExample(example);
	}
	
	public int insert(Sueldo record) {
		return sueldoMapper.insert(record);
	}
	
	public int insertSelective(Sueldo record) {
		return sueldoMapper.insertSelective(record);
	}
	
	public List<Sueldo> selectByExample(SueldoExample example) {
		return sueldoMapper.selectByExample(example);
	}
	
	public int updateByExampleSelective(Sueldo record, SueldoExample example) {
		return sueldoMapper.updateByExampleSelective(record, example);
	}
	
	public int updateByExample(Sueldo record, SueldoExample example) {
		return sueldoMapper.updateByExample(record, example);
	}
}
