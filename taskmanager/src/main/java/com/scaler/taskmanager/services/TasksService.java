package com.scaler.taskmanager.services;

import org.springframework.stereotype.Service;

import com.scaler.taskmanager.repositories.NotesRepository;
import com.scaler.taskmanager.repositories.TasksRepository;

@Service
public class TasksService {

	final TasksRepository tasksRepository;
	
	final NotesRepository notesRepository;
	
	/*@AutoWired
	 * Autowired or final can be used - learn more
	final TasksRepository tasksRepository;
	@AutoWired
	final NotesRepository notesRepository;
	*/
	
	public TasksService(TasksRepository tasksRepository, NotesRepository notesRepository) {
		this.tasksRepository = tasksRepository;
		this.notesRepository = notesRepository;
	}
}
