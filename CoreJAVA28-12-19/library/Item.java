package com.library;

public abstract class Item {
	private int id;
	private String title;
	private short noOfCopies;
	public Item(int id, String title, short noOfCopies) {
		super();
		this.id = id;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public short getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(short noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public abstract void checkIn(String date);
	public abstract void checkout(String date);
	public abstract void addItem();

	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", noOfCopies=" + noOfCopies + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (id != other.id)
			return false;
		if (noOfCopies != other.noOfCopies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	

}
