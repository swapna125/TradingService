package com.cg.tradingservice.test;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.tradingservice.utility.JPAUtil;


class JPAUtilTest {
	JPAUtil jp;
	@BeforeEach
	/*
	 *  setUp() method to setUp value before each test 
	 */
	void setUp() throws Exception {
		jp=new JPAUtil();
	}

	@AfterEach
	/*
	 * * TearDown() method to setUp value before each test 
	 * */
	void tearDown() throws Exception {
		jp=null;
	}

	@Test
	void testGetEntityManager() {
	    EntityManager actual=jp.getEntityManager();   
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("examplePU");
 	    EntityManager em=emf.createEntityManager();
        assertNotNull(actual);
        assertNotNull(em);
	}

}

