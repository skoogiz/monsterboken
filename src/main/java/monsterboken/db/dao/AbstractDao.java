package monsterboken.db.dao;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import monsterboken.db.model.EntityObject;
import monsterboken.db.util.JPAUtil;

public class AbstractDao<M, T extends EntityObject<M>> implements Dao<M, T> {

    private Class<T> eoClass;
    private EntityManager entityManager;

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
    }

    @Override
    public Optional<M> find(Long id) {
        EntityManager em = getEntityManager();
        T eo = em.find(eoClass, id);
        return eo != null ? Optional.of(eo.map()) : Optional.empty();
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
    }

    public EntityManager getEntityManager() {
        if (entityManager == null) {
            entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        }        
        return entityManager;
    }

}
