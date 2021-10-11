package com.company.implementations;

import com.company.repositories.TaskRepo;

public class TaskRepoImpl implements TaskRepo {
    @Override
    public void accept(int taskId, int studentId) {
        //тут нужно сделать passed = true;
    }

    @Override
    public void cancel(int taskId, int studentId) {
        //тут нужно сделать passed = false;
    }
}
