package com.techproedu3.Springmvntutorial4;
public class StudentsAdd {
	private String name;
	private int id;
	public StudentsAdd(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	public StudentsAdd() {
	
		// TODO Auto-generated constructor stub
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "StudentsAdd [name=" + name + ", id=" + id + "]";
	}
}
	
	
	
	