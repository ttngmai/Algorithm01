package q04;

import java.util.Scanner;

// 117p Q4

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int n = sc.nextInt();
		int[] x = new int[n];

		System.out.print("a[0] : ");
		x[0] = sc.nextInt();

		for (int i = 1; i < n; i++) {
			do {
				System.out.print("a[" + i + "] : ");
				x[i] = sc.nextInt();
			} while (x[i] < x[i - 1]); // 앞의 요소보다 작으면 다시 입력
		}

		System.out.print("검색할 값 : ");
		int key = sc.nextInt();

		binSearch(x, n, key);

		sc.close();
	} // end main()

	static void binSearch(int[] x, int n, int key) {
		int pl = 0;
		int pr = n - 1;

		System.out.printf("%4s", "|");
		for (int i = 0; i < n; i++)
			System.out.printf("%3d", i);
		System.out.println();
		System.out.println("---+--------------------");

		while (true) {
			int pc = (pl + pr) / 2;

			System.out.printf("%4s", "|");

			for (int i = 0; i < pl; i++)
				System.out.printf("%3s", " ");

			System.out.print(" <-");

			for (int i = pl + 1; i < pc; i++)
				System.out.printf("%3s", " ");

			System.out.print("  +");

			for (int i = pc + 1; i < pr; i++)
				System.out.printf("%3s", " ");

			System.out.print(" ->");
			System.out.println();

			System.out.printf("%3d|", pc);

			for (int i = 0; i < n; i++)
				System.out.printf("%3d", x[i]);
			System.out.println();

			if (x[pc] == key) {
				System.out.println(key + "는 x[" + pc + "]에 있습니다.");
				return;
			} else if (x[pc] < key) {
				pl = pc + 1;
			} else {
				pr = pc - 1;
			}

			if (pl > pr) {
				System.out.println("그 값의 요소가 없습니다.");
				return;
			}

			System.out.printf("%4s\n", "|");
		} // end while
	} // end binSearch()
} // end Main
