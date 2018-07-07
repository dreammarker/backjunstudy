package 알고리즘프로젝트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 헤라클래스와히드라10205 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int number= Integer.parseInt(br.readLine());
		
		for(int i=0;i<number;i++) {
			int num=Integer.parseInt(br.readLine());
			String a=br.readLine().trim();
			String b[]=a.split("");
			for(int j=0;j<b.length;j++) {
				if(num==0) {
					break;
				}
				if(b[j].equals("c")) {
					num+=1;
				}
				else if(b[j].equals("b")) {
					num-=1;
				}
			
			}
			System.out.println("Data Set "+(i+1)+":");
			System.out.println(num);
			System.err.println();
		}
	}
}
