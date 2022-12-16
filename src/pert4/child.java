package pert4;

import pert4ObjectPack.parent;

public class child extends parent{

	String katachild1, katachild2;

	public child(String kata1, String kata2, String katachild1, String katachild2) {
		super(kata1, kata2);
		this.katachild1 = katachild1;
		this.katachild2 = katachild2;
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

}
