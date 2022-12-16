package pert4;

import java.util.Scanner;

import pert4ObjectPack.Hewan;

public class Main {
	// Class itu standar penamaannya itu init caps (setiap kata diawali huruf besar)
	// Ini variable global
	String globalVarSayHallo = "Hello from another side";
	int globalNumber;
	Scanner sc = new Scanner(System.in);
	
	
	public Main() {
		// TODO Auto-generated constructor stub
		// Ini variable local
		
		String nama;
		int umur;
		String globalVarSayHallo;
		
		System.out.println(this.globalVarSayHallo);
		method1();
		System.out.println(this.globalVarSayHallo);
		
		globalVarSayHallo = "Hello dari method";
		System.out.println(globalVarSayHallo);

		// Down casting
		// Spesialisasi -> semakin detail.
		Hewan kucing = new Kucing(4, 10, "Melahirkan", 4);
		System.out.println("Suara hewan");
		((Kucing) kucing).suara();
		
//		Hewan anjing = new Hewan(4, 10, "Melahirkan");
//		anjing.setJumlahKaki(6);
//		anjing.jumlahKaki = 5;
		
//		Hewan[] hewanDomestik = {kucing, anjing};
		
//		System.out.println(hewanDomestik[1].jumlahKaki);
		
		Kucing tom = new Kucing(2, 20, "Melahirkan", 4);
		
		//Up casting
		Hewan hewanDomestik = ((Hewan)tom);
		
		Burung tweety = new Burung(2, 10, "bertelur", 2);
		
		System.out.println("suara tom ");
		tom.suara();
		System.out.println("Jumlah cakar tom " + tom.getJumlahSetCakar());
		
		System.out.println("Suara tweety");
		tweety.suara();
		
//		Ini error karena tweety tidak bisa di simpan dalam array class kucing.
//		Kucing[] kucings = new Kucing[2];
//		kucings[0] = tom;
//		kucings[1] = tweety;
		
//		Tapi tweety bisa di simpan dalam kelas Hewan karena hewan adalah parent dari tweety (burung) begitu juga dengan kucing.
		Hewan[] hewans = new Hewan[2];
//		Menyimpan child ke parent = upcasting.
		hewans[0] = tom;
		hewans[1] = tweety;
		
		// Implementasi Down casting
		Kucing k = (Kucing) tom;
		System.out.println(k.getJumlahSetCakar());
		
		
		
		
	} 
	
	public void method1() {
		globalVarSayHallo = "Hello world";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		
		m.parentChild();
	}
	
	void parentChild() {
		child c = new child("parent1", "parent2", "Child1" , "child2");
		
		System.out.println(c.getkata1());
		c.childMethod1();
		System.out.println(c.getkata1());
		c.setKata1("Ini dari main");
		System.out.println(c.getkata1());
	}

}
