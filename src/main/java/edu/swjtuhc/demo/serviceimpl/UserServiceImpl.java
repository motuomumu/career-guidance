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
		SysUser u1 =userMapper.selectUserByUsername(user.getUsername());
		int i=1;
		if(u1==null) {
			i=userMapper.insertUser(user);
		}else {
			i=0;
		}
		return i;
	}
	
	
}
