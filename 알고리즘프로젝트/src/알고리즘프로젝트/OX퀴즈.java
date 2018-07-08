package 알고리즘프로젝트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX퀴즈 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		int count=0;
		int sum=0;
		for(int j=0;j<a;j++) {
			String OX[]=br.readLine().split("");
			for(int i=0;i<OX.length;i++) {
			if(OX[i].equals("X")) {
				count=0;
			}
			if(OX[i].equals("O")) {
				count++;
				sum+=count;
			}
		}
		System.out.println(sum);
		sum=0;
		count=0;
		}
		}
}
