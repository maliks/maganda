package com.maganda.logic;

import java.util.List;
import com.maganda.dao.PersonaMapper;
import com.maganda.domain.Persona;
import com.maganda.domain.PersonaExample;

public class PersonaManager {
	
	private PersonaMapper personaMapper;
	
	public PersonaMapper getPersonaMapper() {
		return personaMapper;
	}
	
	public void setPersonaMapper(PersonaMapper personaMapper) {
		this.personaMapper = personaMapper;
	}
	
	public int countByExample(PersonaExample example) {
		return personaMapper.countByExample(example);
	}
	
	public int deleteByExample(PersonaExample example) {
		return personaMapper.deleteByExample(example);
	}
	
	public int deleteByPrimaryKey(Integer iddocumento, String numdocumento) {
		return personaMapper.deleteByPrimaryKey(iddocumento, numdocumento);
	}
	
	public int insert(Persona record) {
		return personaMapper.insert(record);
	}
	
	public int insertSelective(Persona record) {
		return personaMapper.insertSelective(record);
	}
	
	public List<Persona> selectByExample(PersonaExample example) {
		return personaMapper.selectByExample(example);
	}
	
	public Persona selectByPrimaryKey(Integer iddocumento, String numdocumento) {
		return personaMapper.selectByPrimaryKey(iddocumento, numdocumento);
	}
	
	public int updateByExampleSelective(Persona record, PersonaExample example) {
		return personaMapper.updateByExampleSelective(record, example);
	}
	
	public int updateByExample(Persona record, PersonaExample example) {
		return personaMapper.updateByExample(record, example);
	}
	
	public int updateByPrimaryKeySelective(Persona record) {
		return personaMapper.updateByPrimaryKeySelective(record);
	}
	
	public int updateByPrimaryKey(Persona record) {
		return personaMapper.updateByPrimaryKey(record);
	}
}
