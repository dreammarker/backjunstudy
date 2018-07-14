package 알고리즘프로젝트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 평균점수10039 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
		for(int i=0;i<5;i++) {
		int n1=Integer.parseInt(br.readLine());
		if(n1%5==0) {
			if(n1<40) {
				n1=40;
			}
			sum+=n1;
		}
		}
		System.out.println(sum/5);
	}
}
