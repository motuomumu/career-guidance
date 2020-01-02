package edu.swjtuhc.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.model.SysUser;
@Service
public interface UserService {
	public int register(SysUser user);
	String login(String username, String password);
}
