package com.maganda.dao;

import com.maganda.domain.Marca;
import com.maganda.domain.MarcaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarcaMapper {
    int countByExample(MarcaExample example);

    int deleteByExample(MarcaExample example);

    int deleteByPrimaryKey(Integer idmarca);

    int insert(Marca record);

    int insertSelective(Marca record);

    List<Marca> selectByExample(MarcaExample example);

    Marca selectByPrimaryKey(Integer idmarca);

    int updateByExampleSelective(@Param("record") Marca record, @Param("example") MarcaExample example);

    int updateByExample(@Param("record") Marca record, @Param("example") MarcaExample example);

    int updateByPrimaryKeySelective(Marca record);

    int updateByPrimaryKey(Marca record);
}