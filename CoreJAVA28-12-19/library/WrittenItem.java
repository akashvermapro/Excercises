package com.library;

public abstract class WrittenItem extends Item {
	private String author;

	public WrittenItem(int id, String title, short noOfCopies,String author) {
		super(id, title, noOfCopies);
		this.setAuthor(author);
	}

	@Override
	public abstract void checkIn(String date);

	@Override
	public abstract void checkout(String date);

	@Override
	public abstract void addItem();

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
