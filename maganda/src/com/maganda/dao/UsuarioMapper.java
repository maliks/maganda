package com.maganda.dao;

import com.maganda.domain.Usuario;
import com.maganda.domain.UsuarioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsuarioMapper {
    int countByExample(UsuarioExample example);

    int deleteByExample(UsuarioExample example);

    int insert(Usuario record);

    int insertSelective(Usuario record);

    List<Usuario> selectByExample(UsuarioExample example);

    int updateByExampleSelective(@Param("record") Usuario record, @Param("example") UsuarioExample example);

    int updateByExample(@Param("record") Usuario record, @Param("example") UsuarioExample example);
}