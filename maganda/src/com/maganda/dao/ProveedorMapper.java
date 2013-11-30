package com.maganda.dao;

import com.maganda.domain.Proveedor;
import com.maganda.domain.ProveedorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProveedorMapper {
    int countByExample(ProveedorExample example);

    int deleteByExample(ProveedorExample example);

    int deleteByPrimaryKey(Integer idproveedor);

    int insert(Proveedor record);

    int insertSelective(Proveedor record);

    List<Proveedor> selectByExample(ProveedorExample example);

    Proveedor selectByPrimaryKey(Integer idproveedor);

    int updateByExampleSelective(@Param("record") Proveedor record, @Param("example") ProveedorExample example);

    int updateByExample(@Param("record") Proveedor record, @Param("example") ProveedorExample example);

    int updateByPrimaryKeySelective(Proveedor record);

    int updateByPrimaryKey(Proveedor record);
}