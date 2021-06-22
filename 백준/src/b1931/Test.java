package b1931;

import java.util.Arrays;
import java.util.Comparator;

public class Test {

	public static void main(String[] args) {
		String[] stringArr = new String[] {"A","C","B","E","D"};

		Arrays.sort(stringArr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o2.compareTo(o1);
			}});
		
		for (String i : stringArr) {
			System.out.println(i);
		}
	}

}
