package b1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	
	static String[] arrayForAnswer;
	static int[][] arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][2];
		
		for (int i=0; i<n ; i++) {
			arrayForAnswer = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(arrayForAnswer[0]);
			arr[i][1] = Integer.parseInt(arrayForAnswer[1]);
		}
		// 끝나는 시간을 기준으로 정렬하기 위해 compare 재정의 
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			// compare은 마이너스 일경우 앞의 파라미터가,
			// 같거나 플러스일경우 뒤의 파라미터가 나온다.
			public int compare(int[] o1, int[] o2) {
				
				// 종료시간이 같을 경우 시작시간이 빠른순으로 정렬  
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				
				return o1[1] - o2[1];
			}
			
		});
		
		int count = 0;
		int endTime = 0;
		
		for(int i = 0; i<n; i++) {
			if (endTime <= arr[i][0]) {
				endTime = arr[i][1];
				count++;
			}
		}
		
		System.out.println(count);
		
	}
// 답은 같은데.. 왜 정답이 안되지..?
}
