package com.panchalprogrammingacademy.service;
import com.panchalprogrammingacademy.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private List<Student> students = new ArrayList<>();
    private int nextId = 1;

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public void addStudent(Student student) {
        student.setId(nextId++);
        students.add(student);
    }

    @Override
    public void updateStudent(Student updatedStudent) {
        for (Student student : students) {
            if (student.getId() == updatedStudent.getId()) {
                student.setName(updatedStudent.getName());
                student.setMatriculationNumber(updatedStudent.getMatriculationNumber());
                student.setEmail(updatedStudent.getEmail());
                student.setPhoneNumber(updatedStudent.getPhoneNumber());
                student.setAddress(updatedStudent.getAddress());
                break;
            }
        }
    }

    @Override
    public void deleteStudent(int studentId) {
        students.removeIf(student -> student.getId() == studentId);
    }

    @Override
    public Student getStudentById(int studentId) {
        return null;
    }
}
