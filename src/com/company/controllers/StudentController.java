package com.company.controllers;

import com.company.entities.Student;
import com.company.repositories.StudentRepo;


public class StudentController {
    public int studentId = 0;
    public StudentRepo studentRepository;

    public void save(String studentName) {
        Student s = new Student(studentId, studentName);
        studentRepository.save(s);
        studentId++;
    }

    public void remove(int id) {
        studentRepository.remove(id);
    }
}
