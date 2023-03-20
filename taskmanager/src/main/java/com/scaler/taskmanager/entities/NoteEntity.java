package com.scaler.taskmanager.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Column;

@Entity(name="notes")
public class NoteEntity extends BaseEntity{
	
	@Column(name="body", nullable=false, length=500)
	String body;
	
	@ManyToOne
	TaskEntity task;
}
