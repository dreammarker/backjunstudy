package 입력문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문106 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문장1 : ");
		String a=br.readLine().trim();
		System.out.println("문장2 : ");
		String b=br.readLine().trim();
		System.out.println("길이의 합은 "+(a.length()+b.length())+" 입니다");
	}
}
