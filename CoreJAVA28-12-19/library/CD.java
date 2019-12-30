package com.library;

public class CD extends MediaItem {
	private String artist;
	private String genre;
	public CD(int id, String title, short noOfCopies, int runtime) {
		super(id, title, noOfCopies, runtime);
		// TODO Auto-generated constructor stub
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
		System.out.println("CD Added");
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
