package pert1;

import java.util.Scanner;



public class Main {
	
	
	public static void main(String[] args) {

		
//  	Ini adalah Comment
/*
 * 		boolean
 * 		byte - short - int - long - float - double
 * 					   /
 * 					  /
 * 					char
 * 				tidak bisa konversi dari kiri ke kanan secara manual
 * 				yang bisa itu dari kanan ke kiri
 * 				boolean itu berdiri sendiri gaa bisa diikonversi kan ke primitive lainnya
 * 				char ini bisa di konversikan ke dalam bentuk int, dan seterusnya data numeric ataupun pecahan decimal		
 */					
//		String Dimana? merupakan sebuah object
//		yang sering kepake itu cuma int, float, double, char, String, long mungkin terjadi kalo misal nya kalian butuh nyimpen data numeric gede
		
		
		
//		byte byte1 = 127;
//		short short1 = byte1;
//		byte byte2 = (byte) short1; 
//		Integer nomorPertama = new Integer(12); 
//		long longPertama = nomorPertama;
//		int nomorKedua = (int)longPertama;
//		float floatPertama = (float) 12.0;
//		double doublePertama = (double)12.8545122456122;
//		
////		System.out.println(Integer.parseInt("12"));
////		System.out.println((int) doublePertama);
//		
//		String nama, ttl, jurusan;
//		
//		System.out.println("Masukan nama, ttl, dan jurusan kalian seperated by spasi");
//		nama = sc.nextLine();
//		ttl = sc.nextLine();
//		jurusan = sc.nextLine();
//		
//		System.out.println("Nama saya adalah " + nama);
//		System.out.printf("Tempat tanggal lahir di %s, ", ttl);
//		System.out.printf("Saya dari jurusan %s.\n", jurusan);
//		System.out.print("Nice to meet ");
//		System.out.print("You");
		new Main();
		
		
		
	}
	
	int x = 5;
	Scanner sc = new Scanner(System.in);
	
	public Main() {
//		System.out.println(x);
//		System.out.println("ini dari main");
//		
////		predecense ++--, */, +- 
//		
//		
//		int op = ++x + 6 * x + 3;  
//		System.out.println(op);
//		
//		op = op % 2;
//				System.out.println(op);
//				
//	    op += 3;
//	    System.out.println(op);
//	    op = op + 3;
//	    op %= 5; // bisa modulo, tambah kurang kali bagi
//	    System.out.println(--op); // ini post 
//	    System.out.println(op++); // Ini pre
//	    System.out.println(op);
//	    
//	    boolean bool1 = op != 2;
//	    System.out.println(bool1);
//	 
//	    if (bool1) {
//	    	System.out.println("ini true");
//		} else if (bool1) {
//			System.out.println("ini tidak true");
//		} else {
//			System.out.println("ini dari else");
//		}
	    
	    String a = "Oracle", b = new String("Oracle");
	    System.out.println("disini");
	    System.out.println(a == b );
	    System.out.println(a.compareTo(b));
	    System.out.println(a.equals(b));

//	    	    looping
//	    looping adalah perulangan, kalo pake for, itu biasanya dipake ketika kita tau jumlah perulangan yang akan terjadi
	    
//	    for, while, do while
	    for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	    System.out.println("==================");
	    int x = 4;
//	    do {
//			System.out.println(x);
//		} while (x != 4);
//	    int s = 5;
//	    while (s <= 10) {
//			if (s == 7) {
//				System.out.println("skip");
//				s++;
//				continue;
//			}
//			System.out.println(s++);
//		}
	    
//	    for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print("");
//			} System.out.println();
//		}
	}
}
