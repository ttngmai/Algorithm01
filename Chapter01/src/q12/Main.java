package q12;

// 38p Q12

public class Main {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i == 0)
				System.out.printf("%3s", "|");
			else
				System.out.printf("%3d", i);
		}
		
		System.out.println("\n--+----------------------------");
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 0; j < 10; j++) {
				if(j == 0)
					System.out.printf("%3s", i + "|");
				else {
					System.out.printf("%3d", i * j);
				}
			}
			System.out.println();
		}
	}
}
