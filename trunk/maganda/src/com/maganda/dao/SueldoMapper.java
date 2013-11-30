package com.maganda.dao;

import com.maganda.domain.Sueldo;
import com.maganda.domain.SueldoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SueldoMapper {
    int countByExample(SueldoExample example);

    int deleteByExample(SueldoExample example);

    int insert(Sueldo record);

    int insertSelective(Sueldo record);

    List<Sueldo> selectByExample(SueldoExample example);

    int updateByExampleSelective(@Param("record") Sueldo record, @Param("example") SueldoExample example);

    int updateByExample(@Param("record") Sueldo record, @Param("example") SueldoExample example);
}