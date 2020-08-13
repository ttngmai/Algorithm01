package q03;

import java.util.Scanner;

// 117p Q3

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] idx = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		System.out.println(searchIdx(a, n, key, idx));
		
		sc.close();
	} // end main()
	
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int t = 0;
		
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				idx[t] = i;
				t++;
			}
		}
		
		return t;
	} // end searchIdx()
} // end Main
