package com.asm.service;

import com.asm.dao.StudentDao;
import com.asm.entity.Student;

import java.sql.Timestamp;
import java.util.List;

public class StudentService {
    private StudentDao dao = new StudentDao();

    public List<Student> getAllStudents() {
        return dao.getAllStudents();
    }

    public void updateStudent(Student student) {
        dao.insert(student);
    }

    public void deleteStudent(long id) {
        dao.delete(id);
    }

    public Student getStudentById(long id) {
        return dao.getStudentById(id);
    }

    public void insertStudent(Student student) {
        long longMillisTime = new Timestamp(System.currentTimeMillis()).getTime();
        if (student.getId_student() == 0L) {
            student.setId_student(longMillisTime);
        }
        dao.insert(student);
    }
}
