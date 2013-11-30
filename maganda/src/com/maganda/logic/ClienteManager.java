package com.maganda.logic;

import java.util.List;
import com.maganda.dao.ClienteMapper;
import com.maganda.domain.Cliente;
import com.maganda.domain.ClienteExample;

public class ClienteManager {
	
	private ClienteMapper clienteMapper;
	
	public ClienteMapper getClienteMapper() {
		return clienteMapper;
	}
	
	public void setClienteMapper(ClienteMapper clienteMapper) {
		this.clienteMapper = clienteMapper;
	}
	
	public int countByExample(ClienteExample example) {
		return clienteMapper.countByExample(example);
	}
	
	public int deleteByExample(ClienteExample example) {
		return clienteMapper.deleteByExample(example);
	}
	
	public int deleteByPrimaryKey(Integer idcliente) {
		return clienteMapper.deleteByPrimaryKey(idcliente);
	}
	
	public int insert(Cliente record) {
		return clienteMapper.insert(record);
	}
	
	public int insertSelective(Cliente record) {
		return clienteMapper.insertSelective(record);
	}
	
	public List<Cliente> selectByExample(ClienteExample example) {
		return clienteMapper.selectByExample(example);
	}
	
	public Cliente selectByPrimaryKey(Integer idcliente) {
		return clienteMapper.selectByPrimaryKey(idcliente);
	}
	
	public int updateByExampleSelective(Cliente record, ClienteExample example) {
		return clienteMapper.updateByExampleSelective(record, example);
	}
	
	public int updateByExample(Cliente record, ClienteExample example) {
		return clienteMapper.updateByExample(record, example);
	}
	
	public int updateByPrimaryKeySelective(Cliente record) {
		return clienteMapper.updateByPrimaryKeySelective(record);
	}
	
	public int updateByPrimaryKey(Cliente record) {
		return clienteMapper.updateByPrimaryKey(record);
	}
}
