package edu.swjtuhc.demo.model;

import java.util.Date;



public class Article {
	
	private Long aId;
	private String article;
	private Date publicDate =new Date();
	private String Aname;
	private String writer;
	public Long getaId() {
		return aId;
	}
	public void setaId(Long aId) {
		this.aId = aId;
	}
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		this.article = article;
	}
	public Date getPublicDate() {
		return publicDate;
	}
	public void setPublicDate(Date publicDate) {
		this.publicDate = publicDate;
	}
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "Article [aId=" + aId + ", article=" + article + ", publicDate=" + publicDate + ", Aname=" + Aname
				+ ", writer=" + writer + "]";
	}
	
}
