package 입력문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문101 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("first number? ");
		int num1=Integer.parseInt(br.readLine());
		System.out.print("second number? ");
		int num2=Integer.parseInt(br.readLine());
		System.out.println(num1>num2);
	}

}
