package com.asm.action;

import com.asm.entity.Score;
import com.asm.entity.Student;
import com.asm.service.ScoreService;
import com.asm.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

public class StudentAction extends ActionSupport {
    //service va list va student
    private StudentService studentService = new StudentService();
    private List<Student> studentList = new ArrayList<Student>();
    private Student student = new Student();
    //scores list
    private List<Score> scoreList = new ArrayList<Score>();
    private ScoreService scoreService = new ScoreService();
    private Score score = new Score();

    //save or update student
    public String saveOrUpdate() {
        if (student.getId_student() == 0L) {
            studentService.insertStudent(student);
        } else {
            //update student
            studentService.updateStudent(student);
        }
        return SUCCESS;
    }

    //getStudentById method for info, delete, list scores
    public String getStudentById() {
        studentService.getStudentById(student.getId_student());
        student = studentService.getStudentById(student.getId_student());
        //lay score list de hien thi trang detail
        scoreList = student.getScores();
        return SUCCESS;
    }

    //delete student
    public String deleteStudent() {
        studentService.deleteStudent(student.getId_student());
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

    //get score
    public List<Score> getScoreList() {
        return student.getScores();
    }

    public Score getScore() {
        return score;
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
