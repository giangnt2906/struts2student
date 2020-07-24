/*
package com.asm.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Subject {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;
    private String subjectName;

    @OneToMany(cascade = CascadeType.ALL,
    orphanRemoval = true,
    mappedBy = "subject")
    private List<Score> scores;

    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;

    //implement the equals and hashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subject )) return false;
        return id != null && id.equals(((Subject) o).getId());
    }

    //features two utility methods (e.g. addComment and removeComment) which are used to synchronize both sides of the bidirectional association
    public void addScore(Score score) {
        scores.add(score);
        score.setSubject(this);
    }
    public void removeScore(Score score) {
        scores.remove(score);
        score.setSubject(null);
    }

    //getter setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
*/
