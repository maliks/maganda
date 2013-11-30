package com.maganda.dao;

import com.maganda.domain.Subcategoria;
import com.maganda.domain.SubcategoriaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubcategoriaMapper {
    int countByExample(SubcategoriaExample example);

    int deleteByExample(SubcategoriaExample example);

    int deleteByPrimaryKey(Integer idsubcategoria);

    int insert(Subcategoria record);

    int insertSelective(Subcategoria record);

    List<Subcategoria> selectByExample(SubcategoriaExample example);

    Subcategoria selectByPrimaryKey(Integer idsubcategoria);

    int updateByExampleSelective(@Param("record") Subcategoria record, @Param("example") SubcategoriaExample example);

    int updateByExample(@Param("record") Subcategoria record, @Param("example") SubcategoriaExample example);

    int updateByPrimaryKeySelective(Subcategoria record);

    int updateByPrimaryKey(Subcategoria record);
}