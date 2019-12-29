package edu.swjtuhc.demo.service;

import java.util.List;

import edu.swjtuhc.demo.model.SysUser;

public interface UserService {
	public int register(SysUser user);
	String login(String username, String password);
}
