package com.maganda.logic;

import java.util.List;
import com.maganda.dao.EmpleadoMapper;
import com.maganda.domain.Empleado;
import com.maganda.domain.EmpleadoExample;

public class EmpleadoManager {
	
	private EmpleadoMapper empleadoMapper;
	
	public EmpleadoMapper getEmpleadoMapper() {
		return empleadoMapper;
	}
	
	public void setEmpleadoMapper(EmpleadoMapper empleadoMapper) {
		this.empleadoMapper = empleadoMapper;
	}
	
	public int countByExample(EmpleadoExample example) {
		return empleadoMapper.countByExample(example);
	}
	
	public int deleteByExample(EmpleadoExample example) {
		return empleadoMapper.deleteByExample(example);
	}
	
	public int deleteByPrimaryKey(Integer idempleado) {
		return empleadoMapper.deleteByPrimaryKey(idempleado);
	}
	
	public int insert(Empleado record) {
		return empleadoMapper.insert(record);
	}
	
	public int insertSelective(Empleado record) {
		return empleadoMapper.insertSelective(record);
	}
	
	public List<Empleado> selectByExample(EmpleadoExample example) {
		return empleadoMapper.selectByExample(example);
	}
	
	public Empleado selectByPrimaryKey(Integer idempleado) {
		return empleadoMapper.selectByPrimaryKey(idempleado);
	}
	
	public int updateByExampleSelective(Empleado record, EmpleadoExample example) {
		return empleadoMapper.updateByExampleSelective(record, example);
	}
	
	public int updateByExample(Empleado record, EmpleadoExample example) {
		return empleadoMapper.updateByExample(record, example);
	}
	
	public int updateByPrimaryKeySelective(Empleado record) {
		return empleadoMapper.updateByPrimaryKeySelective(record);
	}
	
	public int updateByPrimaryKey(Empleado record) {
		return empleadoMapper.updateByPrimaryKey(record);
	}
}
