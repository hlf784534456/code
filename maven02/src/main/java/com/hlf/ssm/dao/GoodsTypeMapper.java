package com.hlf.ssm.dao;

import java.util.List;

import com.hlf.ssm.model.Goods;
import com.hlf.ssm.model.GoodsType;

public interface GoodsTypeMapper {
	
	int insert(GoodsType goodsType);
	
	int deleteById(int id);
	
	int updateById(int id);
	
	GoodsType selectById(int id);
	
	List<GoodsType> findAll();

}