package edu.vinaenter.model;

public class ArPlace {
	
	private int id;
	
	private String place;
	
	private String date_create;
	
	private int student;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDate_create() {
		return date_create;
	}

	public void setDate_create(String date_create) {
		this.date_create = date_create;
	}

	public int getStudent() {
		return student;
	}

	public void setStudent(int student) {
		this.student = student;
	}

	public ArPlace(int id, String place, String date_create, int student) {
		super();
		this.id = id;
		this.place = place;
		this.date_create = date_create;
		this.student = student;
	}

	public ArPlace() {
		super();
	}
	
	

}
