package com.scaler.taskmanager.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Index;
import javax.persistence.OneToMany;

import java.util.Date;
import java.util.List;

@Entity(name="tasks")
public class TaskEntity extends BaseEntity{

	@Column(name="title", nullable=false, length=150)
	String title;
	@Column(name="description", nullable=false, length=150)
	String description;
	@Column(name="completed", nullable=false, columnDefinition="boolean defaults to false")
	Boolean completed;
	@Column(name="due_date", nullable=true)
	Date dueDate;
	
	/*
	 * @OneToMany(mappedBy = "task", fetch = FetchType.EAGER) List<NoteEntity>
	 * notes;
	 */
}
