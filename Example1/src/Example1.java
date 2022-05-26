import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		/* Q. while문으로 코드를 작성해야 하며, 프로세서는 다음과 같습니다.
		 * 사용자가 상품을 전체 선택하였습니다.
		 * "7000 결제하시겠습니까?" 라고 출력되며, 숫자 1이라고 입력하면 최종결제 금액에 추가 되어 집니다.
		 * 단, 2라고 입력시 최종결제 금액에 추가 되어지면 안됩니다. 
		 * 
		 * 총 질문 횟수는 네번 입니다.
		 * 마지막에 최종 결제 금액이 나오도록 코드를 작성하시오.*/
		
		
		/*Scanner sc = new Scanner(System.in);
		
		int a=1;
		
		int user;
		int total=0;
		
			while (a<=4) {
				System.out.println("7000원 결제하시겠습니까?");
			
				user=sc.nextInt();
				total=total+user;
				
				a++;
			}
			System.out.println("최종금액은:"); */

			
			Scanner sc = new Scanner(System.in);
			final int money = 7000;
			int a=1;
			
			int user;
			int total=0;
			
				while (a<=4) {
					System.out.println("7000원 결제하시겠습니까?");
					user=sc.nextInt();
				
					if(user==1) {
						total =total + money;
					}
					
					a++;					
				}	
				System.out.println("최종금액은:" + total);
			
				sc.close();
			
			
			
	}

}
