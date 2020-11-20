package com.cg.tradingservice.repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.tradingservice.entities.Stocks1;
import com.cg.tradingservice.utility.JPAUtil;
/*
 *  
 *  @author:swapna
 *  This class is to implement the logic for the methods listed in the
 *   company manager repository
 */

public class CompanyManagerRepositoryImpl implements ICompanyManagerRepository {
	/*
	 * This method is to execute the logic for adding stocks
	 */
	@Override
	public boolean addStock(Stocks1 stock)
	{
		boolean falg=false;
		EntityManager em = JPAUtil.getEntityManager();  
		try {
			em.getTransaction().begin();  //begin 
			em.persist(stock);     
			falg=true;//managed stated  ... pushed database ,insert 
			em.getTransaction().commit();
			//end
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			e.getMessage();
		}
		em.close();  //manager is closed 
		/* 
		 * printing the message that stocks added
		 */
		System.out.println("Stock added successfully!");
		return falg;
		}
	@Override
	/*
	 * This method is to execute the logic for removing stocks
	 */
    public boolean removeStock(int companyid)
    {
		boolean falg=false;
		EntityManager em = JPAUtil.getEntityManager();  

		Stocks1 stock = em.find(Stocks1.class,companyid);
		try {
			em.getTransaction().begin();
			em.remove(stock);  
			falg=true;//delete 
			em.getTransaction().commit();
		} 
		catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			e.getMessage();
		}
		
		em.close();
		
		System.out.println("Remove success!");
	return falg;
	}
  @Override
  /*
	 * This method is to execute the logic for updating stocks
	 */
public boolean updateStock(int stockCompanySymbol,Stocks1 stock,int choice) {
		// TODO Auto-generated method stub
		EntityManager em = JPAUtil.getEntityManager();
		boolean flag=false;
		Stocks1 s =em.find(Stocks1.class, stockCompanySymbol);
		try {
		 em.getTransaction().begin();
		if(choice == 1) {
			s.setCompanyname(stock.getCompanyname());
			flag=true;
		}
		else if(choice == 2) {
			s.setPrice(stock.getPrice());
			flag=true;
		}
		else if(choice == 3) {
			s.setQuantity(stock.getQuantity());
			flag=true;
		}
		System.out.println("updated");
		em.persist(s);
		System.out.println("added");
		em.getTransaction().commit();
		
		
		em.close();
		
		}
		catch(Exception e){
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		
		return flag;
	}

    }
	
	
	
	
	
	