package q11;

import java.util.Scanner;
// 33p Q11

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("입력한 양의 정수의 자릿수를 출력합니다.");
		int n;

		do {
			System.out.print("양의 정수 입력 : ");
			n = sc.nextInt();
		} while (n <= 0);

		int a = n;
		int cnt = 0;
		while (true) {
			cnt++;
			a /= 10;
			if (a == 0)
				break;
		}

		System.out.println("그 수는 " + cnt + "자리입니다.");

		sc.close();
	} // end main()
} // end Main
