package com.maganda.dao;

import com.maganda.domain.Detalleventa;
import com.maganda.domain.DetalleventaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DetalleventaMapper {
    int countByExample(DetalleventaExample example);

    int deleteByExample(DetalleventaExample example);

    int insert(Detalleventa record);

    int insertSelective(Detalleventa record);

    List<Detalleventa> selectByExample(DetalleventaExample example);

    int updateByExampleSelective(@Param("record") Detalleventa record, @Param("example") DetalleventaExample example);

    int updateByExample(@Param("record") Detalleventa record, @Param("example") DetalleventaExample example);
}