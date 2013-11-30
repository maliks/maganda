package com.maganda.logic;

import java.util.List;
import com.maganda.dao.MarcaMapper;
import com.maganda.domain.Marca;
import com.maganda.domain.MarcaExample;

public class MarcaManager {
	
	private MarcaMapper marcaMapper;
	
	public MarcaMapper getMarcaMapper() {
		return marcaMapper;
	}
	
	public void setMarcaMapper(MarcaMapper marcaMapper) {
		this.marcaMapper = marcaMapper;
	}
	
	public int countByExample(MarcaExample example) {
		return marcaMapper.countByExample(example);
	}
	
	public int deleteByExample(MarcaExample example) {
		return marcaMapper.deleteByExample(example);
	}
	
	public int deleteByPrimaryKey(Integer idmarca) {
		return marcaMapper.deleteByPrimaryKey(idmarca);
	}
	
	public int insert(Marca record) {
		return marcaMapper.insert(record);
	}
	
	public int insertSelective(Marca record) {
		return marcaMapper.insertSelective(record);
	}
	
	public List<Marca> selectByExample(MarcaExample example) {
		return marcaMapper.selectByExample(example);
	}
	
	public Marca selectByPrimaryKey(Integer idmarca) {
		return marcaMapper.selectByPrimaryKey(idmarca);
	}
	
	public int updateByExampleSelective(Marca record, MarcaExample example) {
		return marcaMapper.updateByExampleSelective(record, example);
	}
	
	public int updateByExample(Marca record, MarcaExample example) {
		return marcaMapper.updateByExample(record, example);
	}
	
	public int updateByPrimaryKeySelective(Marca record) {
		return marcaMapper.updateByPrimaryKeySelective(record);
	}
	
	public int updateByPrimaryKey(Marca record) {
		return marcaMapper.updateByPrimaryKey(record);
	}
}
