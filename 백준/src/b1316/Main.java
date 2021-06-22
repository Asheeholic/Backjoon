package b1316;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = num;
		for (int i=0 ; i<num ; i++) {
			String word = sc.next();
			a : for (int j=0; j<word.length(); j++) {
				boolean result = false;
				char c1 = word.charAt(j);
				for (int k=j; k<word.length(); k++) {
					char c2 = word.charAt(k);
					if (c1 == c2) {
						if(result == true) {
							result = false;
							cnt--;
							break a; // 라벨 사용법 익혀봄.
						}
					} else if (c1 != c2){
						result = true;	
					} 
				}
			}
		}
		System.out.println(cnt);
	
	}
}
