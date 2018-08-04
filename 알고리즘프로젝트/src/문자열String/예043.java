package 문자열String;

public class 예043 {

	public static void main(String[] args) {
		String str = "aBCd EFgH";
		System.out.println(str.startsWith("A")); //A로시작하는지 true false 확인
		System.out.println(str.length());
		System.out.println(str.replace("BC", "KK"));
		System.out.println(str.toLowerCase()); //소문자로 바꾸기
		System.out.println(str.toUpperCase()); //대문자
		System.out.println(str.concat("34"));
		
	}

}
