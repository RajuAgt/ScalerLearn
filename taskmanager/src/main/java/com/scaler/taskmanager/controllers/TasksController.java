package com.scaler.taskmanager.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scaler.taskmanager.services.TasksService;

@RestController
@RequestMapping("/tasks")
public class TasksController {

	final TasksService tasksService;
	
	public TasksController(TasksService tasksService) {
		this.tasksService = tasksService;
	}
}
