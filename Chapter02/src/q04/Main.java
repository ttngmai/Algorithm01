package q04;

import java.util.Random;

// 64p Q4

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] a = new int[5];
		int[] b = new int[5];
		
		for(int i = 0; i < b.length; i++) {
			b[i] = rand.nextInt(10);
		}
		
		System.out.println("배열 a : ");
		for(int i : a)
			System.out.print(i + " ");
		System.out.println();
		
		System.out.println("배열 b : ");
		for(int i : b)
			System.out.print(i + " ");
		System.out.println();
		
		copy(a, b);
		System.out.println("--- 복사 후 ---");
		
		System.out.println("배열 a : ");
		for(int i : a)
			System.out.print(i + " ");
		System.out.println();
		
		System.out.println("배열 b : ");
		for(int i : b)
			System.out.print(i + " ");
		System.out.println();
	} // end main()
	
	static void copy(int[] a, int[] b) {
		if(a.length < b.length) {
			System.out.println("복사값을 넣을 배열의 공간이 부족합니다.");
			return;
		}
		
		for(int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
	} // end copy()
} // end Main
