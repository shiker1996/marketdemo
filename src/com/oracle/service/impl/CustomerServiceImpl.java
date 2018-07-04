package com.oracle.service.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.dao.CustomerMapper;
import com.oracle.po.Customer;
import com.oracle.service.CustomerService;

@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private SqlSessionTemplate sqlSession;
	@Override
	public Customer selectByPrimaryKey(String phone) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(CustomerMapper.class).selectByPrimaryKey(phone);
	}
	@Override
	public int deleteByPrimaryKey(String phone) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(CustomerMapper.class).deleteByPrimaryKey(phone);
	}
	@Override
	public int insert(Customer record) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(CustomerMapper.class).insert(record);
	}
	@Override
	public int insertSelective(Customer record) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(CustomerMapper.class).insertSelective(record);
	}
	@Override
	public int updateByPrimaryKeySelective(Customer record) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(CustomerMapper.class).updateByPrimaryKeySelective(record);
	}
	@Override
	public int updateByPrimaryKey(Customer record) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(CustomerMapper.class).updateByPrimaryKey(record);
	}

}
