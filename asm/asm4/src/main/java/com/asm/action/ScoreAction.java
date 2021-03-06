package com.asm.action;

import com.asm.entity.Score;
import com.asm.entity.Student;
import com.asm.service.ScoreService;
import com.asm.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScoreAction extends ActionSupport {
    //service va list va score
    private ScoreService scoreService = new ScoreService();
    private List<Score> scoreList = new ArrayList<Score>();
    private Score score = new Score();
    //student service
    private Student student = new Student();
    private StudentService studentService = new StudentService();
    private long id_student;
    private Map<Long, String> mapStudentsList = new HashMap<Long, String>();
    //private List<Student> studentList = new ArrayList<Student>();
    //private List<Long> studentListId = new ArrayList<Long>();

    //get Score by Id_score
    public String getScoreById() {
        score = scoreService.getScoreById(score.getId_score());
        return SUCCESS;
    }

    //delete score
    public String deleteScore() {
        //giai quyet score == null
        //...
        student.removeScore(score);
        scoreService.deleteScore(score.getId_score());
        studentService.updateStudent(student);
        return SUCCESS;
    }

    //save or update score
    public String saveOrUpdate() {
        student = studentService.getStudentById(id_student);
        //giai quyet neu student == null
        //...
        if (score.getId_score() == 0L) {
            //set student vao score
            //score.setStudent(student);
            //modify score
            scoreService.modifyScore(score);
            //set score vao student su dung ham utility
            student.addScore(score);
            //persist student khong can cho score
            //scoreService.insertScore(score);
            studentService.updateStudent(student);
        } else {
            //update => tim va remove score_old, them score_new
            List<Score> student_list_score = student.getScores();
            Score score_to_remove = new Score();
            for (Score score_old : student_list_score) {
                if (score_old.getId_score() == score.getId_score())
                    score_to_remove = score_old;
            }
            student.removeScore(score_to_remove);
            scoreService.modifyScore(score);
            student.addScore(score);
            //scoreService.updateScore(score);
            studentService.updateStudent(student);
        }
        return SUCCESS;
    }

    //return input form cho create, update
    public String createScore() {
        return INPUT;
    }

    //list all score
    public String listScore() {
        scoreList = scoreService.getAllScore();
        return SUCCESS;
    }

    //get set student
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public long getId_student() {
        return student.getId_student();
    }

    public void setId_student(long id_student) {
        this.id_student = id_student;
    }

    public Map<Long, String> getMapStudentsList() {
        List<Student> studentList = studentService.getAllStudents();
        for (Student student : studentList) {
            mapStudentsList.put(student.getId_student(), student.getStudentName());
        }
        return mapStudentsList;
    }
    /*public List<Student> getStudentList() {
        studentList = studentService.getAllStudents();
        return studentList;
    }*/

    /*//lay student id dang list<Long>
    public List<Long> getStudentListId() {
        studentList = studentService.getAllStudents();
        for (Student student : studentList) {
            studentListId.add(student.getId_student());
        }
        return studentListId;
    }*/

    //get set
    public ScoreService getScoreService() {
        return scoreService;
    }

    public void setScoreService(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    public List<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(List<Score> scoreList) {
        this.scoreList = scoreList;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }
}
