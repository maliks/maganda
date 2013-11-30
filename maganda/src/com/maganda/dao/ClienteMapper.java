package com.maganda.dao;

import com.maganda.domain.Cliente;
import com.maganda.domain.ClienteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClienteMapper {
    int countByExample(ClienteExample example);

    int deleteByExample(ClienteExample example);

    int deleteByPrimaryKey(Integer idcliente);

    int insert(Cliente record);

    int insertSelective(Cliente record);

    List<Cliente> selectByExample(ClienteExample example);

    Cliente selectByPrimaryKey(Integer idcliente);

    int updateByExampleSelective(@Param("record") Cliente record, @Param("example") ClienteExample example);

    int updateByExample(@Param("record") Cliente record, @Param("example") ClienteExample example);

    int updateByPrimaryKeySelective(Cliente record);

    int updateByPrimaryKey(Cliente record);
}