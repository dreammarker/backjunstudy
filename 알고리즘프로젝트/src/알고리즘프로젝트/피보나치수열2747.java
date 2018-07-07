package 알고리즘프로젝트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수열2747 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//피보나치 수 0,1,1,2,3,5,8,13,21,34,55,89,144, 233, 377, 610, 987, 1597
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int a= Integer.parseInt(br.readLine());
		int n1=0;
		int n2=1;
		int n3=1;
		if(a>=1&&a<=45) {
		for(int i=0;i<a;i++) {
			if(a==1) {
				System.out.println("1"); //첫번쨰 수
			}
			else if(i!=0){
				
				n1=n2;
				n2=n3;
				n3=n1+n2;
				
				//0+1=1 ->1+1=2 2+1=3
				
			}
			
		}
		if(a!=1)
		System.out.println(n2);
		}
		if(a==0) {
			System.out.println("0");
		}
		
	}
}
