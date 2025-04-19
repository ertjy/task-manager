package com.simas.task_manager.repository;

import com.simas.task_manager.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> { }
