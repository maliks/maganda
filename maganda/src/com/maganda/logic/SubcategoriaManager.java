package com.maganda.logic;

import java.util.List;
import com.maganda.dao.SubcategoriaMapper;
import com.maganda.domain.Subcategoria;
import com.maganda.domain.SubcategoriaExample;

public class SubcategoriaManager {
	
	private SubcategoriaMapper subcategoriaMapper;
	
	public SubcategoriaMapper getSubcategoriaMapper() {
		return subcategoriaMapper;
	}
	
	public void setSubcategoriaMapper(SubcategoriaMapper subcategoriaMapper) {
		this.subcategoriaMapper = subcategoriaMapper;
	}
	
	public int countByExample(SubcategoriaExample example) {
		return subcategoriaMapper.countByExample(example);
	}
	
	public int deleteByExample(SubcategoriaExample example) {
		return subcategoriaMapper.deleteByExample(example);
	}
	
	public int deleteByPrimaryKey(Integer idsubcategoria) {
		return subcategoriaMapper.deleteByPrimaryKey(idsubcategoria);
	}
	
	public int insert(Subcategoria record) {
		return subcategoriaMapper.insert(record);
	}
	
	public int insertSelective(Subcategoria record) {
		return subcategoriaMapper.insertSelective(record);
	}
	
	public List<Subcategoria> selectByExample(SubcategoriaExample example) {
		return subcategoriaMapper.selectByExample(example);
	}
	
	public Subcategoria selectByPrimaryKey(Integer idsubcategoria) {
		return subcategoriaMapper.selectByPrimaryKey(idsubcategoria);
	}
	
	public int updateByExampleSelective(Subcategoria record, SubcategoriaExample example) {
		return subcategoriaMapper.updateByExampleSelective(record, example);
	}
	
	public int updateByExample(Subcategoria record, SubcategoriaExample example) {
		return subcategoriaMapper.updateByExample(record, example);
	}
	
	public int updateByPrimaryKeySelective(Subcategoria record) {
		return subcategoriaMapper.updateByPrimaryKeySelective(record);
	}
	
	public int updateByPrimaryKey(Subcategoria record) {
		return subcategoriaMapper.updateByPrimaryKey(record);
	}
}
