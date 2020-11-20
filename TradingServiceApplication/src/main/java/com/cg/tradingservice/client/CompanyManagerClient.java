/* Creates a company manager operations
 * @author:Swapna
 * */
package com.cg.tradingservice.client;

import java.util.Scanner;

import com.cg.tradingservice.entities.Stocks1;
import com.cg.tradingservice.service.CompanyManagerService;
import com.cg.tradingservice.service.CompanyManagerServiceImpl;
public class CompanyManagerClient {
  public static void main(String[] args) {
	  CompanyManagerService companyManagerService=new CompanyManagerServiceImpl();
	  /*
	   * initializing the choice as 0
	   */
	  int ch=0;
	  do {
		  /* 
		   * printing the stock menu
		   */
		System.out.println("Stock Menu");
		System.out.println("1. add stock");
		System.out.println("2. remove stock");
		System.out.println("3. Update stock");
		System.out.println("4.Exit");
		/*
		 * taking the input
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("enter you choice");
		 ch=sc.nextInt();
		switch(ch) {
		case 1:		{  
			/*
			 * adding the stock details
			 * taking the input for company id
			 * company name,
			 * price of the stock,
			 * quantity of stocks
			 */
			                 Stocks1  stock= new Stocks1(); //entity is create d--new 
							 System.out.println("enter companyid,companyname,price,quantity");
							 stock.setCompanyid(sc.nextInt());
							 stock.setCompanyname(sc.next());
		                     stock.setPrice(sc.nextInt()); 
		                     stock.setQuantity(sc.nextInt());
			         companyManagerService.addStock(stock);
			         break;
			         }
		/*
		 * removing the stock details
		 * taking the input as company id
		 * checking whether the company id is exists or not.
		 * if it exists it removes the stock details related to the company id
		 */
	
		case 2: { System.out.println("enter the Companyid to delete");
					int companyid=sc.nextInt();
					companyManagerService.removeStock(companyid);
					break;
		}
		/*
		 * updating the stock details
		 * taking the input as company id
		 * checking whether the company id is exists or not.
		 */
		case 3 :
		{
			System.out.println("Enter the Company id :");
			int company_id = sc.nextInt();
			Stocks1 stock = new Stocks1();
			stock.setCompanyid(company_id);
			/* 
			 * if the company id exists it prints the update menu
			 */
			System.out.println("Update Menu");
			System.out.println("1. Update Company name");
			System.out.println("2. Update Share price");
			System.out.println("3. Update Share Quantity");
			System.out.println("enter you choice");
			int choice=sc.nextInt();
			/*
			 * taking the input for updating the details in the existing stock
			 */
			if(choice == 1)
			/*
			 * taking the company name to update the existing stock details
			 * 
			 */{
				System.out.print("Enter the company name");
				String changeCompanyName = sc.next();
				//logger.info(changeCompanyName);
				stock.setCompanyname(changeCompanyName);
			}
			/*
			 * taking the price of the stock to update the existing stock details
			 * 
			 */
			
			else if(choice == 2) {
				System.out.println("Enter the price");
				int sharePrice = sc.nextInt();
			    //logger.info(sharePrice);
				stock.setPrice(sharePrice);
			}
			/*
			 * taking the quantity of stocks to update the existing stock details
			 * 
			 */
			else if(choice == 3) {
				System.out.println("Enter the quantity");
				int shareQuantity = sc.nextInt();
				 //  logger.info(shareQuantity);
				stock.setQuantity(shareQuantity);
			}
		boolean v=companyManagerService.updateStock(stock.getCompanyid(), stock, choice);
		break;
		}
			/*
			 * to exit
			 */
		case 4:System.out.println("thankyou");
			return;
		   default : break;
			
		}
		
  }while(ch>0);
	  }
  
}