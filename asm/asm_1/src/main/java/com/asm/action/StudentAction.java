package com.asm.action;

import com.asm.entity.Score;
import com.asm.entity.Student;
import com.asm.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

public class StudentAction extends ActionSupport {
    //service va list va student
    private StudentService studentService = new StudentService();
    private List<Student> studentList = new ArrayList<Student>();
    private Student student = new Student();

    //save or update student
    public String saveOrUpdate() {
        if (student.getId_student() == 0L) {
            studentService.insertStudent(student);
        } else {
            //chua co update
            studentService.updateStudent(student);
        }
        return SUCCESS;
    }

    //return input form cho create, update
    public String createStudent() {
        return INPUT;
    }

    //list all student
    public String listStudent() {
        studentList = studentService.getAllStudents();
        return SUCCESS;
    }

    //getter setter
    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Score> getStuScores() {
        return student.getScores();
    }
}
