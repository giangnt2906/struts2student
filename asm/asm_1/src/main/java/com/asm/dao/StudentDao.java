package com.asm.dao;

import com.asm.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class StudentDao {
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
    private static final EntityManager entityManager = entityManagerFactory.createEntityManager();

    public void update(Student student) {

    }

    public void insert(Student student) {
        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
    }

    public boolean delete(long id) {
        entityManager.getTransaction().begin();
        Student student = entityManager.find(Student.class, id);
        if (student != null) {
            entityManager.remove(student);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }
        entityManager.close();
        return false;
    }

    public List<Student> getAllStudents() {
        return entityManager.createQuery("SELECT c FROM Student c", Student.class).getResultList();
    }

    public Student getStudentById(long id) {
        return entityManager.find(Student.class, id);
    }

    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }
}
