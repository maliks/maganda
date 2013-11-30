package com.maganda.dao;

import com.maganda.domain.Rol;
import com.maganda.domain.RolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolMapper {
    int countByExample(RolExample example);

    int deleteByExample(RolExample example);

    int deleteByPrimaryKey(Integer idrol);

    int insert(Rol record);

    int insertSelective(Rol record);

    List<Rol> selectByExample(RolExample example);

    Rol selectByPrimaryKey(Integer idrol);

    int updateByExampleSelective(@Param("record") Rol record, @Param("example") RolExample example);

    int updateByExample(@Param("record") Rol record, @Param("example") RolExample example);

    int updateByPrimaryKeySelective(Rol record);

    int updateByPrimaryKey(Rol record);
}