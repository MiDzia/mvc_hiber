package com.midzia.hib_mvc.dao.impl;

import com.midzia.hib_mvc.dao.StudentDao;
import com.midzia.hib_mvc.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    private final SessionFactory sessionFactory;

    public StudentDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public List<Student> getAllStudent() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Student", Student.class).getResultList();
    }

    @Override
    public void saveStudent(Student student) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(student);
    }

    @Override
    public Student getStudentById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Student.class, id);
    }

    @Override
    public void deleteStudent(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.createQuery("DELETE FROM Student where id = :studentId")
                .setParameter("studentId",id)
                .executeUpdate();
    }


}
