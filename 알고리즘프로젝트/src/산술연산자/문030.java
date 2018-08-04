package 산술연산자;

public class 문030 {

	public static void main(String[] args) {
		int a =1; int b=2; int c=3;
		a+=b++ + c;
		b+=++b + c;
		c+=c++ + ++c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
