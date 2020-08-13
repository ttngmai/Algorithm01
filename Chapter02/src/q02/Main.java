package q02;

import java.util.Scanner;

// 60p Q2

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = sc.nextInt();

		int[] a = new int[num];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}

		for (int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();

		reverse(a);

		sc.close();
	} // end main()

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;

		System.out.println("a[" + idx1 + "]과(와) a[" + idx2 + "]를 교환합니다.");
	}

	static void reverse(int a[]) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);

			for (int n : a)
				System.out.print(n + " ");
			System.out.println();

			if (i == a.length / 2 - 1)
				System.out.println("역순 정렬을 마쳤습니다.");
		}
	} // end reverse()
} // end Main
