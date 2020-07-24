package dao;

import model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class InDatabaseStudentDao implements StudentDao {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    private static final EntityManager em = emf.createEntityManager();
    public List<Student> getAllStudents() {
        em.getTransaction().begin();
        List<Student> list = em.createQuery("SELECT c FROM Student c", Student.class).getResultList();
        em.getTransaction().commit();
        return list;
    }

    public Student getStudentById(String id) {
        em.getTransaction().begin();
        Student student = em.find(Student.class, id);
        em.getTransaction().commit();
        return student;
    }

    public void updateStudent(Student student) {
        em.getTransaction().begin();
        Student student1 = em.find(Student.class, student.getId());
        student1.setNameStudent(student.getNameStudent());
        student1.setAsm(student.getAsm());
        student1.setTheory(student.getTheory());
        student1.setProj(student.getProj());
        student1.setCreatedAt(student.getCreatedAt());
        student1.setUpdatedAt(student.getUpdatedAt());
        student1.setSubjectName(student.getSubjectName());
        em.getTransaction().commit();
    }

    public void insertStudent(Student student) {
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
    }

    public void deleteStudent(String id) {
        em.getTransaction().begin();
        Student student = em.find(Student.class, id);
        em.remove(student);
        em.getTransaction().commit();
    }
}
