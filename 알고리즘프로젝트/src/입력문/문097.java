package 입력문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문097 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이름을 입력하세요 ");
		String name=br.readLine();
		System.out.println("나이를 입력하세요 ");
		int age = Integer.parseInt(br.readLine());
		System.out.println("당신의 이름은 "+name+", 나이는 "+age);
	}

}
