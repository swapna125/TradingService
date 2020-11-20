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
 *  Class to test the methods in Company manager repository Impl
 * 
 * @author Swapna
 *
 */
class CompanyManagerRepositoryImplTest2 {
   CompanyManagerRepositoryImpl stockTest;
	@BeforeEach
	/*
	 *  setUp() method to setUp value before each test 
	 */
	void setUp() throws Exception {
		stockTest=new CompanyManagerRepositoryImpl();
	}

	@AfterEach
	/*
	 * * TearDown() method to setUp value before each test 
	 * */
	void tearDown() throws Exception {
		stockTest=null;
	}

	@Test
	/*
	 * * To test the addStock method in the Dao layer using JUNIT test 
	 */
	void testAddStocks() {
		Stocks1 stock=new Stocks1(1,"dell",100,10);
		boolean v=stockTest.addStock(stock);
		assertTrue(v);
	}
	@Test
	/*
	 * * To test the removeStock method in the Dao layer using JUNIT test 
	 */
	void testRemoveStocks() {
		
		boolean v=stockTest.removeStock(3);
		assertTrue(v);
	}
	@Test
	/*
	 * * To test the updateStock method in the Dao layer using JUNIT test 
	 */
	void testUpdateStock() {
		EntityManager em = JPAUtil.getEntityManager();
		boolean v=false;
		 v=stockTest.updateStock(5, new Stocks1(4,"dell",2,9),2);
			assertTrue(v);
	}

}
