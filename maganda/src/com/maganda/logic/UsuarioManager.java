package com.maganda.logic;

import java.util.List;
import com.maganda.dao.UsuarioMapper;
import com.maganda.domain.Usuario;
import com.maganda.domain.UsuarioExample;

public class UsuarioManager {
	
	private UsuarioMapper usuarioMapper;
	
	
	public UsuarioMapper getUsuarioMapper() {
		return usuarioMapper;
	}

	
	public void setUsuarioMapper(UsuarioMapper usuarioMapper) {
		this.usuarioMapper = usuarioMapper;
	}

	public int countByExample(UsuarioExample example) {
		return usuarioMapper.countByExample(example);
	}
	
	public int deleteByExample(UsuarioExample example) {
		return usuarioMapper.deleteByExample(example);
	}
	
	public int insert(Usuario record) {
		return usuarioMapper.insert(record);
	}
	
	public int insertSelective(Usuario record) {
		return usuarioMapper.insertSelective(record);
	}
	
	public List<Usuario> selectByExample(UsuarioExample example) {
		return usuarioMapper.selectByExample(example);
	}
	
	public int updateByExampleSelective(Usuario record, UsuarioExample example) {
		return usuarioMapper.updateByExampleSelective(record, example);
	}
	
	public int updateByExample(Usuario record, UsuarioExample example) {
		return usuarioMapper.updateByExample(record, example);
	}
}
