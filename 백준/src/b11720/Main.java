package b11720;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int num1 = sc.nextInt();
		String num2 = sc.next();
		
		int[] nums = new int[num1];
		int sum = 0;
		for (int i = 0 ; i<num1 ; i++) {
			nums[i] = Integer.parseInt(num2.substring(i, i+1));
			sum += nums[i];
		}
		System.out.println(sum);
		//int result = 0;
	}

}
