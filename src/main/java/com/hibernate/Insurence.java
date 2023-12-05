package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Insurence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String dept;
	@Override
	public String toString() {
		return "Insurence [id=" + id + ", name=" + name + ", dept=" + dept + ", roolno=" + roolno + "]";
	}
	private int roolno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getRoolno() {
		return roolno;
	}
	public void setRoolno(int roolno) {
		this.roolno = roolno;
	}

}
