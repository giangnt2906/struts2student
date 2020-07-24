package com.asm.service;

import com.asm.dao.StudentDao;
import com.asm.entity.Student;

import java.util.List;

public class StudentService {
    private StudentDao dao = new StudentDao();

    public List<Student> getAllStudents() {
        return dao.getAllStudents();
    }

    public void updateStudent(Student student) {

    }

    public void deleteStudent(long id) {
        dao.delete(id);
    }

    public Student getStudentById(long id) {
        return dao.getStudentById(id);
    }

    public void insertStudent(Student student) {
        dao.insert(student);
    }
}
