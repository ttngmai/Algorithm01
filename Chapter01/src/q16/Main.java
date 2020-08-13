package q16;

import java.util.Scanner;

// 40p Q16

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.print("양의 정수 입력 : ");
			n = sc.nextInt();
		} while (n <= 0);

		spira(n);

		sc.close();
	} // end main()

	static void spira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int e = 0; e < n - i; e++)
				System.out.print(" ");

			int m = (i - 1) * 2 + 1;
			for (int s = 0; s < m; s++)
				System.out.print("*");

			for (int e = 0; e < n - i; e++)
				System.out.print(" ");

			System.out.println();
		}
	}
}
