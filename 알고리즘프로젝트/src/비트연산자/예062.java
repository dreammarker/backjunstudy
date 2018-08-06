package 비트연산자;

public class 예062 {

	public static void main(String[] args) {
		int a = 181; int b= 217;
		int op_and = a&b;
		int op_or = a|b;
		int op_xor = a^b;
		int op_not = -a;
		
		System.out.printf("%d %d %d %d \n",op_and,op_or,op_xor,op_not);
	}

}
