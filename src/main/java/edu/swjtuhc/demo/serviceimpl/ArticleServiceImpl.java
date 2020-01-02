package edu.swjtuhc.demo.serviceimpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.subst.Token;
import edu.swjtuhc.demo.mapper.ArticleMapper;
import edu.swjtuhc.demo.model.Article;
import edu.swjtuhc.demo.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	private ArticleMapper ArticleMapper;
	
	@Autowired
	 public ArticleServiceImpl(
			
			 ArticleMapper articleMapper
			 ) {
		this.ArticleMapper=ArticleMapper;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public int createarticle(Article a) {
		// TODO Auto-generated method stub
		Article u = ArticleMapper.getArticle(a.getArticle());
		if(u!=null&&u.getaId()!=null&&u.getaId()>0) {
			return -2;
		}else if(a.getArticle()==null||a.getArticle().length()<1){
			return -1;
		}else {
			a.setPublicDate(new Date());
		
		}	
		return ArticleMapper.createArticle(a);
	}

	@Override
	public int updateArticle(Article a) {
		// TODO Auto-generated method stub
		ArticleMapper.getArticle(a.getArticle());
		if(a.getArticle()==null||a.getArticle().length()<1) {
			return -1;
		}else if(a.getAname()==null||a.getAname().length()<1){
			return -2;
		}else if(a.getWriter()==null||a.getWriter().length()<1){
			return -3;
		}else{
			a.setPublicDate(new Date());
		}	
		return ArticleMapper.updateArticle(a);
	}

	@Override
	public int deleteArticle(Article a) {
		// TODO Auto-generated method stub
		if(a.getaId()==null) {
			return -1;
		}else{
			return ArticleMapper.deleteArticle(a);
		}
	}
	
}

