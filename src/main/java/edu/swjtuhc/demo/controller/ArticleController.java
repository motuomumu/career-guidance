package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.swjtuhc.demo.model.Article;
import edu.swjtuhc.demo.service.ArticleService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/article")
public class ArticleController {
	
	@Autowired
	private ArticleService ArticleService;
	
	//上传创建文章
	
	@RequestMapping(value="/article",method = RequestMethod.GET)
	public JSONObject createarticle(@RequestBody Article a) {
		
		JSONObject result=new JSONObject();
		try {
			int i=ArticleService.createarticle(a);
			if(i==-2) {
				result.put("state", "fail");
				result.put("msg", "该文章已经存在");
			}else if (i==-1) {
				result.put("state", "fail");
				result.put("msg", "文章内容不能为空");
			}else if (i==0) {
				result.put("state", "fail");
				result.put("msg", "内部错误文章内容不能为空");
			}else if(i==1) {
        		result.put("state","success");
        		result.put("msg", "上传成功");
        	}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			result.put("state","fail");
    		result.put("msg", "服务器内部错误");
		}
		return result;
		
	}
	//更新文章内容
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@RequestMapping(value="/updateArticle",method=RequestMethod.POST)
	public JSONObject updatearticle(@RequestBody Article a) {
		JSONObject result=new JSONObject();
		try {
			int i = ArticleService.updateArticle(a);
        	if(i==-1) {
        		result.put("state","fail");
        		result.put("msg", "文章内容不能为空");
        	}else if(i==-2) {
        		result.put("state","fail");
        		result.put("msg", "文章标题不能为空");
        	}else if(i==-3) {
        		result.put("state","fail");
        		result.put("msg", "作者姓名不能为空");
        	}else if(i==0) {
        		result.put("state","fail");
        		result.put("msg", "数据库内部错误");
        	}else if(i==1) {
        		result.put("state","success");
        		result.put("msg", "修改成功");
        	}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			result.put("state","fail");
    		result.put("msg", "服务器内部错误");
		}
		return result;
	}
	
	//删除文章
	  //@PreAuthorize("hasRole('ROLE_ADMIN')")
	    @RequestMapping(value="/deletearticle",method = RequestMethod.POST)
	    public JSONObject deletearticle(@RequestBody Article a) {
	    	
	    	JSONObject result = new JSONObject(); 
	    	try {
	    		int i = ArticleService.deleteArticle(a);
	        	if(i==-1) {
	        		result.put("state","fail");
	        		result.put("msg", "文章ID为空");
	        	}else if(i==0) {
	        		result.put("state","fail");
	        		result.put("msg", "数据库内部错误");
	        	}else if(i==1) {
	        		result.put("state","success");
	        		result.put("msg", "删除成功");
	        	}
			} catch (Exception e) {
				e.printStackTrace();
				result.put("state","fail");
	    		result.put("msg", "服务器内部错误");
			}    	
			return result;    	
	}
}
