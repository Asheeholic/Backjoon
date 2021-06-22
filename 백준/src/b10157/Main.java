package b10157;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	private static int dx[] = {1,0,-1,0};
	private static int dy[] = {0,1,0,-1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken()) + 1;
		int K = Integer.parseInt(br.readLine());
		
		int direct = -1;
		int count = 0;
		int x = 0; // x축 움직임은 처음엔 0
		int y = 1; // 시작은 1이니깐.
		int check = 1;
		while (check > 0) {
			
			direct = (direct + 1) % 4;
			
			if (direct % 2 == 0) {
				R--;
			} else {
				C--;
			}
			
			if ( direct % 2 == 0 ) {
				check = R;
			} else {
				check = C;
			}
			
			for (int i=0; i<check; i++) {
				count++;
				x += dx[direct];
				y += dy[direct];
				if(count == K) {
					System.out.println(y + " " + x);
					return;
				}
			}
			
		}
		bw.write("0");
		bw.flush();
	}

	
}
