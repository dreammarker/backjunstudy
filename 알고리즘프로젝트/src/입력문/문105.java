package 입력문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문105 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문장을 입력하세요");
		String num[]=br.readLine().trim().split(" ");
		System.out.println("해당 문장의 단어 수는 "+num.length+" 개입니다.");
	}

}
