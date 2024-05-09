package com.panchalprogrammingacademy.service;

import com.panchalprogrammingacademy.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    void addStudent(Student student);
    void updateStudent(Student updatedStudent);
    void deleteStudent(int studentId);

    Student getStudentById(int studentId);
}
