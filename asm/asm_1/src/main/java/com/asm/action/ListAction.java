package com.asm.action;

import com.asm.dao.ScoreDao;
import com.asm.entity.Score;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class ListAction extends ActionSupport {
    private List<Score> scores;

    public String execute() {
        ScoreDao dao = new ScoreDao();
        scores = dao.getAllScore();
        if (scores.size() > 0) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    //get set
    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }
}
