package b1978;

import java.util.Scanner;

public class Main {
	
	public static boolean pn(int m) {
		if (m < 2) {
			return false;
		} else {
			for (int i=2; i<m; i++) {
				if(m % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i=0; i<n; i++) {
			int m = sc.nextInt();
			if (pn(m)) {
				count += 1;
			}
		}
		System.out.println(count);
	}

}
