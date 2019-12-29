package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.model.UserRequest;

@Mapper
public interface UserMapper {
	//接口
	public SysUser selectUserByUsername(String username); 
	
	public int insertUser(SysUser user);
	
	
}
