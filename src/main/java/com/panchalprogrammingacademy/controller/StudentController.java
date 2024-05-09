package com.panchalprogrammingacademy.controller;

import com.panchalprogrammingacademy.model.Student;
import com.panchalprogrammingacademy.service.StudentService;
import com.panchalprogrammingacademy.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Handler method to display a list of students
    @GetMapping
    public String getAllStudents(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "studentList";
    }

    // Handler method to display the form for adding a new student
    @GetMapping("/add")
    public String showAddStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "addStudent";
    }

    // Handler method to process form submission for adding a new student
    @PostMapping("/add")
    public String addStudent(@ModelAttribute("student") Student student) {
        studentService.addStudent(student);
        return "redirect:/students";
    }

    // Handler method to display the form for editing a student
    @GetMapping("/edit/{id}")
    public String showEditStudentForm(@PathVariable("id") int studentId, Model model) {
        Student student = studentService.getStudentById(studentId);
        model.addAttribute("student", student);
        return "editStudent";
    }

    // Handler method to process form submission for editing a student
    @PostMapping("/edit/{id}")
    public String editStudent(@PathVariable("id") int studentId, @ModelAttribute("student") Student updatedStudent) {
        updatedStudent.setId(studentId);
        studentService.updateStudent(updatedStudent);
        return "redirect:/students";
    }

    // Handler method to delete a student
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") int studentId) {
        studentService.deleteStudent(studentId);
        return "redirect:/students";
    }

    public void setStudentService(StudentServiceImpl studentService) {
    }
}
