package com.asm.action;

import com.asm.dao.ScoreDao;
import com.asm.entity.Score;
import com.asm.entity.Student;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class ScoreAction extends ActionSupport {
    private String subjectName;
    private int theory;
    private int asm;
    private int proj;
    //id cho student primary key
    private Long id;
    private List<Student> students;

    public String execute() {
        ScoreDao dao = new ScoreDao();
        Score score = new Score();
        score.setProj(proj);
        score.setAsm(asm);
        score.setTheory(theory);
        score.setSubjectName(subjectName);
        score.setId_student(id);

        //
        dao.insert(score);
        return SUCCESS;
    }

    //get set
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
