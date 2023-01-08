package com.example.slip9;

public class HR {
	String name , organization;
	int mob;
	
	
	public HR() {
		super();
		
	}


	public HR(String name, String organization, int mob) {
		super();
		this.name = name;
		this.organization = organization;
		this.mob = mob;
	}


	@Override
	public String toString() {
		return "HR [name=" + name + ", organization=" + organization + ", mob=" + mob + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getOrganization() {
		return organization;
	}


	public void setOrganization(String organization) {
		this.organization = organization;
	}


	public int getMob() {
		return mob;
	}


	public void setMob(int mob) {
		this.mob = mob;
	}
	
	
	
}
