package com.company.implementations;

import com.company.entities.Student;
import com.company.repositories.StudentRepo;

import static com.company.Database._listOfStudents;

public class StudentRepoImpl implements StudentRepo {
    @Override
    public void save(Student s) {
        _listOfStudents.add(s);
    }

    @Override
    public void remove(int studentId) {
        _listOfStudents.remove(studentId);
    }
}
