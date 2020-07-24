package dao;

import model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class InDatabaseStudentDao implements StudentDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();
    public List<Student> getAllStudents() {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Student> list = em.createQuery("SELECT c FROM Student c", Student.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    public Student getStudentById(String id) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Student student = em.find(Student.class, id);
        em.getTransaction().commit();
        em.close();
        return student;
    }

    public void updateStudent(Student student) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Student student1 = em.find(Student.class, student.getId());
        student1.setNameStudent(student.getNameStudent());
        student1.setPointLt(student.getPointLt());
        student1.setPointTh(student.getPointTh());
        student1.setPointAssignment(student.getPointAssignment());
        student1.setCreatedAt(student.getCreatedAt());
        student1.setUpdatedAt(student.getUpdatedAt());
        student1.setSubjects(student.getSubjects());
        em.getTransaction().commit();
        em.close();
    }

    public void insertStudent(Student student) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
    }

    public void deleteStudent(String id) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Student student = em.find(Student.class, id);
        em.remove(student);
        em.getTransaction().commit();
        em.close();
    }
}
