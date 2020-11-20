package com.cg.tradingservice.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/*
 * * This class provides entity manager and entity manager factory *
 * */
public class JPAUtil {
           public static EntityManager getEntityManager() {
        	   EntityManagerFactory emf = Persistence.createEntityManagerFactory("examplePU");
        	   EntityManager em=emf.createEntityManager();
        	   return em;
           }
}
