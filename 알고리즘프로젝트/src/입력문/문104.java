package 입력문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문104 {

	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("네 수를 입력하세요");
			String num[]=br.readLine().trim().split(" ");
			float sum=0;
			for(int i=0;i<num.length;i++) {
				sum+=Integer.parseInt(num[i]);
			}
			float avg=sum/num.length;
			float awk=0;
			for(int i=0;i<num.length;i++) {
				awk+=((avg-Float.parseFloat(num[i]))*(avg-Float.parseFloat(num[i])))/4;
			}
			System.out.println("평균 : "+avg);
			System.out.println("분산 : "+awk);
	}

}
