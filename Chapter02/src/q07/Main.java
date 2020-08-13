package q07;

import java.util.Scanner;

// 70p Q7

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input; // 변환할 수
		int base; // 진법
		int digit; // 변환한 수의 자릿수
		char[] d = new char[32];

		System.out.println("10진수를 기수 변환합니다.");

		do {
			System.out.print("변환하는 음이 아닌 정수 : ");
			input = sc.nextInt();
		} while (!(input >= 0));

		do {
			System.out.print("어떤 진수로 변환할까요? (2~36) : ");
			base = sc.nextInt();
		} while (!(2 <= base && base <= 36));

		digit = convert(input, base, d);

		System.out.print(base + "진수로 ");
		for (int i = digit - 1; i >= 0; i--) {
			System.out.print(d[i]);
		}
		System.out.println(" 입니다.");

		sc.close();
	} // end main()

	static int convert(int input, int base, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		int n = 0;
		do {
			n++;
			if (n == 1)
				System.out.printf("%2d|%10d\n", base, input);
			else
				System.out.printf("%2d|%10d ... %s\n", base, input, d[digits - 1]);

			System.out.printf("%2s+----------\n", " ");

			d[digits++] = dchar.charAt(input % base);
			input /= base;
		} while (input != 0);

		System.out.printf("%13d ... %s\n", input, d[digits - 1]);

		return digits;
	} // end convert()
} // end Main
