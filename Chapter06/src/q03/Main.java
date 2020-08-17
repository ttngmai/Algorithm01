package q03;

import java.util.Scanner;

// 206p Q3

public class Main {
	// a[idx]와 a[idx2]의 값을 바꿉니다.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// 버블 정렬
	static void bubbleSort(int[] a, int n) {
		int compareCnt = 0;
		int swapCnt = 0;
		
		for (int i = 0; i < n - 1; i++) {
			int exchg = 0;
			System.out.println("패스" + (i + 1) + ":");
			for (int j = n - 1; j > i; j--) {
				for (int k = 0; k < n - 1; k++)
					System.out.printf("%3d %c", a[k], (k != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
				System.out.printf("%3d\n", a[n - 1]);
				
				compareCnt++;
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					swapCnt++;
					exchg++;
				}
			}
			for (int k = 0; k < n; k++)
				System.out.printf("%3d  ", a[k]);
			System.out.println();
			if (exchg == 0) break;
		}
		System.out.println("비교를 " + compareCnt + "회 했습니다.");
		System.out.println("교환을 " + swapCnt + "회 했습니다.");
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("버블 정렬(버전2)");
		System.out.print("요솟수: ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		bubbleSort(x, nx); // 배열 x를 버블 정렬합니다.
		
		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "] = " + x[i]);
	}
}
