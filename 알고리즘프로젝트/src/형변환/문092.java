package 형변환;

public class 문092 {

	public static void main(String[] args) {
		int i_1 = 289;
		String str_i = Integer.toString(i_1);
		int i_2 = Integer.parseInt(str_i);
		System.out.printf("%d %d %s \n",i_1,i_2,str_i);
		
		double d_1=35.632;
		String str_d=Double.toString(d_1);
		double d_2 = Double.valueOf(str_d);
		System.out.printf("%.3f %.4f %s",d_1,d_2,str_d);
	}

}
