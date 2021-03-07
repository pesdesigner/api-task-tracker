package com.graficoeweb.tasktracker.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graficoeweb.tasktracker.entities.Tasks;

public interface TasksRepository extends JpaRepository<Tasks, Long> {
	List<Tasks> findAllByOrderByTextAsc();
}
