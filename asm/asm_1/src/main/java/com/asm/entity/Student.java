package com.asm.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Student {

    @Id
    @Column(name = "id_student")
    private long id_student;
    private String studentName;
    private String studentId;

    @OneToMany(cascade = CascadeType.ALL,
    orphanRemoval = true,
    mappedBy = "student")
    private List<Score> scores = new ArrayList<Score>();
    //private List<Score> scores;

    //features two utility methods (e.g. addComment and removeComment) which are used to synchronize both sides of the bidirectional association
    public void addScore(Score score) {
        scores.add(score);
        score.setStudent(this);
    }
    public void removeScore(Score score) {
        scores.remove(score);
        score.setStudent(null);
    }

    //constructor
    public Student(String studentName, String studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    //getter and setter constructor 0 bien so
    public Student() {
    }

    public long getId_student() {
        return id_student;
    }

    public void setId_student(long id_student) {
        this.id_student = id_student;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }
}
