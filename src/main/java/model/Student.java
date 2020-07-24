package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Student {
    @Id
    private String id;
    @Column(name = "subjects")
    private String subjects;
    @Column(name = "nameStudent")
    private String nameStudent;
    @Column(name = "pointLt")
    private int pointLt;
    @Column(name = "pointTh")
    private int pointTh;
    @Column(name = "pointAssignment")
    private int pointAssignment;
    @Column(name = "createdAt")
    private long createdAt;
    @Column(name = "updatedAt")
    private long updatedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getPointLt() {
        return pointLt;
    }

    public void setPointLt(int pointLt) {
        this.pointLt = pointLt;
    }

    public int getPointTh() {
        return pointTh;
    }

    public void setPointTh(int pointTh) {
        this.pointTh = pointTh;
    }

    public int getPointAssignment() {
        return pointAssignment;
    }

    public void setPointAssignment(int pointAssignment) {
        this.pointAssignment = pointAssignment;
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

    public Student() {
    }

    public Student(String id, String subjects, String nameStudent, int pointLt, int pointTh, int pointAssignment, long createdAt, long updatedAt) {
        this.id = id;
        this.subjects = subjects;
        this.nameStudent = nameStudent;
        this.pointLt = pointLt;
        this.pointTh = pointTh;
        this.pointAssignment = pointAssignment;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
