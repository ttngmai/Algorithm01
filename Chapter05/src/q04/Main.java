package q04;

import java.util.Scanner;

// 174p Q4

public class Main {
	// 재귀 함수
	static void recur2(int n) {
		if (n > 0) {
			recur2(n - 2);
			System.out.println(n);
			recur2(n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요.: ");
		int x = sc.nextInt();

		recur2(x);
	}
}
