package monsterboken.db.dao;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import monsterboken.db.util.JPAUtil;

public class AbstractDao<T> implements Dao<T> {
	
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

//	@Override
//	public Optional<T> find(Long id) {
//		EntityManager em = getEntityManager();
//		return Optional.ofNullable(em.find(id));
//	}

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
