package com.asm.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table
public class Score {

    @Id
    @Column(name = "id_score")
    private long id_score;
    private int theory; //ly thuyet
    private int asm; //thuc hanh
    private int proj; //btl

    //ten mon hoc
    private String subjectName;

    private long createdAt;
    private long updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_student")
    private Student student;

    //implement the equals and hashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Score )) return false;
        return id_score != 0L && id_score == (((Score) o).getId_score());
    }
    @Override
    public int hashCode() {
        return 31;
    }

    //constructor
    public Score(int theory, int asm, int proj, String subjectName, long createdAt, long updatedAt, Student student) {
        this.theory = theory;
        this.asm = asm;
        this.proj = proj;
        this.subjectName = subjectName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.student = student;
    }

    //2
    public Score(int theory, int asm, int proj, String subjectName, long createdAt, long updatedAt) {
        this.theory = theory;
        this.asm = asm;
        this.proj = proj;
        this.subjectName = subjectName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    //getter setter, constructor 0 bien so
    public Score() {
    }

    public long getId_score() {
        return id_score;
    }

    public void setId_score(long id_score) {
        this.id_score = id_score;
    }

    public int getTheory() {
        return theory;
    }

    public void setTheory(int theory) {
        this.theory = theory;
    }

    public int getAsm() {
        return asm;
    }

    public void setAsm(int asm) {
        this.asm = asm;
    }

    public int getProj() {
        return proj;
    }

    public void setProj(int proj) {
        this.proj = proj;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
