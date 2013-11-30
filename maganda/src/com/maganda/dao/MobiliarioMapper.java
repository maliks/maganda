package com.maganda.dao;

import com.maganda.domain.Mobiliario;
import com.maganda.domain.MobiliarioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MobiliarioMapper {
    int countByExample(MobiliarioExample example);

    int deleteByExample(MobiliarioExample example);

    int deleteByPrimaryKey(Integer idmobiliario);

    int insert(Mobiliario record);

    int insertSelective(Mobiliario record);

    List<Mobiliario> selectByExample(MobiliarioExample example);

    Mobiliario selectByPrimaryKey(Integer idmobiliario);

    int updateByExampleSelective(@Param("record") Mobiliario record, @Param("example") MobiliarioExample example);

    int updateByExample(@Param("record") Mobiliario record, @Param("example") MobiliarioExample example);

    int updateByPrimaryKeySelective(Mobiliario record);

    int updateByPrimaryKey(Mobiliario record);
}