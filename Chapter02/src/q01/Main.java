package q01;

import java.util.Random;
import java.util.Scanner;

// 56p Q1

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("키의 최댓값을 구합니다");

		int num = rand.nextInt(11); // 요소의 값을 난수로 설정 (0 ~ 10)
		int[] height = new int[num];

		System.out.println("키 값은 아래와 같습니다.");
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90); // 요소의 값을 난수로 설정 (100 ~ 189)
			System.out.println("height[" + i + "] : " + height[i]);
		}

		System.out.println("최댓값은 " + maxOf(height) + "입니다.");

		sc.close();
	} // end main()

	// 배열 a의 최댓값을 구하여 반환합니다.
	static int maxOf(int[] a) {
		int max = a[0];

		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];

		return max;
	}
}
