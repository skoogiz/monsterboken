package monsterboken.db.dao;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import monsterboken.db.model.EntityObject;
import monsterboken.db.util.JPAUtil;

public class AbstractDao<T extends EntityObject> implements Dao<T> {

    private Class<T> eoClass;
    
    public AbstractDao(Class<T> eoClass) {
        super();
        this.eoClass = eoClass;
    }

    @Override
    public void create(T bean) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
            em.persist(bean);
            tx.commit();
        } finally {
            if (tx.isActive()) {
                tx.rollback();
            }
        }
        em.close();
    }

    @Override
    public Optional<T> find(Long id) {
        EntityManager em = getEntityManager();
        return Optional.ofNullable(em.find(eoClass ,id));
    }    

    @Override
    public void update(T bean) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
            em.merge(bean);
            tx.commit();
        } finally {
            if (tx.isActive()) {
                tx.rollback();
            }
        }
        em.close();
    }

    @Override
    public void delete(T bean) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
            em.remove(bean);
            tx.commit();
        } finally {
            if (tx.isActive()) {
                tx.rollback();
            }
        }
        em.close();
    }

    public EntityManager getEntityManager() {
        return JPAUtil.getEntityManagerFactory().createEntityManager();
    }

}
