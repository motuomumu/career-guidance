package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.SysUser;

@Mapper
public interface UserMapper {
	public SysUser selectUserByUsername(String username);
	
	public int insertUser(SysUser user);
	
}
