package com.maganda.logic;

import java.util.List;
import com.maganda.dao.ColorMapper;
import com.maganda.domain.Color;
import com.maganda.domain.ColorExample;

public class ColorManager {
	
	private ColorMapper colorMapper;
	
	public ColorMapper getColorMapper() {
		return colorMapper;
	}
	
	public void setColorMapper(ColorMapper colorMapper) {
		this.colorMapper = colorMapper;
	}
	
	public int countByExample(ColorExample example) {
		return colorMapper.countByExample(example);
	}
	
	public int deleteByExample(ColorExample example) {
		return colorMapper.deleteByExample(example);
	}
	
	public int deleteByPrimaryKey(Integer idcolor) {
		return colorMapper.deleteByPrimaryKey(idcolor);
	}
	
	public int insert(Color record) {
		return colorMapper.insert(record);
	}
	
	public int insertSelective(Color record) {
		return colorMapper.insertSelective(record);
	}
	
	public List<Color> selectByExample(ColorExample example) {
		return colorMapper.selectByExample(example);
	}
	
	public Color selectByPrimaryKey(Integer idcolor) {
		return colorMapper.selectByPrimaryKey(idcolor);
	}
	
	public int updateByExampleSelective(Color record, ColorExample example) {
		return colorMapper.updateByExampleSelective(record, example);
	}
	
	public int updateByExample(Color record, ColorExample example) {
		return colorMapper.updateByExample(record, example);
	}
	
	public int updateByPrimaryKeySelective(Color record) {
		return colorMapper.updateByPrimaryKeySelective(record);
	}
	
	public int updateByPrimaryKey(Color record) {
		return colorMapper.updateByPrimaryKey(record);
	}
}
