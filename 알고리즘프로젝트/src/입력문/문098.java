package 입력문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문098 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이름을 입력하세요.");
		String name = br.readLine();
		System.out.print("키를 입력하세요.");
		float tall = Float.parseFloat(br.readLine());
		System.out.print("몸무게를 입력하세요.");
		String weight = br.readLine();
		
		System.out.println(name+"의 키는 "+tall+"cm, 몸무게는 "+weight+" kg");
		
	}

}
