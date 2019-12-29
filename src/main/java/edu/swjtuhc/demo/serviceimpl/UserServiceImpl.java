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
	UserMapper userMapper;
	@Override
	public int register(SysUser user) {
		// TODO Auto-generated method stub
		SysUser u0 =userMapper.selectUserByUsername(user.getUsername());
		System.out.println(user);
		int i=-1;
		if(u0==null) {
			System.out.println(user);
			i=userMapper.insertUser(user);
			
		}else {
			i=2;
		}
		return i;
	}
	@Override
	public String login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
