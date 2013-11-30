package com.maganda.dao;

import com.maganda.domain.Documento;
import com.maganda.domain.DocumentoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocumentoMapper {
    int countByExample(DocumentoExample example);

    int deleteByExample(DocumentoExample example);

    int deleteByPrimaryKey(Integer iddocumento);

    int insert(Documento record);

    int insertSelective(Documento record);

    List<Documento> selectByExample(DocumentoExample example);

    Documento selectByPrimaryKey(Integer iddocumento);

    int updateByExampleSelective(@Param("record") Documento record, @Param("example") DocumentoExample example);

    int updateByExample(@Param("record") Documento record, @Param("example") DocumentoExample example);

    int updateByPrimaryKeySelective(Documento record);

    int updateByPrimaryKey(Documento record);
}