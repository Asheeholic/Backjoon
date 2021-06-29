package b1934;

import java.util.Scanner;

public class Main {

	public static void lcm(int m, int o) {
		int i = m;
		int j = o;
		while(true) {
			if(m <= o) {
				while(true) {
					if(m >= o) {
						break;
					}
					m = m + i;
				}
			}
			if(m >= o) {
				while(true) {
					if(m <= o) {
						break;
					}
					o = o + j;
				}
			}
			if(m == o) {
				System.out.println(m);
				break;
			}
		}
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int m = sc.nextInt();
			int o = sc.nextInt();
			lcm(m, o);
		}
	}

}
