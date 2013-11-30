package com.maganda.dao;

import com.maganda.domain.Producto;
import com.maganda.domain.ProductoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductoMapper {
    int countByExample(ProductoExample example);

    int deleteByExample(ProductoExample example);

    int deleteByPrimaryKey(Integer idproducto);

    int insert(Producto record);

    int insertSelective(Producto record);

    List<Producto> selectByExample(ProductoExample example);

    Producto selectByPrimaryKey(Integer idproducto);

    int updateByExampleSelective(@Param("record") Producto record, @Param("example") ProductoExample example);

    int updateByExample(@Param("record") Producto record, @Param("example") ProductoExample example);

    int updateByPrimaryKeySelective(Producto record);

    int updateByPrimaryKey(Producto record);
}