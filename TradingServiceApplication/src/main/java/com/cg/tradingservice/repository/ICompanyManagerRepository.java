package com.cg.tradingservice.repository;

import com.cg.tradingservice.entities.Stocks1;
/* @author:Swapna
 * company manager repository provides the interface to add stock,
 *  remove the existing stock 
 * and updates the existing stock
 */
public interface ICompanyManagerRepository{
	/*
	 * add stock method will add the details of the stock 
	 * company id,company name,price of the stock,and quantity of the stock
	 */
	 public boolean addStock(Stocks1 stock);
	 /*
	  * remove stock method will remove the details of the existing stock
	  */
	    public boolean removeStock(int stockCompanySymbol);
	    /*
	     * update stock method will update the details of existing stock
	     */
	    public boolean updateStock(int stockCompanySymbol,Stocks1 stock,int choice); 

}
