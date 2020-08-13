package q10;

import java.util.Scanner;

// 33p Q10

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("a의 값 : ");
		int a = sc.nextInt();

		System.out.print("b의 값 : ");
		int b = sc.nextInt();

		while (a >= b) {
			System.out.println("a보다 큰 값을 입력하세요");

			b = sc.nextInt();
		}

		System.out.println("a - b는 " + (b - a) + "입니다.");

		sc.close();
	}
}
