package com.library;

public class JournalPaper extends WrittenItem {
	private short yearPublished;
	public JournalPaper(int id, String title, short noOfCopies, String author,short yearPublished) {
		super(id, title, noOfCopies, author);
		this.yearPublished=yearPublished;
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
		System.out.println("Journal Paper Added");
	}

	public short getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(short yearPublished) {
		this.yearPublished = yearPublished;
	}

}
