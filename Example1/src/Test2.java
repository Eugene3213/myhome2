import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
	
		/*Q. 고객이 자신의 통장에서 입,출금을 하는 프로세서를 제작해야 합니다.
		 * 고객의 기본 자산금액 : 100000
		 * 
		 * "1번 입력시 입금, 2번 입력시 출금 입니다." 라는 메세지가 제일 먼저 실행 되어야 합니다.
		 * 1번을 입력시 "해당 금액을 입력하세요" 사용자가 입력한 금액+ 기본 자산금액을 합한 총 자산금액을 출력하시면 됩니다.
		 * 
		 * 2번을 입력시 "출금할 금액을 입력하세요" 사용자가 입력한 금액 =기본 자산금액을 계싼하여 총  자산금액을 출력하시면 됩니다.
		 */

		int money=100000; //자산금액
		
		Scanner sc = new Scanner(System.in);
			System.out.println("1번 입력시 입금, 2번 입력시 출금 입니다");
		int work= sc.nextInt();
		int total;
		
		Scanner cal =new Scanner(System.in);
	
			if(work==1) {
				System.out.println("해당 금액을 입력하세요");
				total = cal.nextInt();
				money =money + total;
			}
			
			else if(work==2) {
				System.out.println("출금 금액을 입력하세요: ");
				total = cal.nextInt();
				money =money - total;
			}
			
			else {
				System.out.println("정상적인 코드가 아닙니다.");
				sc.close();
			}
			
			System.out.println("처리된 내용은 다음과 같습니다" + money + "원");
			cal.close();
			sc.close();
		
		
		
		
		
		
		
	}

}
