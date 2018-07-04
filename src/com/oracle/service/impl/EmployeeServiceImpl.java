package com.oracle.service.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.dao.EmployeeMapper;
import com.oracle.po.Employee;
import com.oracle.service.EmployeeService;

@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private SqlSessionTemplate sqlSession;
	@Override
	public Employee selectByPrimaryKey(String phone) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(EmployeeMapper.class).selectByPrimaryKey(phone);
	}
	@Override
	public int deleteByPrimaryKey(String phone) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(EmployeeMapper.class).deleteByPrimaryKey(phone);
	}
	@Override
	public int insert(Employee record) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(EmployeeMapper.class).insert(record);
	}
	@Override
	public int insertSelective(Employee record) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(EmployeeMapper.class).insertSelective(record);
	}
	@Override
	public int updateByPrimaryKeySelective(Employee record) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(EmployeeMapper.class).updateByPrimaryKeySelective(record);
	}
	@Override
	public int updateByPrimaryKey(Employee record) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(EmployeeMapper.class).updateByPrimaryKey(record);
	}

}
