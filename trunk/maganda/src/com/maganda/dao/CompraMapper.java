package com.maganda.dao;

import com.maganda.domain.Compra;
import com.maganda.domain.CompraExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompraMapper {
    int countByExample(CompraExample example);

    int deleteByExample(CompraExample example);

    int deleteByPrimaryKey(@Param("iddocumento") Integer iddocumento, @Param("numcompra") String numcompra);

    int insert(Compra record);

    int insertSelective(Compra record);

    List<Compra> selectByExample(CompraExample example);

    Compra selectByPrimaryKey(@Param("iddocumento") Integer iddocumento, @Param("numcompra") String numcompra);

    int updateByExampleSelective(@Param("record") Compra record, @Param("example") CompraExample example);

    int updateByExample(@Param("record") Compra record, @Param("example") CompraExample example);

    int updateByPrimaryKeySelective(Compra record);

    int updateByPrimaryKey(Compra record);
}