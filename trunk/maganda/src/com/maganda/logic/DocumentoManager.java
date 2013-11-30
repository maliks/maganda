package com.maganda.logic;

import java.util.List;
import com.maganda.dao.DocumentoMapper;
import com.maganda.domain.Documento;
import com.maganda.domain.DocumentoExample;

public class DocumentoManager {
	
	private DocumentoMapper documentoMapper;
	
	public DocumentoMapper getDocumentoMapper() {
		return documentoMapper;
	}
	
	public void setDocumentoMapper(DocumentoMapper documentoMapper) {
		this.documentoMapper = documentoMapper;
	}
	
	public int countByExample(DocumentoExample example) {
		return documentoMapper.countByExample(example);
	}
	
	public int deleteByExample(DocumentoExample example) {
		return documentoMapper.deleteByExample(example);
	}
	
	public int deleteByPrimaryKey(Integer iddocumento) {
		return documentoMapper.deleteByPrimaryKey(iddocumento);
	}
	
	public int insert(Documento record) {
		return documentoMapper.insert(record);
	}
	
	public int insertSelective(Documento record) {
		return documentoMapper.insertSelective(record);
	}
	
	public List<Documento> selectByExample(DocumentoExample example) {
		return documentoMapper.selectByExample(example);
	}
	
	public Documento selectByPrimaryKey(Integer iddocumento) {
		return documentoMapper.selectByPrimaryKey(iddocumento);
	}
	
	public int updateByExampleSelective(Documento record, DocumentoExample example) {
		return documentoMapper.updateByExampleSelective(record, example);
	}
	
	public int updateByExample(Documento record, DocumentoExample example) {
		return documentoMapper.updateByExample(record, example);
	}
	
	public int updateByPrimaryKeySelective(Documento record) {
		return documentoMapper.updateByPrimaryKeySelective(record);
	}
	
	public int updateByPrimaryKey(Documento record) {
		return documentoMapper.updateByPrimaryKey(record);
	}
}
