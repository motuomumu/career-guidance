package edu.swjtuhc.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.UserMapper;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper UserMapper;

	@Override
	public List<SysUser> selectUsers() {
		// TODO Auto-generated method stub
		return UserMapper.selectAllUsers();
	}

	@Override
	public List<SysUser> selectAllUsers() {
		// TODO Auto-generated method stub
		return UserMapper.selectAllUsers();
	}

	@Override
	public List<SysUser> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
