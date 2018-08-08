package 입력문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문099 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("두 수를 입력하세요 : ");
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum=0;
		while(st.hasMoreTokens()) {
			sum+=Integer.parseInt(st.nextToken());
		}
		System.out.println("입력한 두 수의 합은 "+sum);
	}

}
