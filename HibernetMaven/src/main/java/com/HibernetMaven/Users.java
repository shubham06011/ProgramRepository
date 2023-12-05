package com.HibernetMaven;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String midname;
	private String surname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMidname() {
		return midname;
	}
	public void setMidname(String midname) {
		this.midname = midname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	@Override
	public String toString() {
		return "Users [Id=" + id + ", name=" + name + ", midname=" + midname + ", surname=" + surname + "]";
	}
	

}
