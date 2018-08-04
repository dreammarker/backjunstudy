package 알고리즘프로젝트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 상수2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> number = new ArrayList<>();
		while (st.hasMoreTokens()) {
			number.add(Integer.parseInt(reverseString(st.nextToken())));
		}
		if(number.get(0)>number.get(1))
			System.out.println(number.get(0));
		else
			System.out.println(number.get(1));
	}
	public static String reverseString(String s) {
	    return ( new StringBuffer(s) ).reverse().toString();
	  }
}
