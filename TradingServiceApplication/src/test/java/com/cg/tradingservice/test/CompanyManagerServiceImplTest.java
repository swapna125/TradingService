package com.cg.tradingservice.test;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.tradingservice.entities.Stocks1;
import com.cg.tradingservice.repository.CompanyManagerRepositoryImpl;
import com.cg.tradingservice.service.CompanyManagerServiceImpl;
import com.cg.tradingservice.utility.JPAUtil;
/*
 *  Class to test the methods in companyManagerRepositoryImplclass 
 * 
 * @author Swapna
 *
 */
class CompanyManagerServiceImplTest {
	Stocks1 stock;
	@BeforeEach
	/*
	 *  setUp() method to setUp value before each test 
	 */
	void setUp() throws Exception {
		
	}

	@AfterEach
	/*
	 * * TearDown() method to setUp value before each test 
	 * */
	void tearDown() throws Exception {
		stock=null;
	}

	@Test
	/*
	 *  To test the add stock method in service layer using JUNIT test 
	 *  */
	void testAddStock() {
		EntityManager em = JPAUtil.getEntityManager();
		boolean v=false;
		CompanyManagerServiceImpl cm=new CompanyManagerServiceImpl();
		v=cm.addStock(new Stocks1(2, "dfgh",70,4000));
		assertTrue(v);
	}

	@Test
	/*
	 *  To test the remove stock method in service layer using JUNIT test 
	 *  */
	void testRemoveStock() {
		EntityManager em = JPAUtil.getEntityManager();
		boolean v=false;
		CompanyManagerServiceImpl  cm=new CompanyManagerServiceImpl();
		v=cm.removeStock(6);
		assertTrue(v);
		
	}

	@Test
	/*
	 * To test the update stock method in service layer using JUNIT test
	 *  */
	void testUpdateStock() {
		EntityManager em = JPAUtil.getEntityManager();
		boolean v=false;
		CompanyManagerServiceImpl  cm=new CompanyManagerServiceImpl();
		v=cm.updateStock(8, new Stocks1(28,"dell",2,9),2);
		assertTrue(v);
		
	}

}

