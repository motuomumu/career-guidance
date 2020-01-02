package edu.swjtuhc.demo.controller;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.model.UserRequest;
import edu.swjtuhc.demo.model.UserResponse;
import edu.swjtuhc.demo.service.UserService;


//JSON格式
//RESTful 风格

@RestController
@RequestMapping("/user")
public class UserController {
		@Autowired
		UserService userService;
		
		@RequestMapping(value = "/register",method=RequestMethod.POST)
		public JSONObject register(@RequestBody SysUser user){
			JSONObject result =new JSONObject();
		try {
			int i=userService.register(user);
        	if(i==-3) {
        		result.put("state","fail");
        		result.put("msg", "密码不能为空");
        	}else if(i==-2) {
        		result.put("state","fail");
        		result.put("msg", "角色不能为空");
        	}else if(i==-1) {
        		result.put("state","fail");
        		result.put("msg", "账号已存在");
        	}else if(i==0) {
        		result.put("state","fail");
        		result.put("msg", "数据库内部错误");
        	}else if(i==1) {
        		result.put("state","success");
        		result.put("msg", "注册成功");
        	}
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state","fail");
    		result.put("msg", "服务器内部错误");
		}    	
		return result;    	
    }

		@RequestMapping(value = "/login", method = RequestMethod.POST)
		public JSONObject login(@RequestBody UserRequest userrequest) {
			JSONObject result = new JSONObject();
			try {
	    		final String token = userService.login(userrequest.getUsername(), userrequest.getPassword());
	    		UserResponse user = new UserResponse(token);
	    		result.put("state", "success");
	    		result.put("token", user.getToken());
	    	} catch (Exception e) {
				// TODO: handle exception
	    		e.printStackTrace();
	    		result.put("state", "fail");
	    		result.put("msg", "用户名或密码错误");
			}
			return result;
		}


}
