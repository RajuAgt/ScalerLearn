package com.scaler.blogger.users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

import com.scaler.blogger.commons.BaseEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.scaler.blogger.articles.ArticleEntity;

import java.util.List;

@Entity(name="users")
@Getter
@Setter
public class UserEntity extends BaseEntity{

	@Column(unique=true, nullable=false, length=50)
	String username;
	String password; //TODO: hash the password
	String email;
	String bio;
	String image;
	@ManyToMany(mappedBy = "likedBy")
	List<ArticleEntity> likedArticles;
	
	@ManyToMany
	@JoinTable(
			name="user_follows",
			joinColumns = @JoinColumn(name = "follower_id"),
			inverseJoinColumns = @JoinColumn(name = "following_id"))
	List<UserEntity> following;
	@ManyToMany(mappedBy="following")
	List<UserEntity> followers;
}
