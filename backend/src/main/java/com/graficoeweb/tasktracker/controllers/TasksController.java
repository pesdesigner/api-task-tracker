package com.graficoeweb.tasktracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graficoeweb.tasktracker.dto.TasksDTO;
import com.graficoeweb.tasktracker.services.TasksService;

@RestController
@RequestMapping(value = "/tasks")
public class TasksController {
	
	@Autowired
	private TasksService service;
	
	@GetMapping
	public ResponseEntity<List<TasksDTO>> findAll() {
		List<TasksDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
