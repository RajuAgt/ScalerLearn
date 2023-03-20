package com.scaler.taskmanager.entities;

import javax.persistence.Id;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;

import lombok.Getter;

@MappedSuperclass
@Getter
public abstract class BaseEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@CreatedDate
	@Column(name="created_dt", nullable=false)
	private Date createdDt;
}
