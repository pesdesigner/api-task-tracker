package com.graficoeweb.tasktracker.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.graficoeweb.tasktracker.dto.TasksDTO;
import com.graficoeweb.tasktracker.entities.Tasks;
import com.graficoeweb.tasktracker.repositories.TasksRepository;

@Service
public class TasksService {
	
	@Autowired
	private TasksRepository repository;
	
	@Transactional(readOnly = true)
	public List<TasksDTO> findAll() {
		List<Tasks> list = repository.findAllByOrderByTextAsc();
		return list.stream().map(x -> new TasksDTO(x)).collect(Collectors.toList());		
	}
	
	@Transactional
	public TasksDTO insert(TasksDTO dto) {
		Tasks tasks = new Tasks(null, dto.getText(), dto.getDay(), dto.isReminder());
		tasks = repository.save(tasks);
		return new TasksDTO(tasks);
	}
}
