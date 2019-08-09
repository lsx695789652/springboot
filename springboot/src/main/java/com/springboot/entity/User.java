package com.springboot.entity;

public class User {
	private int Id;
	private String name;
	private String sex;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}	
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", sex=" + sex + "]";
	}

}
