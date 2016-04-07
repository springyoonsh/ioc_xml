package com.example.ioc_xml;

public class FoodSeller implements Seller
{
	@Override
	public void sell() 
	{
		System.out.println("과일팝니다...");
	}
	
}
