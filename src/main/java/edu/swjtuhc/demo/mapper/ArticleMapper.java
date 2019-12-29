package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Article;

@Mapper
public interface ArticleMapper {
	Article getArticle(String article);
	Integer createArticle(Article Article);
	Integer updateArticle(Article Article);
	Integer deleteArticle(Article Article);
	
}
