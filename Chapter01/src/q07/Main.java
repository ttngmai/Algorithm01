package q07;

import java.util.Scanner;

// 30p Q7

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
			if (i == n)
				System.out.print(i + " = " + sum);
			else
				System.out.print(i + " + ");
		}

		sc.close();
	}
}