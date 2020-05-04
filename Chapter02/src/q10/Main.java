package q10;

import java.util.Scanner;
// 93p Q10

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		PhyscData[] x = { new PhyscData("박현규", 162, 0.1),
						  new PhyscData("함진아", 173, 0.2),
						  new PhyscData("최윤미", 175, 0.2),
						  new PhyscData("홍연의", 171, 0.2),
						  new PhyscData("이수진", 168, 0.3),
						  new PhyscData("김영준", 174, 0.4),
						  new PhyscData("박용규", 169, 0.4) };
		int[] vdist = new int[VMAX]; // 시력 분포

		System.out.println("■ 신체검사 리스트 ■");
		System.out.println("이름       키        시력");
		System.out.println("---------------");
		for (int i = 0; i < x.length; i++)
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);

		System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));

		distVision(x, vdist); // 시력 분포를 구함

		System.out.println("\n시력 분포");
		for (int i = 0; i < VMAX; i++) {
			System.out.printf("%3.1f ~ : ", i / 10.0);

			for (int j = 0; j < vdist[i]; j++)
				System.out.print("*");

			System.out.println();
		}

		stdIn.close();
	} // end main()

	static final int VMAX = 21;

	static class PhyscData {
		String name; // 이름
		int height; // 키
		double vision; // 시력

		// 생성자
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	} // end PhyscData

	// 키의 평균값을 구함
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;

		for (int i = 0; i < dat.length; i++)
			sum += dat[i].height;

		return sum / dat.length;
	} // end aveHeight()

	// 시력 분포를 구함
	static void distVision(PhyscData[] dat, int[] dist) {
		int i = 0;

		dist[i] = 0;
		for (i = 0; i < dat.length; i++)
			if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
				dist[(int) (dat[i].vision * 10)]++;
	} // end distVision()
} // end Main
