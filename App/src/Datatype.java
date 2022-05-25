
public class Datatype {

	public static void main(String[] args) {
		
		//문자형
		String a = "1234"; //string : 문자로 인식 > 무조건 "" 사용
		System.out.println(a);
		
		
		
		//정수형
		byte b = 127;   //byte : -128 ~ 127 까지의 범위를 가짐
		System.out.println(b);
		
		short c = 30000;   //short : -32,768 ~ 32,767 까지의 범위를 가짐
		System.out.println(c);
		
		int d = 1000000000;   //int : -2,147,483,648 ~ 2,147,483,647 까지의 범위를 가짐
		System.out.println(d);
		
		long e = 999999;    //long : 9,000,000... 기본메모리 할당량에 따라 사용 범위 늘어남  > L 사용
		System.out.println(e);
		
		
		
		//실수형
		float z = 3.5f;   //float : 3.40248000000+38 (f 무조건 사용)
		System.out.println(z);
		
		double x = 44.5d;  //double : 1.784+308  (d 선택사항)
		System.out.println(x);
		
	}

}
