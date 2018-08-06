package 비트연산자;

public class 문068 {

	public static void main(String[] args) {
		int a =82;
		int b =98;
		System.out.printf("%s %d \n",Integer.toBinaryString(a&b),a&b);
		System.out.printf("%s %d \n",Integer.toBinaryString(a^b),a^b);
		System.out.printf("%s %d \n",Integer.toBinaryString(a|b),a|b);
		System.out.printf("%s %d \n",Integer.toBinaryString(a+b>>2),a+b>>2);
		}

}
