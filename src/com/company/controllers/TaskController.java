package com.company.controllers;

import com.company.repositories.TaskRepo;

public class TaskController {

    public TaskRepo taskRepository;

    public void accept(int taskId, int studentId) {
        taskRepository.accept(taskId, studentId);
    }

    public void cancel(int taskId, int studentId) {
        taskRepository.cancel(taskId, studentId);
    }
}
