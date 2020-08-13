package q05;

import java.util.Random;

// 64p Q5

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] a = new int[5];
		int[] b = new int[5];

		for (int i = 0; i < b.length; i++) {
			b[i] = rand.nextInt(10);
		}

		System.out.println("배열 a : ");
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();

		System.out.println("배열 b : ");
		for (int i : b)
			System.out.print(i + " ");
		System.out.println();

		rcopy(a, b);
		System.out.println("--- 복사 후 ---");

		System.out.println("배열 a : ");
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();

		System.out.println("배열 b : ");
		for (int i : b)
			System.out.print(i + " ");
		System.out.println();
	} // end main()

	static void rcopy(int[] a, int[] b) {
		if (a.length < b.length) {
			System.out.println("복사값을 넣을 배열의 공간이 부족합니다.");
			return;
		}

		for (int i = 0, j = b.length - 1; j >= 0; i++, j--) {
			a[i] = b[j];
		}
	} // end rcopy()
} // end Main
