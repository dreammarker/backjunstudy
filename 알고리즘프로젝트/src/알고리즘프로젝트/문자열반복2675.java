package 알고리즘프로젝트;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 문자열반복2675 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a=Integer.parseInt(br.readLine());
		for(int i=0;i<a;i++) {
			String[] st=br.readLine().split(" ");
			String aa=st[1];
			for(int j=0;j<aa.length();j++) {
				for(int z=0;z<Integer.parseInt(st[0]);z++) {
					bw.write(aa.charAt(j));
				}
				
			}
			bw.write("\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
