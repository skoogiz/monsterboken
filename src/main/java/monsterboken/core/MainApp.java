package monsterboken.core;

import javax.persistence.EntityManager;

import monsterboken.core.model.Habitat;
import monsterboken.db.model.HabitatEO;
import monsterboken.db.util.JPAUtil;

public class MainApp {

    public static void main(String[] args) {

        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        // Check database version inMemoryPU
        String sql = "select version()";

        String result = (String) entityManager.createNativeQuery(sql).getSingleResult();
        System.out.println(result);

        entityManager.getTransaction().commit();
        entityManager.close();

        JPAUtil.shutdown();

    }
}
