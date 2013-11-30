package com.maganda.logic;

import java.util.List;
import com.maganda.dao.RolMapper;
import com.maganda.domain.Rol;
import com.maganda.domain.RolExample;

public class RolManager {
	
	private RolMapper rolMapper;
	
	public RolMapper getRolMapper() {
		return rolMapper;
	}
	
	public void setRolMapper(RolMapper rolMapper) {
		this.rolMapper = rolMapper;
	}
	
	public int countByExample(RolExample example) {
		return rolMapper.countByExample(example);
	}
	
	public int deleteByExample(RolExample example) {
		return rolMapper.deleteByExample(example);
	}
	
	public int deleteByPrimaryKey(Integer idrol) {
		return rolMapper.deleteByPrimaryKey(idrol);
	}
	
	public int insert(Rol record) {
		return rolMapper.insert(record);
	}
	
	public int insertSelective(Rol record) {
		return rolMapper.insertSelective(record);
	}
	
	public List<Rol> selectByExample(RolExample example) {
		return rolMapper.selectByExample(example);
	}
	
	public Rol selectByPrimaryKey(Integer idrol) {
		return rolMapper.selectByPrimaryKey(idrol);
	}
	
	public int updateByExampleSelective(Rol record, RolExample example) {
		return rolMapper.updateByExampleSelective(record, example);
	}
	
	public int updateByExample(Rol record, RolExample example) {
		return rolMapper.updateByExample(record, example);
	}
	
	public int updateByPrimaryKeySelective(Rol record) {
		return rolMapper.updateByPrimaryKeySelective(record);
	}
	
	public int updateByPrimaryKey(Rol record) {
		return rolMapper.updateByPrimaryKey(record);
	}
}
