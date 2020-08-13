package q09;

import java.util.Scanner;

// 30p Q9

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("a와 b사이의 합을 구합니다. (a, b 포함)");
		System.out.println("a의 값 : ");
		int a = sc.nextInt();
		System.out.println("b의 값 : ");
		int b = sc.nextInt();

		System.out.println(sumof(a, b));

		sc.close();
	}

	static int sumof(int a, int b) {
		int sum = 0;

		if (a > b) {
			int tmp = a;
			a = b;
			b = tmp;
		}

		for (int i = a; i <= b; i++)
			sum += i;

		return sum;
	}
}
