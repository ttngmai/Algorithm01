package q04;

import java.util.Scanner;

// 208p Q4

public class Main {
	// a[idx1]와 a[idx2]의 값을 바꿉니다.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// 버블 정렬
	static void bubbleSort(int[] a, int n) {
		int compareCnt = 0;
		int swapCnt = 0;
		int cnt = 0;
		int k = 0;
		
		while (k < n - 1) {
			int last = n - 1;
			
			cnt++;
			System.out.println("패스" + cnt + ":");
			for (int j = n - 1; j > k; j--) {
				for (int m = 0; m < n - 1; m++)
					System.out.printf("%3d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
				System.out.printf("%3d\n", a[n - 1]);
				
				compareCnt++;
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					swapCnt++;
					last = j;
				}				
			}
			
			for (int m = 0; m < n; m++)
				System.out.printf("%3d  ", a[m]);
			System.out.println();
			
			k = last;
		}
		System.out.println("비교를" + compareCnt + "회 했습니다.");
		System.out.println("교환을" + swapCnt + "회 했습니다.");
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("버블 정렬(버전3)");
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
