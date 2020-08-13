package q01;

import java.util.Scanner;

// 170p Q1

public class Main {
	static int factorial(int x) {
		int result = 1;
		while (x > 1) {
			result *= x;
			x--;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요.: ");
		int x = sc.nextInt();

		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
	}
}
