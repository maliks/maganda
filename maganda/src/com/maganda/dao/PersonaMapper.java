package com.maganda.dao;

import com.maganda.domain.Persona;
import com.maganda.domain.PersonaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonaMapper {
    int countByExample(PersonaExample example);

    int deleteByExample(PersonaExample example);

    int deleteByPrimaryKey(@Param("iddocumento") Integer iddocumento, @Param("numdocumento") String numdocumento);

    int insert(Persona record);

    int insertSelective(Persona record);

    List<Persona> selectByExample(PersonaExample example);

    Persona selectByPrimaryKey(@Param("iddocumento") Integer iddocumento, @Param("numdocumento") String numdocumento);

    int updateByExampleSelective(@Param("record") Persona record, @Param("example") PersonaExample example);

    int updateByExample(@Param("record") Persona record, @Param("example") PersonaExample example);

    int updateByPrimaryKeySelective(Persona record);

    int updateByPrimaryKey(Persona record);
}