package com.maganda.logic;

import java.util.List;
import com.maganda.dao.MobiliarioMapper;
import com.maganda.domain.Mobiliario;
import com.maganda.domain.MobiliarioExample;

public class MobiliarioManager {
	
	private MobiliarioMapper mobiliarioMapper;
	
	public MobiliarioMapper getMobiliarioMapper() {
		return mobiliarioMapper;
	}
	
	public void setMobiliarioMapper(MobiliarioMapper mobiliarioMapper) {
		this.mobiliarioMapper = mobiliarioMapper;
	}
	
	public int countByExample(MobiliarioExample example) {
		return mobiliarioMapper.countByExample(example);
	}
	
	public int deleteByExample(MobiliarioExample example) {
		return mobiliarioMapper.deleteByExample(example);
	}
	
	public int deleteByPrimaryKey(Integer idmobiliario) {
		return mobiliarioMapper.deleteByPrimaryKey(idmobiliario);
	}
	
	public int insert(Mobiliario record) {
		return mobiliarioMapper.insert(record);
	}
	
	public int insertSelective(Mobiliario record) {
		return mobiliarioMapper.insertSelective(record);
	}
	
	public List<Mobiliario> selectByExample(MobiliarioExample example) {
		return mobiliarioMapper.selectByExample(example);
	}
	
	public Mobiliario selectByPrimaryKey(Integer idmobiliario) {
		return mobiliarioMapper.selectByPrimaryKey(idmobiliario);
	}
	
	public int updateByExampleSelective(Mobiliario record, MobiliarioExample example) {
		return mobiliarioMapper.updateByExampleSelective(record, example);
	}
	
	public int updateByExample(Mobiliario record, MobiliarioExample example) {
		return mobiliarioMapper.updateByExample(record, example);
	}
	
	public int updateByPrimaryKeySelective(Mobiliario record) {
		return mobiliarioMapper.updateByPrimaryKeySelective(record);
	}
	
	public int updateByPrimaryKey(Mobiliario record) {
		return mobiliarioMapper.updateByPrimaryKey(record);
	}
}
