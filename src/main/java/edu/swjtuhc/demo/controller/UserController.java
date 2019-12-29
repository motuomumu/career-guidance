package edu.swjtuhc.demo.controller;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
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
			int i=userService.register(user);
			result.put("state", i);
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
