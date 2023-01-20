package pert5;

import pert4.Burung;
import pert4.Kucing;
import pert4.child;
import pert4ObjectPack.Hewan;
import pert5Interface.Child;
import pert5Interface.Hewan2;
import pert5Interface.Parent;
import pert5Interface.interface1;

public class Main {
	
	/*
	3. Polymorph (Hari ini dipelajari) 
	 a. Override
		kita menganti body dari sebuah method yang awalnya sudah memiliki body ataupun yang belum memiliki body
		Syarat Override
		1. nama method harus sama
		2. parameter tidak bisa berubah
		3. return type tidak bisa diubah
		hanya bisa mengubah body doang
		ketika di panggil itu akan memanggil memberikan return bergantung dari class mana object itu berasal
	 b. Overload
	 	Kita membuat lebih dari 1 method dengan nama yang sama di dalam 1 class 
	 	syaratnya 
	 	1. Parameter harus berbeda (tipe datanya harus berbeda || jumlah parameter berbeda || peletakan dari parameternya berbeda)
	 	2. return type tidak berpengaruh, bisa berbeda, bisa sama
	 	3. body tidak berpengaruh, bisa beda ataupun sama
	 	4. penamaan variable parameter tidak berpengaruh
	 	
	 */
	
	public Main() {
		// TODO Auto-generated constructor stub
		Parent p = new Child("kata 1", "Kata 2", "Kata 3", "Kata 4") {
			@Override
			public void sayHello(String name) {
				// TODO Auto-generated method stub
				super.sayHello(name);
			}
		};
		p.sayHi("Elvin");
		((Parent)p).sayHello("Jonny");
		
		Parent p2 = new Parent("Kata 1", "Kata 2") {
			
			@Override
			public void sayHi(String name) {
				// TODO Auto-generated method stub
				System.out.println("Hello my name is " + name  + " I am an anonymous class");
			}
			
			@Override
			public void sayHello(String name) {
				// TODO Auto-generated method stub
//				super.sayHello(name);
				System.out.println("Aku terganti");
			}
		};
		
		p2.sayHello("Elvin");
		
		Child c = new Child("Kata1", "Kata2", "Kata3", "Kata4");
		
		Burung b = new Burung(2, 2, "bertelur", 2);
		
		
		if (c instanceof interface1) {
			System.out.println("Ini merupakan child class Interface1");
		} else if (c instanceof Parent) {
			System.out.println("Ini merupakan child class Parent");
		}
		
	
		if (b instanceof Hewan) {
			System.out.println("Ini merupakan child dari kelas Hewan");
		}
		
		Child c2 = new Child("Kata1", "Kata2", "Kata3", "Kata4");
		
		c2.sayHello("elvin");
		c2.sayHello(20);
//		Child c2 = new Child();
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
