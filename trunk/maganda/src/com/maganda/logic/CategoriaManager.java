package com.maganda.logic;

import java.util.List;
import com.maganda.dao.CategoriaMapper;
import com.maganda.domain.Categoria;
import com.maganda.domain.CategoriaExample;

public class CategoriaManager {
	
	private CategoriaMapper categoriaMapper;
	
	public CategoriaMapper getCategoriaMapper() {
		return categoriaMapper;
	}
	
	public void setCategoriaMapper(CategoriaMapper categoriaMapper) {
		this.categoriaMapper = categoriaMapper;
	}
	
	public int countByExample(CategoriaExample example) {
		return categoriaMapper.countByExample(example);
	}
	
	public int deleteByExample(CategoriaExample example) {
		return categoriaMapper.deleteByExample(example);
	}
	
	public int deleteByPrimaryKey(Integer idcategoria) {
		return categoriaMapper.deleteByPrimaryKey(idcategoria);
	}
	
	public int insert(Categoria record) {
		return categoriaMapper.insert(record);
	}
	
	public int insertSelective(Categoria record) {
		return categoriaMapper.insertSelective(record);
	}
	
	public List<Categoria> selectByExample(CategoriaExample example) {
		return categoriaMapper.selectByExample(example);
	}
	
	public Categoria selectByPrimaryKey(Integer idcategoria) {
		return categoriaMapper.selectByPrimaryKey(idcategoria);
	}
	
	public int updateByExampleSelective(Categoria record, CategoriaExample example) {
		return categoriaMapper.updateByExampleSelective(record, example);
	}
	
	public int updateByExample(Categoria record, CategoriaExample example) {
		return categoriaMapper.updateByExample(record, example);
	}
	
	public int updateByPrimaryKeySelective(Categoria record) {
		return categoriaMapper.updateByPrimaryKeySelective(record);
	}
	
	public int updateByPrimaryKey(Categoria record) {
		return categoriaMapper.updateByPrimaryKey(record);
	}
}
