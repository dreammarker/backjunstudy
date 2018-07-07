package 알고리즘프로젝트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 폰노이만과파리14924 {
	public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			String STD= br.readLine();
	StringTokenizer st = new StringTokenizer(STD," ") ;
		int S= Integer.parseInt(st.nextToken()); // 기차의 속력
		int T= Integer.parseInt(st.nextToken()); //파리속도
		int D= Integer.parseInt(st.nextToken()); //거리
		if(S<=10000||S>=1||T<=10000||T>=1||D<=10000||D>=1&&T>S&&D%(2*S)==0) {
			System.out.println((D*T)/(2*S)); //두기차가만날떄까지 파리의 이동거리
		}
	
	}
}
