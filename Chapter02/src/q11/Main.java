package q11;

// 93p q11
/* 개선해야 될 점: 
	1달 범위 앞뒤로는 계산되지만 2달 이상 범위 앞뒤로는 문제 발생
*/

public class Main {
	public static void main(String[] args) {

		YMD a = new YMD(2020, 5, 10);
		a.after(30);
		System.out.println(a);

		YMD b = new YMD(2020, 1, 1);
		b.before(10);
		System.out.println(b);

	} // end main()
} // end Main

class YMD {
	int y; // 년
	int m; // 월(1 ~ 12)
	int d; // 일(1 ~ 31)

	int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
					  { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } // 윤년
	};

	int check = (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) ? 1 : 0;

	// 생성자
	public YMD(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}

	// n일 뒤의 날짜를 반환
	YMD after(int n) {
		d += n;

		if (mdays[check][m - 1] < d) {
			m += 1;

			if (m > 12) {
				m = 1;
				y += 1;
			}

			int preM = (m == 1) ? 12 : m - 1;
			d -= mdays[check][preM - 1];

			return new YMD(y, m, d);

		} else {
			return new YMD(y, m, d + n);
		}
	} // end after()

	// n일 전의 날짜를 반환
	YMD before(int n) {
		d -= n;

		if (d < 1) {
			m -= 1;

			if (m < 1) {
				m = 12;
				y -= 1;
			}

			d += mdays[check][11];

			return new YMD(y, m, d);

		} else {
			return new YMD(y, m, d);
		}
	} // end before()

	@Override
	public String toString() {
		String str = this.y + "년" + this.m + "월" + this.d + "일";
		return str;
	}

} // end YMD
