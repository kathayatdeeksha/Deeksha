package com.demo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClient {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("bean.xml");
		
		
		JavaCollections collec1= (JavaCollections)con.getBean("collectiondemo");
		
		
		System.out.println(collec1.getAddressList());
		
		System.out.println(collec1.getAddressMap());
		
		//same for other collections
    //for your implementations
		con.close();

	}

}