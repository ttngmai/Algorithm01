package q09;

import java.util.Scanner;

// 223p Q9

public class Main {
	// 셸 정렬(버전1)
	static int shellSort1(int[] a, int n) {
		int move = 0;
		for (int h = n / 2; h > 0; h /= 2)
			for (int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
					a[j + h] = a[j];
					move++;
				}
				a[j + h] = tmp;
				move++;
			}
		return move;
	}
	
	// 셸 정렬(버전2)
	static int shellSort2(int[] a, int n) {
		int move = 0;
		int h;
		for (h = 1; h < n / 9; h = h * 3 + 1);
		
		for( ; h > 0; h /= 3)
			for (int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
					a[j + h] = a[j];
					move++;
				}
				a[j + h] = tmp;
				move++;
			}
		return move;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("셸 정렬");
		System.out.print("요솟수: ");
		int nx = stdIn.nextInt();
		int[] x1 = new int[nx];
		int[] x2 = new int[nx];
		
		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]: ");
			x1[i] = x2[i] = stdIn.nextInt();
		}
		
		int m1 = shellSort1(x1, nx); // 배열 x를 셸 정렬합니다.
		int m2 = shellSort2(x2, nx); // 배열 x를 셸 정렬합니다.
		
		System.out.println("오름차순으로 정렬했습니다.(버전1)");
		for (int i = 0; i < nx; i++)
			System.out.println("x1[" + i + "] = " + x1[i]);
		System.out.println("요소의 이동횟수: " + m1);
		
		System.out.println("오름차순으로 정렬했습니다.(버전2)");
		for (int i = 0; i < nx; i++)
			System.out.println("x2[" + i + "] = " + x2[i]);
		System.out.println("요소의 이동횟수: " + m2);
	}
}
