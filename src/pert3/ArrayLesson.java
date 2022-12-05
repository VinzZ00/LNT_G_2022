package pert3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;


public class ArrayLesson {
	/* Array?
	 * Array adalah sebuah kumpulan data yang mempunyai jenis tipe data yg sama, Contoh
	 * 
	 * kumpulan dari int, float, string, boolean
	 * 							char array 
	 * dilambangkan dengan [] (kurung segiempat)
	 * array terbagi menjadi 2
	 * 1. Array statis => array yang tidak akan berubah sizenya yang dimaksud dengan size adalah jumlah tampungan, ini kita kenal dengan lenght, mutable kita bisa ngeganti anggota nya 
	 * array dari int terdiri dari 1, 2, 4, 6 bisa di ganti jadi 1, 2, 3, 4 tanpa di timpa (replace)
	 * String value "Hallo" gaa bisa di ganti per anggotanya, harus di replace
	 * bisa di declare sebagai array kosong biasa, bisa juga di declare dan init secara bersamaan, 
	 * 2. Array dinamis => sizenya bisa berubah ubah, jadi bertambah secara otomatis, mutable, ini harus mengunakan library java, antara lain contohnya: vector, Arraylist, map, stack, list  
	 *
	 */
	Scanner sc = new Scanner(System.in);
	
	public void arrayDinamis() {
		/*
		 * array dinamis yang akan dipelajar hari ini, Arraylist, dan Vector
		 * bedanya arraylist dan vector, cara penambahan data dan sifatnya
		 * Arraylist bersifat asynchronous, synchronous
		 * capacity = size maksimum, akan bertambah setiap kali size udh mencapai bahas capacity
		 * capacity 10
		 * size gaa mungkin lebih dari 10
		 * size = tempat yang udh di penuhi
		 * ada jenis lain contoh, hashmap, queue, stack deque, 
		 */
		
//		Ini vector.
		System.out.println("ini Vector");
		Vector<Integer> integerVec = new Vector<>(5);
		
		System.out.println("Size before : " + integerVec.size());
		
		for (int i = 1; i < 6; i++) {
			integerVec.add(i);
		}
		System.out.println("Size After : " + integerVec.size());
		System.out.println("Capacity " + integerVec.capacity());
		
		integerVec.add(6);
		
		System.out.println("Size after exceed max : " + integerVec.size());
		System.out.printf("Capacity after exceeded : %d\n",  integerVec.capacity());
		
		System.out.println("====================================\n\n");
		
		ArrayList<String> anggota = new ArrayList<>();

		anggota.add("Elvin"); // 0
		anggota.add("Irving"); // 1 
		anggota.add("Kelvin"); // 2
		
		for (String string : anggota) {
			System.out.println(string);
		}
		
		anggota.remove(1);
		System.out.println("\n=========================\n");
		for (String string : anggota) {
			System.out.println(string);
		}

		anggota.set(1, "kelvin Andreas");
		System.out.println("\n=========================\n");
		anggota.add("Irving");
		for (int i = 0; i < anggota.size(); i++) {
			System.out.println(anggota.get(i));
		}
		
		System.out.println(integerVec.contains(5));
		
		boolean contained = false;
		int idx = -1;
		for (int i = 0; i < anggota.size(); i++) {
			if (anggota.get(i).toLowerCase().equals("irving")) {
				contained = true;
				idx = i;
				break;
			}
		}
		
		
		System.out.println("Ada atau tidak " + contained);
		System.out.println("di index yang mana?, di " + idx);
		
		System.out.println("intergerVec data size adalah " + integerVec.size());
		integerVec.removeAll(integerVec);
		System.out.println("intergerVec data size after adalah " + integerVec.size());
		
		
		
		Vector<Object> allThings = new Vector<Object>();
		allThings.add(new UserDefinedObject());
		allThings.add(12);
		allThings.add("Elvin");
		allThings.add(true);
		allThings.add(12.123213);
		
		Vector<ArrayList<String>> nestedVector = new Vector<>();
		nestedVector.add(anggota);
		nestedVector.add(anggota);
		
		int indx = 1;
		for (ArrayList<String> arrayList : nestedVector) {
			for (String string : arrayList) {
				System.out.println("vector ke " + indx + " dengan value " + string);
			}
			indx++;
		}
		
		
		System.out.println("Dari object class");
		for (Object object : allThings) {
			System.out.println(object);
		}
		
		
		
		
		
	}
	
	public void arrayStatis() {
		int angkaPertama = 12; // hanya bisa simpan satu data di satu variable
		
		int[] kumpulanAngka = {12,35,15,27}; // ini di inisialisasi lgsung valuenya
//		                        0  1  2  3
		
		
		int kumpulanAngka2[] = new int[4] , satuAngkaDoang = 2;
		
		kumpulanAngka2[0] = 12;
		kumpulanAngka2[1] = 35;
		kumpulanAngka2[2] = 15;
//		kumpulanAngka2[3] = 12;
		
		char[] charsArray = new char[3];
		String[] stringsArray = new String[3];
		stringsArray[1] = "Hello";
		
		
		for (String string : stringsArray) {
			System.out.println(string);
		}
		System.out.println("======================\n\n");
		
		charsArray[1] = 'A';
		
		for (char c : charsArray) {
			System.out.println(c);
		}
		System.out.println("======================\n\n");
		
//		System.out.println(angkaPertama);
		System.out.println("ini dari kumpulan angka pertama");
		System.out.println(kumpulanAngka[0]);
		System.out.println(kumpulanAngka[1]);
		System.out.println(kumpulanAngka[2]);
		System.out.println(kumpulanAngka[3]);
//		System.out.println();
		
		System.out.println("======================\n\n");
		System.out.println("Ini dari kumpulan angka kedua");
		for (int i : kumpulanAngka2) {
			System.out.println(i);
		}

//		String hello= "Hello world";
//		
//		char[] helloArray = hello.toCharArray();
//		helloArray[6] = 'W';
//		String arrays = String.valueOf(helloArray);
//		
//		System.out.println(arrays);
//		
//		for (int angkaMasing : kumpulanAngka) {
//			System.out.println(angkaMasing);
//		}
		
//		for (int i = 0; i < kumpulanAngka.length; i++) {
//			System.out.println(kumpulanAngka[i]);
//		}
		
//		int angkaKedua = 13, angkaKetiga = 14;	
	}
	
	
	
	public ArrayLesson() {
		// TODO Auto-generated constructor stub
//		arrayStatis();
		arrayDinamis();
	}

	
	public static void main(String[] args) {
		new ArrayLesson();
	}
}
