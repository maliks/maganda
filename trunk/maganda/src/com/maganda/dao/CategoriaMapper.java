package com.maganda.dao;

import com.maganda.domain.Categoria;
import com.maganda.domain.CategoriaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoriaMapper {
    int countByExample(CategoriaExample example);

    int deleteByExample(CategoriaExample example);

    int deleteByPrimaryKey(Integer idcategoria);

    int insert(Categoria record);

    int insertSelective(Categoria record);

    List<Categoria> selectByExample(CategoriaExample example);

    Categoria selectByPrimaryKey(Integer idcategoria);

    int updateByExampleSelective(@Param("record") Categoria record, @Param("example") CategoriaExample example);

    int updateByExample(@Param("record") Categoria record, @Param("example") CategoriaExample example);

    int updateByPrimaryKeySelective(Categoria record);

    int updateByPrimaryKey(Categoria record);
}