package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Time;
import edu.swjtuhc.demo.service.TimeService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/time")
public class TimeController {

	@Autowired
	private TimeService TimeService;
	
	@RequestMapping(value="/time",method=RequestMethod.GET )
	public JSONObject createtime(@RequestBody Time t) {
		
		JSONObject result = new JSONObject(); 
		try {
			int i=TimeService.createtime(t);
			if (i==-1) {
				result.put("state", "fail");
				result.put("meg", "星期几不能为空");
			}else if(i==0){
				result.put("state", "fail");
				result.put("meg", "内部出错");
			}else if(i==1){
				result.put("state", "success");
				result.put("meg", "上传成功");
			}
		} catch (Exception e) {
			// TODO: handle exception
			result.put("state", "fail");
			result.put("meg", "内部出错");
		}
		return result;
	}
}
