package com.oracle.service.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.dao.RecordMapper;
import com.oracle.po.Record;
import com.oracle.service.RecordService;

@Service("recordService")
public class RecordServiceImpl implements RecordService {
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(RecordMapper.class).deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Record record) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(RecordMapper.class).insert(record);
	}

	@Override
	public int insertSelective(Record record) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(RecordMapper.class).insertSelective(record);
	}

	@Override
	public Record selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(RecordMapper.class).selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Record record) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(RecordMapper.class).updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Record record) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(RecordMapper.class).updateByPrimaryKey(record);
	}

	@Override
	public List<Record> selectByName(String name) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(RecordMapper.class).selectByName(name);
	}

}
