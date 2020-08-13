package q09;

import java.util.Scanner;

//83p Q9

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry; // 다시 한 번?

		System.out.println("그 해의 남은 일수를 구합니다.");

		do {
			System.out.print("년 : ");
			int year = stdIn.nextInt();  // 년
			System.out.print("월 : ");
			int month = stdIn.nextInt(); // 월
			System.out.print("일 : ");
			int day = stdIn.nextInt();   // 일

			System.out.printf("올해는 %d일 남았습니다.\n", leftDayOfYear(year, month, day));

			System.out.print("한 번 더 할까요? (1.예/0.아니오 : ");
			retry = stdIn.nextInt();
		} while (retry == 1);

		stdIn.close();
	} // end main()

	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
							 { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }  // 윤년
	};

	// 서기 year년은 윤년인가? (윤년: 1 / 평년: 0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	static int leftDayOfYear(int y, int m, int d) {
		int lday = mdays[isLeap(y)][m - 1] - d;

		for (int i = m; i < 12; i++) {
			lday += mdays[isLeap(y)][i];
		}

		return lday;
	} // end leftDayOfYear
} // end Main
