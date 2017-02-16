package com.github.ipan97.spring.caching;

public class Book {
	private String isBn;
	private String title;

	public Book() {
	}

	public Book(String isBn, String title) {
		super();
		this.isBn = isBn;
		this.title = title;
	}

	public String getIsBn() {
		return isBn;
	}

	public void setIsBn(String isBn) {
		this.isBn = isBn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [isBn=" + isBn + ", title=" + title + "]";
	}
	

}
