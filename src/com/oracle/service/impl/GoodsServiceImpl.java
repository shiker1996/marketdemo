package com.oracle.service.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.dao.GoodsMapper;
import com.oracle.po.Goods;
import com.oracle.service.GoodsService;

@Service("GoodsService")
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	private SqlSessionTemplate sqlSession;
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(GoodsMapper.class).deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Goods record) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(GoodsMapper.class).insert(record);
	}

	@Override
	public int insertSelective(Goods record) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(GoodsMapper.class).insertSelective(record);
	}

	@Override
	public Goods selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(GoodsMapper.class).selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Goods record) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(GoodsMapper.class).updateByPrimaryKeySelective(record);
	}

	@Override
	public List<Goods> selectAll() {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(GoodsMapper.class).selectAll();
	}

	@Override
	public int updateByPrimaryKey(Goods record) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(GoodsMapper.class).updateByPrimaryKey(record);
	}

}
