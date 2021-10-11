package com.company.entities;

public class Task {
    private int studentId;
    private int taskId;
    private boolean passed;

    public Task(int studentId, int taskId, boolean passed) {
        this.studentId = studentId;
        this.taskId = taskId;
        this.passed = passed;
    }
}
