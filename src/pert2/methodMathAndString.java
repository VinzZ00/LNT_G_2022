package pert2;

import java.util.Random;
import java.util.Scanner;


public class methodMathAndString {
	
	Scanner sc = new Scanner(System.in);
	
	private void mathMethod(int validator) {
		
//		int Inputan = sc.nextInt(); sc.nextLine();
		
//		int total = Inputan-validator;
//		System.out.println(total);
//		System.out.println(Math.abs(total));
//		2
//		002 -- Zero Leading
		System.out.println(String.format("Ini Zero leading dengan 2 0's di depan %03d", 2));
		System.out.println(String.format("Ini Zero leading dengan 2 0's di depan %03d", 20));
		System.out.println(String.format("Ini Zero leading dengan 2 0's di depan %03d", 200));
//		System.out.println(Math.random()); // return 0 - 1 dalam double 0 || 0.564645616 || 0.2546546 || 1
		System.out.printf("dua angka dibelakang koma %.6f \n", (double)1.2545646546546);
		Random r = new Random(1);
		Random rand = new Random(1);
		Random random = new Random(0);
		System.out.println("r " + r.nextInt());
		
		System.out.println("rand " + rand.nextInt());
		System.out.println("Random " + random.nextInt());
		
//		int random = (int) Math.round(Math.random() * 5) + 10;
		System.out.println("Random number is " + random);
//		System.out.printf("Random number is %f \n", Math.random() * 5);
		Double x =  6.54014516516516;
//		int y = 5;
		System.out.println(Math.pow(2, 3));
		System.out.println("SQRT " + Math.sqrt(4));
		System.out.println(Math.floorDiv(5, 2));
		System.out.println(Math.floor(5/2));
		System.out.println(Math.floor(x)); // pembulatan kebawah
		System.out.println(Math.round(x)); // pembulatan terdekat
		System.out.println(Math.ceil(x)); // pembulatan keatas
		
	}
	
	private void stringmethod() {
		// TODO Auto-generated method stub
		String charAtEx = "Budia";
//		                   01234 
		System.out.println("Total Panjang CharAtEx " + charAtEx.length());
		System.out.println(charAtEx.charAt(charAtEx.length()));
//		String testing = new String("budi");
//		testing = testing.concat(" adalah mahasiswa Binus");
//		System.out.println(testing);
//		if (!testing.contains(" adalah mahasiswa BINUS")) {
//			System.out.println(testing + " adalah mahasiswa BINUS");
//		}
//		//budi adalah mahasiswa BINUS
//		//budi adalah mahasiswa Binus
//		System.out.println(charAtEx == testing);
//		System.out.println(charAtEx.equals(testing));
		
//		String value = "WelcomeToBinus";
//		                0123456789dst
//		System.out.println(value.substring(7, 14));
//		System.out.println(value.substring(7));
//		System.out.println(testing.toUpperCase().compareTo(charAtEx.toUpperCase()));
//		System.out.println(testing.compareToIgnoreCase(charAtEx));
//		System.out.println(1 == 1);
	}
	
	public methodMathAndString(String value) {
		System.out.println("ini dari constructor");
		System.out.println(value);
//		stringmethod();
		mathMethod(5);
		//String method --> ini adalah method yang digunakan untuk manipulasi value string
		
	}
	
	public void menu() {
		System.out.println("Menu");
		System.out.println("1. Makan");
		System.out.println("2. Tidur");
		System.out.println("3. Exit");
		
	}

	public static void main(String[] args) {
		new methodMathAndString("Hello world");
		System.out.println("Ini dari Main");
	}
}
