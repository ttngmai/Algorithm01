package q06;

import java.util.Scanner;

// 216p Q6

public class Main {
	// a[idx1]와 a[idx2]의 값을 바꿉니다.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2]	= t;
	}
	
	// 단순 선택 정렬
	static void selectSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int min = i;		// 아직 정렬되지 않은 부분에서 가장 작은 요소의 인덱스를 기록합니다.
			for (int j = i + 1; j < n; j++)
				if (a[j] < a[min])
					min = j;
			
			for (int k = 0; k < n; k++) {
				if(k == i) 
					System.out.printf("%2c", '*');
				else if(k == min) 
					System.out.printf("%2c", '+');
				else
					System.out.printf("%2c", ' ');
			}
			System.out.println();
			
			for (int m = 0; m < n; m++)
				System.out.printf("%2d", a[m]);
			System.out.println();
			
			swap(a, i, min);	// 아직 정렬되지 않은 부분의 첫 요소와 가장 작은 요소를 교환합니다.
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("단순 선택 정렬");
		System.out.print("요솟수: ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		selectSort(x, nx); // 배열 x를 단순 선택 정렬합니다.
		
		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "] = " + x[i]);
	}
}
