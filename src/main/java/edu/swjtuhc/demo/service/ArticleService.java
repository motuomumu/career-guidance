package edu.swjtuhc.demo.service;

import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.model.Article;
@Service

public interface ArticleService {

	int createarticle(Article a);

	int updateArticle(Article a);

	int deleteArticle(Article a);
	
	
}
