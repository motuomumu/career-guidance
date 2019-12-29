package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import edu.swjtuhc.demo.mapper.ArticleMapper;
import edu.swjtuhc.demo.model.Article;
import edu.swjtuhc.demo.service.ArticleService;

public class ArticleServiceImpl implements ArticleService{

	private ArticleMapper ArticleMapper;
	
	@Autowired
	 public ArticleServiceImpl(
			 ) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int createarticle(Article a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateArticle(Article a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteArticle(Article a) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
