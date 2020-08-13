package 실습5_3;

import java.util.Scanner;

// 171p 실습 5-3
// 재귀 함수 이해하기

public class Recur {
	// 재귀 함수
	static void recur(int n) {
		if (n > 0) {
			recur(n - 1);
			System.out.println(n);
			recur(n - 2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요.: ");
		int x = sc.nextInt();

		recur(x);
	}
}
