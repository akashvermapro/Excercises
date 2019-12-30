package com.library;

public class Video extends MediaItem {
	private String director;
	private String genre;
	private short yearReleased;
	public Video(int id, String title, short noOfCopies, int runtime,String director,String genre,short yearReleased) {
		super(id, title, noOfCopies, runtime);
		this.director=director;
		this.genre=genre;
		this.yearReleased=yearReleased;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public short getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(short yearReleased) {
		this.yearReleased = yearReleased;
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
		System.out.println("Video Added");
	}

}
