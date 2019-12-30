package com.library;

public abstract class MediaItem extends Item {
	private int runtime;

	public MediaItem(int id, String title, short noOfCopies,int runtime) {
		super(id, title, noOfCopies);
		this.runtime=runtime;
	}

	@Override
	public abstract void checkIn(String date);

	@Override
	public abstract void checkout(String date);

	@Override
	public abstract void addItem();

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

}
