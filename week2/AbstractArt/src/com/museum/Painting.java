package com.museum;

public class Painting extends Art {
	private String paintType;
	
	public Painting(String title, String author, String description, String paintType) {
		this.title = title;
		this.author = author;
		this.description = description;
		this.setPaintType(paintType);
	}

	@Override
	public void viewArt() {
		System.out.println("I can view  this painting");
		
	}

	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
	
	
}
