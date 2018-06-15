package com.hlf.ssm.dao;

import java.util.List;

import com.hlf.ssm.model.Goods;

public interface GoodsMapper {
	
	int insert(Goods goods);
	
	int deleteById(int id);
	
	int updateById(int id); 
	
	Goods selectById(int id);
	
	List<Goods> findAll();

}