package com.midzia.hib_mvc.service.impl;

import com.midzia.hib_mvc.dao.StudentDao;
import com.midzia.hib_mvc.entity.Student;
import com.midzia.hib_mvc.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    @Transactional
    public List<Student> getAllStudent() {
        return studentDao.getAllStudent();
    }

    @Override
    @Transactional
    public void saveStudent(Student student) {
        studentDao.saveStudent(student);
    }

    @Override
    @Transactional
    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }
}
