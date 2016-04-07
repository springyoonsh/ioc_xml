package com.example.ioc_xml;

public class Mart 
{
	private Seller seller;
	
	public void setSeller(Seller seller)
	{
		this.seller = seller;
	}
	
	public void order()
	{
		seller.sell();
	}
}
