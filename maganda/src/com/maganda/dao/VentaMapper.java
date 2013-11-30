package com.maganda.dao;

import com.maganda.domain.Venta;
import com.maganda.domain.VentaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VentaMapper {
    int countByExample(VentaExample example);

    int deleteByExample(VentaExample example);

    int deleteByPrimaryKey(@Param("iddocumento") Integer iddocumento, @Param("numventa") Integer numventa);

    int insert(Venta record);

    int insertSelective(Venta record);

    List<Venta> selectByExample(VentaExample example);

    Venta selectByPrimaryKey(@Param("iddocumento") Integer iddocumento, @Param("numventa") Integer numventa);

    int updateByExampleSelective(@Param("record") Venta record, @Param("example") VentaExample example);

    int updateByExample(@Param("record") Venta record, @Param("example") VentaExample example);

    int updateByPrimaryKeySelective(Venta record);

    int updateByPrimaryKey(Venta record);
}