package b1406;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	static Stack<Character> left = new Stack<>();
	static Stack<Character> right = new Stack<>();
	static Scanner sc = new Scanner(System.in);

	static void putIn(String s) {
		for (int i=0; i<s.length(); i++) {
			left.push(s.charAt(i));
		}
	}
	
	static void solve1(String x) {
		
//		커서를 왼쪽으로 한 칸 옮김
//		(커서가 문장의 맨 앞이면 무시됨)
		if (x.equals("L")) {
			if (left.isEmpty()) {
				return;
			}
			right.push(left.pop());
//		커서를 오른쪽으로 한 칸 옮김
//		(커서가 문장의 맨 뒤이면 무시됨)	
		} else if (x.equals("D")) {
			if (right.isEmpty()) {
				return;
			}
			left.push(right.pop());
		} else if (x.equals("B")) {
			if (left.isEmpty()) {
				return;
			}
			left.pop();
		} else if (x.equals("P")) {
			String y = sc.next();
			left.push(y.charAt(0));
		}
	}
	
	static void print() {
		StringBuilder sb = new StringBuilder();
		while (!left.isEmpty()) {
			right.push(left.pop());
		}
		while (!right.isEmpty()) {
			sb.append(right.pop());
		}
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		
		String s = sc.next();
		putIn(s);
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			String x = sc.next();
			solve1(x);
		}
		print();
	}

}
