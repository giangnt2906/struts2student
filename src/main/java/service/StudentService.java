package service;

import dao.InDatabaseStudentDao;
import dao.StudentDao;
import model.Student;

import java.util.Calendar;
import java.util.List;

public class StudentService implements StudentDao {
    private StudentDao studentDao = new InDatabaseStudentDao();

    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public Student getStudentById(String id) {
        return studentDao.getStudentById(id);
    }

    public void updateStudent(Student student) {
        student.setUpdatedAt(Calendar.getInstance().getTimeInMillis());
        studentDao.updateStudent(student);
    }

    public void insertStudent(Student student) {
        student.setCreatedAt(Calendar.getInstance().getTimeInMillis());
        studentDao.insertStudent(student);
    }

    public void deleteStudent(String id) {
        studentDao.deleteStudent(id);
    }
}
