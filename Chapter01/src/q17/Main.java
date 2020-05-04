package q17;

import java.util.Scanner;
// 40p Q17

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.print("양의 정수 입력 : ");
			n = sc.nextInt();
		} while (n <= 0);

		npira(n);

		sc.close();
	} // end main()

	static void npira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int e = 0; e < n - i; e++)
				System.out.print(" ");

			for (int a = 0; a < (i * 2 - 1); a++)
				System.out.print(i % 10);

			for (int e = 0; e < n - i; e++) {
				System.out.print(" ");
			}

			System.out.println();
		}
	} // end npira()
} // end Main
