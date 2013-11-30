package com.maganda.dao;

import com.maganda.domain.Gasto;
import com.maganda.domain.GastoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GastoMapper {
    int countByExample(GastoExample example);

    int deleteByExample(GastoExample example);

    int deleteByPrimaryKey(Integer idgasto);

    int insert(Gasto record);

    int insertSelective(Gasto record);

    List<Gasto> selectByExample(GastoExample example);

    Gasto selectByPrimaryKey(Integer idgasto);

    int updateByExampleSelective(@Param("record") Gasto record, @Param("example") GastoExample example);

    int updateByExample(@Param("record") Gasto record, @Param("example") GastoExample example);

    int updateByPrimaryKeySelective(Gasto record);

    int updateByPrimaryKey(Gasto record);
}