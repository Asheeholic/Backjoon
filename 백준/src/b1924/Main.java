package b1924;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = sc.nextLine().split(" ");
		int mon = Integer.parseInt(a[0]);
		int day = Integer.parseInt(a[1]);
		sc.close();
		
		LocalDate targetDate = LocalDate.of(2007, mon, day);
		//System.out.println(targetDate.getDayOfWeek());
		String dow = String.valueOf(targetDate.getDayOfWeek()).substring(0,3);
		// 어떠한 경우에도 문자열로 바꿔줌. 되게 많이 쓰일듯.
		System.out.println(dow);
	}
}
