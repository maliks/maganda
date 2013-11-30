package com.maganda.dao;

import com.maganda.domain.Detallecompra;
import com.maganda.domain.DetallecompraExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DetallecompraMapper {
    int countByExample(DetallecompraExample example);

    int deleteByExample(DetallecompraExample example);

    int insert(Detallecompra record);

    int insertSelective(Detallecompra record);

    List<Detallecompra> selectByExample(DetallecompraExample example);

    int updateByExampleSelective(@Param("record") Detallecompra record, @Param("example") DetallecompraExample example);

    int updateByExample(@Param("record") Detallecompra record, @Param("example") DetallecompraExample example);
}