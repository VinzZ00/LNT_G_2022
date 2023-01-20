package pert6;

import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	
	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public void tryCatch() {
		try {
			System.out.println("masukan angka pertama");
			int a = sc.nextInt(); sc.nextLine();
			System.out.println("masukan angka Kedua");
			int b = sc.nextInt(); sc.nextLine();
			
			int c = a/b;
			System.out.println("Resultnya dari pembagian 2 angka diatas adalah " + c);
			
			
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("Tolong jangan bagi dengan nol, karena akan menghasilkan infinity");
			System.out.println("literally jawaban dari operasi diatas adalah infinity");
			try {
				System.out.println("ini di try");
			} finally {
				System.out.println("Ini dari finally dalam try");
			}
		} finally {
			try {
				System.out.println("Try Catch kedua");
				String nullstring = null;
				
				int testNUllPointer = nullstring.indexOf("a");
				
				System.out.println("index dari 'a' adalah" + testNUllPointer);
			} catch (NullPointerException e2) {
				// TODO: handle exception
				System.out.println("string yang anda null, tidak kosong, tapi tidak berisi juga");
			}
		}
	}
	
	public void thrEx() {
		
		
		System.out.println("Masukan Nama");
		String nama = sc.nextLine();
		System.out.println("Masukan Alamat");
		String alamat = sc.nextLine(); 
		System.out.println("Masukan Email");
		String email = sc.nextLine();
		System.out.println("Masukan Tinggi badan");
		double tinggiBadan = 0;
		do {
			try {
				tinggiBadan = sc.nextDouble();
				sc.nextLine();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Tolong masukan angka jangan huruf");
				tinggiBadan = -1;
				sc.nextLine();
			} 
		} while (tinggiBadan == -1);
		System.out.println("Tekan apa saja untuk melanjutkan");
		sc.nextLine();
		Pengunjung p1 = new Pengunjung(nama, alamat, email, tinggiBadan);
		try {
			p1.generateTicket();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Sorry, Please Come Again next year, makan yang banyak, jangan lupa olahraga");
			System.exit(0);
		}
		
		p1.ride(); 
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.thrEx();
	}

}
