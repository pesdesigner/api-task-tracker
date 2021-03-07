package com.graficoeweb.tasktracker.dto;

import java.io.Serializable;

import com.graficoeweb.tasktracker.entities.Tasks;

public class TasksDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String text;
	private String day;
	private boolean reminder;
	
	public TasksDTO() {
	}

	public TasksDTO(Long id, String text, String day, boolean reminder) {
		super();
		this.id = id;
		this.text = text;
		this.day = day;
		this.reminder = reminder;
	}
	
	public TasksDTO(Tasks entity) {
		super();
		id = entity.getId();
		text = entity.getText();
		day = entity.getDay();
		reminder = entity.getReminder();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public boolean isReminder() {
		return reminder;
	}

	public void setReminder(boolean reminder) {
		this.reminder = reminder;
	}
	
}
