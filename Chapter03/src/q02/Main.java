package q02;

import java.util.Scanner;

// 115p Q2

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] a = new int[num + 1];
		
		for(int i = 0; i < num; i++) {
		 System.out.print("a[" + i + "] : ");
		 a[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		a[num] = key;
		
		seqSearchSen(a, num, key);
		
		sc.close();
	} // end main()

	static int seqSearchSen(int[] a, int n, int key) { // 선형검색(보초법)을 사용했으나 보초에 해당하는 인덱스는 출력되지 않게 하였다.
		int idx = n;
		
		System.out.printf("%4s", "|");
		for(int i = 0; i < a.length - 1; i++)
			System.out.printf("%3d", i);
		System.out.println();
		System.out.println("---+--------------------");
		
		for(int i = 0; i < a.length; i++) {
			System.out.printf("%4s", "|");
			for(int j = 0; j < i; j++)
				System.out.printf("%3s", " ");
			System.out.printf("%3s\n", "*");
			
			System.out.printf("%3d|", i);
			for(int j = 0; j < a.length - 1; j++) {
				System.out.printf("%3d", a[j]);
			}
			System.out.println();
			
			if(a[i] == key) {
				idx = i;
				break;
			}
			
			System.out.printf("%4s\n", "|");
		} // end for
		
		if(idx != n) {
			System.out.println(key + "은(는) a[" + idx + "]에 있습니다.");
			return idx;
		} else {
			System.out.println("그 값의 요소가 없습니다.");
		}
		
		return -1;
	} // end seqSearchSen
} // end Main
