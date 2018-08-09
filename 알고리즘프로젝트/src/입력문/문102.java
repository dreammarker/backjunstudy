package 입력문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문102 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("first number? ");
		int num1=Integer.parseInt(br.readLine());
		System.out.print("second number? ");
		int num2=Integer.parseInt(br.readLine());
		System.out.print("third number? ");
		int num3=Integer.parseInt(br.readLine());
		System.out.println((num1+num2)==num3);
	}

}
