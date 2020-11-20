/* Creates a company manager operations
 * @author:Swapna
 * */
package com.cg.tradingservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

 @Entity
 /* Creating a table
  */
 @Table(name="Stockscrud")
public class Stocks1 {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	/* Company manager operations
	 * id of the manager
	 * name of the company
	 * quantity of stocks
	 * price of the stocks
	 */
	@Column
	private int companyid;
	@Column
	private String companyname;
	@Column
	private int Quantity;
	@Column
	private int Price;
	/*
	 * @return id of the manager 
	 */
	public int getCompanyid() {
		return companyid;
	}
	/*
	 * set the id of the manager
	 */
	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}
	/*
	 * return the name of the company
	 */
	public String getCompanyname() {
		return companyname;
	}
	/*
	 * set the name of the company
	 */
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	/*
	 * return the quantity of stocks
	 */
	public int getQuantity() {
		return Quantity;
	}
	/*
	 * set the quantity of stocks
	 */
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	/*
	 * return the price of the stock
	 */
	public int getPrice() {
		return Price;
	}
	public Stocks1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stocks1(int companyid, String companyname, int quantity, int price) {
		super();
		this.companyid = companyid;
		this.companyname = companyname;
		Quantity = quantity;
		Price = price;
	}
	/*
	 * set the price of the stock
	 */
	public void setPrice(int price) {
		Price = price;
	}
		 
}
