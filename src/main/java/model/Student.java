package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Student implements Serializable {
    @Id
    private String id;
    @Column(name = "subjectName")
    private String subjectName;
    @Column(name = "nameStudent")
    private String nameStudent;
    @Column(name = "asm")
    private int asm;
    @Column(name = "theory")
    private int theory;
    @Column(name = "proj")
    private int proj;
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

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getAsm() {
        return asm;
    }

    public void setAsm(int asm) {
        this.asm = asm;
    }

    public int getTheory() {
        return theory;
    }

    public void setTheory(int theory) {
        this.theory = theory;
    }

    public int getProj() {
        return proj;
    }

    public void setProj(int proj) {
        this.proj = proj;
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

    public Student(String id, String subjectName, String nameStudent, int asm, int theory, int proj, long createdAt, long updatedAt) {
        this.id = id;
        this.subjectName = subjectName;
        this.nameStudent = nameStudent;
        this.asm = asm;
        this.theory = theory;
        this.proj = proj;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
