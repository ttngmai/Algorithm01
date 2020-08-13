package q15;

import java.util.Scanner;

// 40p 15Q

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.print("삼각형의 높이 입력 : ");
			n = sc.nextInt();
		} while (n <= 1);

		triangleLB(n);
		triangleLU(n);
		triangleRB(n);
		triangleRU(n);

		sc.close();
	} // end main()

	// 왼쪽 아래가 직각인 이등변 삼각형을 출력
	static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++)
				System.out.print("*");

			System.out.println();
		}
	} // end triangleLB()

	// 왼쪽 위가 직각인 이등변 삼각형을 출력
	static void triangleLU(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 0; j < i; j++)
				System.out.print("*");

			System.out.println();
		}
	} // end triangleLU()

	// 오른족 아래가 직각인 이등변 삼각형을 출력
	static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++)
				System.out.print(" ");

			for (int k = 0; k < i; k++)
				System.out.print("*");

			System.out.println();
		}
	} // end triangleRB()

	// 오른쪽 위가 직각인 이등변 삼각형을 출력
	static void triangleRU(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++)
				System.out.print(" ");

			for (int k = n - i; k > 0; k--)
				System.out.print("*");

			System.out.println();
		}
	} // end triangleRU()
} // end Main
