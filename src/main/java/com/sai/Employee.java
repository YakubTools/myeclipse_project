package com.sai;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee implements Serializable{

	@Id
	private int id;
	private String name;
	@Column(name="salary")
	private double empSal;
	private String designation;
	//PDC+PPC+PSM+PGM+toString()
	public Employee() {
		super();
	}
	public Employee(int id, String name, double empSal, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.empSal = empSal;
		this.designation = designation;
	}
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
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", empSal=" + empSal + ", designation=" + designation + "]";
	}
	
	
}
