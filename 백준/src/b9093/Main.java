package b9093;

import java.io.*;
import java.util.Stack;
/**
 * 
 * @author hanjaeho
 *	
 * 스택타입을 캐릭터로 하는 방법을 생각 했어야함.
 */
public class Main{
    static Stack<Character> stack = new Stack<>();
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int n = Integer.parseInt(br.readLine());
        
        for (int i=0; i<n; i++) {
        	String[] sen = br.readLine().split(" ");
        	for(String s : sen) {
        		for(int j=0; j<s.length(); j++) {
        			stack.push(s.charAt(j));
        		}
        		for(int j=0; j<s.length(); j++) {
        			bw.write(stack.pop());        			
        		}
        		bw.write(" ");
        		stack.clear();
        	}
        	bw.write("\n");
        }
        bw.flush();
    }
}