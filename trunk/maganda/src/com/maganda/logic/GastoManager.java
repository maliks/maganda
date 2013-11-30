package com.maganda.logic;

import java.util.List;
import com.maganda.dao.GastoMapper;
import com.maganda.domain.Gasto;
import com.maganda.domain.GastoExample;

public class GastoManager {
	
	private GastoMapper gastoMapper;
	
	public GastoMapper getGastoMapper() {
		return gastoMapper;
	}
	
	public void setGastoMapper(GastoMapper gastoMapper) {
		this.gastoMapper = gastoMapper;
	}
	
	public int countByExample(GastoExample example) {
		return gastoMapper.countByExample(example);
	}
	
	public int deleteByExample(GastoExample example) {
		return gastoMapper.deleteByExample(example);
	}
	
	public int deleteByPrimaryKey(Integer idgasto) {
		return gastoMapper.deleteByPrimaryKey(idgasto);
	}
	
	public int insert(Gasto record) {
		return gastoMapper.insert(record);
	}
	
	public int insertSelective(Gasto record) {
		return gastoMapper.insertSelective(record);
	}
	
	public List<Gasto> selectByExample(GastoExample example) {
		return gastoMapper.selectByExample(example);
	}
	
	public Gasto selectByPrimaryKey(Integer idgasto) {
		return gastoMapper.selectByPrimaryKey(idgasto);
	}
	
	public int updateByExampleSelective(Gasto record, GastoExample example) {
		return gastoMapper.updateByExampleSelective(record, example);
	}
	
	public int updateByExample(Gasto record, GastoExample example) {
		return gastoMapper.updateByExample(record, example);
	}
	
	public int updateByPrimaryKeySelective(Gasto record) {
		return gastoMapper.updateByPrimaryKeySelective(record);
	}
	
	public int updateByPrimaryKey(Gasto record) {
		return gastoMapper.updateByPrimaryKey(record);
	}
}
