package 비트연산자;

public class 문065 {

	public static void main(String[] args) {
		int a =31; int b= 19;
		System.out.printf("%s %s \n",Integer.toBinaryString(a&b),Integer.toOctalString(a|b));
		System.out.printf("%s %s \n",Integer.toBinaryString(a+b),Integer.toBinaryString(a-b));
	}

}
