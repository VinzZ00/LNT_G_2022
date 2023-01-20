package pert5Interface;

public abstract class Parent {

	protected String kata1;
	String kata2;

	public Parent(String kata1, String kata2) {
		super();
		this.kata1 = kata1;
		this.kata2 = kata2;
	}
	
	public Parent() {
		
	}
	
	public abstract void sayHi(String name);
	
	public void sayHello(String name) {
		System.out.println("Hello my name is " + name + " from sayHello method");
	}
	
}
