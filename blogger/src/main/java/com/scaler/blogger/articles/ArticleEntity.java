package com.scaler.blogger.articles;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;

import com.scaler.blogger.commons.BaseEntity;
import com.scaler.blogger.users.UserEntity;

@Entity(name="articles")
public class ArticleEntity extends BaseEntity{
	
	@Column(unique=true, nullable=false, length=150)
	String slug;
	@Column(nullable=false, length=200)
	String title;
	String subtitle;
	@Column(nullable=false, length=8000)
	String body;
	//String[] taglist; //TODO implement this
	
	@ManyToOne
	UserEntity auther;
	@ManyToMany
	//Below JoinTable annotation is optional
	@JoinTable(
			name="article_likes",
			joinColumns = @JoinColumn(name="article_id"),
			inverseJoinColumns = @JoinColumn(name="user_id"))
	List<UserEntity> likedBy;
}
