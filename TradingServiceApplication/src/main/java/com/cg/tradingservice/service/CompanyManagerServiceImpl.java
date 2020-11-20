package com.cg.tradingservice.service;

import com.cg.tradingservice.entities.Stocks1;
import com.cg.tradingservice.repository.CompanyManagerRepositoryImpl;
/*
 *  This class is to write the logic to the method listed in the company manager in service layer 
 * 
 * @author Swapna
 *
 */
public class CompanyManagerServiceImpl implements CompanyManagerService{
	CompanyManagerRepositoryImpl CompanyManagerRepository=new CompanyManagerRepositoryImpl();
	
	/*
	 * This method is to call the method in the DAO layer 
	 * in this service layer for adding stocks details
	 * */
	public boolean addStock(Stocks1 stock) {
		CompanyManagerRepository.addStock(stock);
		return true;
	}
	/* 
	 * This method is to call the method in the DAO layer 
	 * in this service layer for removing stocks details
	 * */
	public boolean removeStock(int companyid) {
		CompanyManagerRepository.removeStock(companyid);
		return true;
	}
	/*
	 * This method is to call the method in the DAO layer 
	 * in this service layer for updating stocks details
	 * */
	public boolean updateStock(int companyid,Stocks1 stock,int choice) {
	CompanyManagerRepository.updateStock(companyid,stock,choice);
	return true;
	}

}
