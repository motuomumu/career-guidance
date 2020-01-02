package edu.swjtuhc.demo.controller;

import org.hibernate.validator.cfg.context.ReturnValueConstraintMappingContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Order;
import edu.swjtuhc.demo.service.OrderService;
import net.sf.json.JSONObject;


@RestController
@RequestMapping("/user")
public class OrderController {

	@Autowired
	 OrderService orderService;
	
	//上传 申请表
	@RequestMapping(value = "/order",method=RequestMethod.GET)
	public JSONObject createorder(@RequestBody Order o) {
		
		JSONObject result=new JSONObject();
		try {
			int i=orderService.createorder(o);
			if(i==-1) {
				result.put("state", "fail");
				result.put("msg", "文章内容不能为空");
			}else if(i==0){
				result.put("state", "fail");
				result.put("msg", "数据库内部错误");
			}
			else if(i==1){
				result.put("state", "success");
				result.put("msg", "上传成功");
			}
		} catch (Exception e) {
			// TODO: handle exception
			result.put("state", "fail");
			result.put("msg", "数据库内部错误");
		}
		return result;
	}
	//更新申请表
	@RequestMapping(value="updateOrder",method=RequestMethod.POST)
	public JSONObject updateOrder(@RequestBody Order o) {
		
		JSONObject result=new JSONObject();
		try { 
			int i=orderService.updateorder(o);
			if(i==-1) {
				result.put("state","fail");
        		result.put("msg", "文章内容不能为空");
			}else if(i==-2) {
        		result.put("state","fail");
        		result.put("msg", "时间不能为空");
        	}else if(i==-3) {
        		result.put("state","fail");
        		result.put("msg", "姓名不能为空");
        	}else if(i==0) {
        		result.put("state","fail");
        		result.put("msg", "数据库内部错误");
        	}else if(i==1) {
        		result.put("state","success");
        		result.put("msg", "修改成功");
        	}
		} catch (Exception e) {
			// TODO: handle exception
			result.put("state","fail");
    		result.put("msg", "服务器内部错误");
		}
		return result;
	}
	//删除申请
	@RequestMapping(value="/deletorder",method=RequestMethod.POST)
	public JSONObject delectorder(@RequestBody Order o) {
		JSONObject result = new JSONObject(); 
		try {
			int i=orderService.deleteorder(o);
			if (i==-1) {
				result.put("state", "fail");
				result.put("msg", "内部错误");
			}else if(i==1) {
				result.put("state", "fail");
				result.put("msg", "删除成功");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			result.put("state","fail");
    		result.put("msg", "服务器内部错误");
		}
		return result;  
	}
	
}
