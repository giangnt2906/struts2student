package com.asm.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;
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

    //getter and setter constructor 0 bien so
    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
