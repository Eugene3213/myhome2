import java.util.Scanner;

public class Scan1 {

	public static void main(String[] args) {
	
		Scanner b = new Scanner(System.in);
		System.out.print("Q : 당신의 나이는?");

		int c = b.nextInt();
		
		System.out.println("해당 나이는" + c + "입니다");
		
		
		Scanner d = new Scanner(System.in);
		System.out.println("Q : 입력하실 금액을 적어주세요");
		
		int e = d.nextInt();
		
		if(e < 1000)
			System.out.println("1000원 이상 금액을 입력하시오");
		else
			System.out.println("입금이 진행됩니다");
	
		b.close();
		d.close();
	}
}

/* Scanner 주의사항
scanner을 import 사용
문구출력 (사용자가 어떤 값을 입력하는지에 대한 문구)
해당 사용자가 입력한 값을 받는 변수를 지정*/
