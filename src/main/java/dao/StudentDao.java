package dao;

import model.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getAllStudents();

    Student getStudentById(String id);

    void updateStudent(Student student);

    void insertStudent(Student student);

    void deleteStudent(String id);
}
