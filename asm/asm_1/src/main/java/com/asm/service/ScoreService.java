package com.asm.service;

import com.asm.dao.ScoreDao;
import com.asm.entity.Score;

import java.sql.Timestamp;
import java.util.List;

public class ScoreService {
    private ScoreDao dao = new ScoreDao();

    public List<Score> getAllScore() {
        return dao.getAllScore();
    }

    public void updateScore(Score score) {

    }

    public void deleteScore(long id) {
        dao.delete(id);
    }

    public Score getScoreById(long id) {
        return dao.getScoreById(id);
    }

    public void insertScore(Score score) {
        dao.insert(score);
    }

    public void modifyScore(Score score) {
        long longMillisTime = new Timestamp(System.currentTimeMillis()).getTime();
        if (score.getId_score() == 0L) {
            score.setId_score(longMillisTime);
            score.setCreatedAt(longMillisTime);
            score.setUpdatedAt(longMillisTime);
        }
        score.setUpdatedAt(longMillisTime);
    }
}
