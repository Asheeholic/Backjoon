package b17298;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] a = new int[n];
		int[] ans = new int[n];
		String[] temp = bf.readLine().split(" ");
		for (int i=0; i<n; i++) {
			a[i] = Integer.parseInt(temp[i]);
		}
		
		Stack<Integer> s = new Stack<>();
		s.push(0);
		
		for (int i=1; i<n; i++) {
			if(s.isEmpty()) {
				s.push(i);
			}
			while (!s.isEmpty() && a[s.peek()] < a[i]) {
				ans[s.pop()] = a[i];
			}
			s.push(i);
		}
		while (!s.empty()) {
			ans[s.pop()] = -1;
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i=0; i<n; i++) {
			bw.write(ans[i] + " ");
		}
		bw.write("\n");
		bw.flush();
	}
}
