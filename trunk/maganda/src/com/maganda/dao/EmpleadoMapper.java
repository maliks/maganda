package com.maganda.dao;

import com.maganda.domain.Empleado;
import com.maganda.domain.EmpleadoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpleadoMapper {
    int countByExample(EmpleadoExample example);

    int deleteByExample(EmpleadoExample example);

    int deleteByPrimaryKey(Integer idempleado);

    int insert(Empleado record);

    int insertSelective(Empleado record);

    List<Empleado> selectByExample(EmpleadoExample example);

    Empleado selectByPrimaryKey(Integer idempleado);

    int updateByExampleSelective(@Param("record") Empleado record, @Param("example") EmpleadoExample example);

    int updateByExample(@Param("record") Empleado record, @Param("example") EmpleadoExample example);

    int updateByPrimaryKeySelective(Empleado record);

    int updateByPrimaryKey(Empleado record);
}