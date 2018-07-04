package com.oracle.service.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.dao.LoginMapper;
import com.oracle.po.Login;
import com.oracle.service.LoginService;
@Service("LoginService")
public class LoginServiceImpl implements LoginService{

	@Autowired
	private SqlSessionTemplate sqlSession;
	@Override
	public Login selectByPrimaryKey(String phone) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(LoginMapper.class).selectByPrimaryKey(phone);
	}
	@Override
	public int deleteByPrimaryKey(String phone) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(LoginMapper.class).deleteByPrimaryKey(phone);
	}
	@Override
	public int insert(Login record) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(LoginMapper.class).insert(record);
	}
	@Override
	public int insertSelective(Login record) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(LoginMapper.class).insertSelective(record);
	}
	@Override
	public int updateByPrimaryKeySelective(Login record) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(LoginMapper.class).updateByPrimaryKeySelective(record);
	}
	@Override
	public int updateByPrimaryKey(Login record) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(LoginMapper.class).updateByPrimaryKey(record);
	}

}
