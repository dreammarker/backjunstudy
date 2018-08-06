package 비트연산자;

public class 예061 {

	public static void main(String[] args) {
		int a =153;
		int oct = 012;
		int hex = 0x1a4;
		
		String a_Bi = Integer.toBinaryString(a);
		String a_Oct = Integer.toOctalString(a);
		String a_Hex = Integer.toHexString(a);
		
		int a1 = Integer.parseInt(a_Bi,2);
		int a2 = Integer.parseInt(a_Oct,8);
		int a3 = Integer.parseInt(a_Hex,16);
		
		System.out.printf("%d %d %d %s %s %s \n",a,oct,hex,a_Bi,a_Oct,a_Hex);
		System.out.printf("%d %d %d",a1,a2,a3);
	}

}
