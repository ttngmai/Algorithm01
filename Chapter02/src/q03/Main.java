package q03;

import java.util.Scanner;
// 61p Q3

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

		System.out.println("모든 요소의 합계 : " + arrSum(a));

		sc.close();
	} // end main()

	static int arrSum(int[] a) {
		int sum = 0;

		for (int n : a) {
			sum += n;
		}

		return sum;
	} // end arrSum()
} // end Main
