package edu.swjtuhc.demo.controller;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.SysUser;
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
//		@RequestMapping(value = "/login", method = RequestMethod.POST)
//		public JSONObject login(@RequestBody Sysuser user) {
//			JSONObject result = new JSONObject();
//		}
		 
}
