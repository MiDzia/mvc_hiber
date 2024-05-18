package com.midzia.hib_mvc.dao;

import com.midzia.hib_mvc.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getAllStudent();

    void saveStudent(Student student);

    Student getStudentById(int id);

    void deleteStudent(int id);
}
