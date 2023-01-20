package pert5Interface;

import pert4.child;

public class Child extends Parent{

	String katachild1, katachild2;

	public Child(String kata1, String kata2, String katachild1, String katachild2) {
		super(kata1, kata2);
		this.katachild1 = katachild1;
		this.katachild2 = katachild2;
	}
	
	
	
	public Child(String kata1, String kata2, int child1, int child2) {
		
	}
	
	public Child(int child1, int child2, String kata1, String kata2) {
		
	}
	
	public void childMethod1() {
		this.kata1 = "override dari child1";
	}
	
	public static void main(String[] args) {
		child c = new child("Parent1", "Parent2", "Child1", "Child2");
		c.childMethod1();
	}
	
	public String getkata1() {
		return this.kata1;
	}
	
	public void setKata1(String kata1) {
		this.kata1 = kata1;
	}

	@Override
	public void sayHi(String name) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello my name is " + name + " I am from sayHi method");
	}
	
	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("Hello my name is " + name + " I am from sayHello in Child Class");
	}
	
	
	public int sayHello(int umur) {
		// TODO Auto-generated method stub
		System.out.println("I dont know my name, but I am " + umur+ " YO, I am from sayHello in Child Class");
		return umur;
	}
}
