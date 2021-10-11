package com.company.repositories;

public interface TaskRepo {
    void accept(int taskId, int studentId);
    void cancel(int taskId, int studentId);
}
