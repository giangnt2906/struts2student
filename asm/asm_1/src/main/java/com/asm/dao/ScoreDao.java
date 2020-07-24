package com.asm.dao;

import com.asm.entity.Score;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ScoreDao {
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
    private static final EntityManager entityManager = entityManagerFactory.createEntityManager();

    public void update(Score score) {

    }

    public void insert(Score score) {
        entityManager.getTransaction().begin();
        entityManager.persist(score);
        entityManager.getTransaction().commit();
    }

    public boolean delete(long id) {
        entityManager.getTransaction().begin();
        Score score = entityManager.find(Score.class, id);
        if (score != null) {
            entityManager.remove(score);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }
        entityManager.close();
        return false;
    }

    public List<Score> getAllScore() {
        return entityManager.createQuery("SELECT c FROM Score c", Score.class).getResultList();
    }

    public Score getScoreById(long id) {
        return entityManager.find(Score.class, id);
    }

    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }
}
