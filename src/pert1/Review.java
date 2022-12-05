package pert1;

public class Review {

	
	public Review() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int i = 5;
//		for (int i1 = 1; i1 <= 5; i1++) {
//			System.out.println("ini angka ke " + i1);
//		}
//		System.out.println(i);
//	}
////		nested For
//		int count = 0;
//		for (int j = 0; j < 3; j++) {
//			for (int j2 = 0; j2 < 5; j2++) {
////				and itu harus true dan true = true 
////				kalo or itu salah satu true = true
//				if (j == 1 && j2 == 2) {
//					System.out.println("ini di break");
//					break;
//				}
//				System.out.println("ini j ke " + j + " j2 ke " + j2);
//				count++; // Ini post auto increement 
////				kalo post auto decreement itu -- contoh count-- 
//			}
//			System.out.println();
//		}
//		System.out.println(count);
		int condition = 1;
		while (condition < 6) {
			if (condition == 1 || condition  == 3 || condition == 5) {
				condition++;
				continue;
			} 
				System.out.println(condition++);	
		}
		System.out.println("while habis");
//		do {
//			System.out.println("ini dari do while value condition adalah " + condition);
//		} while (condition != 6);
		
		
		}
}
