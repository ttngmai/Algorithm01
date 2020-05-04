package q08;

import java.util.Scanner;
// 30p Q8

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = sc.nextInt();

		int sum = 0;

		for (int i = 0; i < (n / 2); i++) {
			sum += 1 + n;
		}

		if (n % 2 == 1) {
			sum += n / 2 + 1;
		}

		System.out.println(sum);

		sc.close();
	} // end main()
} // end Main
