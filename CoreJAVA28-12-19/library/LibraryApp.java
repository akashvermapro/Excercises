package com.library;

public class LibraryApp {

	public static void main(String[] args) {
		Item[] i1= new Book[3];
		i1[0]= new Book(12,"Sapiens",(short) 50,"Yuval Noah Harari");
		i1[1]= new Book(167,"Immortals of Meluha",(short) 70,"Amish Tripathi");
		i1[2]= new Book(129,"Half Girlfriend",(short) 40,"Chetan Bhagat");
		for(int i=0;i<i1.length;i++){
			System.out.println(i1[i]);
		}
	}

}
