package com.simas.task_manager;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private LocalDate dueDate;
    private String status;

    public Task(){}

    public Task(Long id, String name, String description, LocalDate dueDate, String status) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public LocalDate getDueDate() { return dueDate; }

    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
}

