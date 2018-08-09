package 입력문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문103 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("년도를 입력하세요");
		String birth=br.readLine();
		System.out.println(birth+"년 지수의 나이는"+(Integer.parseInt(birth)-2017+20)+"세입니다.");
	}

}
