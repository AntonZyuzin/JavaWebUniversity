package com.company.repositories;

import com.company.entities.Student;

public interface StudentRepo {
    void save(Student s);
    void remove(int studentId);
}
