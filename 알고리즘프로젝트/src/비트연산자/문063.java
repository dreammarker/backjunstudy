package 비트연산자;

public class 문063 {

	public static void main(String[] args) {
		int a=19;
		
		String a_Bi = Integer.toBinaryString(a);
		String a_Oct = Integer.toOctalString(34);
		String a_Hex = Integer.toHexString(94);
		
		int a1 = Integer.parseInt(a_Bi,2); //2진법->10진법
		int a2 = Integer.parseInt(a_Oct,8); //8진법->10진법
		int a3 = Integer.parseInt(a_Hex,16); //16진법->10진법
		
		System.out.println(a_Bi);
		System.out.println(a_Oct);
		System.out.println(a_Hex);
		System.out.println(Integer.toHexString(288));
		System.out.println("AC");
		
	}

}
