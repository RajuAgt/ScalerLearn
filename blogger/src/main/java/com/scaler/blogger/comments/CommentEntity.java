package com.scaler.blogger.comments;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.ManyToOne;

import com.scaler.blogger.commons.BaseEntity;
import com.scaler.blogger.users.UserEntity;
import com.scaler.blogger.articles.ArticleEntity;

@Entity
public class CommentEntity extends BaseEntity{

	@Column(nullable=false, length=100)
	String title;
	@Column(nullable=false)
	String body;
	
	@ManyToOne
	UserEntity auther;
	@ManyToOne
	ArticleEntity article;
}
