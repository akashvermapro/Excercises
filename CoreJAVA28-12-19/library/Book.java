package com.library;

public class Book extends WrittenItem {

	public Book(int id, String title, short noOfCopies, String author) {
		super(id, title, noOfCopies, author);
		
	}

	@Override
	public void checkIn(String date) {
		System.out.println("Checked in on: "+date);
	}

	@Override
	public void checkout(String date) {
		System.out.println("Checked out on: "+date);
	}

	@Override
	public void addItem() {
		System.out.println("Book Added");

	}

}
