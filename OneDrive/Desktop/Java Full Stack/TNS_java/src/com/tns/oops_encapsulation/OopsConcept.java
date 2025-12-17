package com.tns.oops_encapsulation;

public class OopsConcept {

	private int serialNum;  //private can be accessable with in the class
	private String name;
	private int age;
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override  //used to convert int to String
	public String toString() {
		return "OopsConcept [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}
	
	
	//"this" refers to current object 
}
