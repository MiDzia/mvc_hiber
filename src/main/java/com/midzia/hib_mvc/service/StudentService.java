package com.midzia.hib_mvc.service;

import com.midzia.hib_mvc.controller.StudentController;
import com.midzia.hib_mvc.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();

    void saveStudent(Student student);

    Student getStudentById(int id);

    void deleteStudent(int id);

}
