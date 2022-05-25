import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {
		
		/* 1. */
		byte a = 10;
		
		if(a < 10) {
			System.out.println("입력한 값은 10이상 숫자를 입력하세요");
		}
			else if(a >= 10 || a <= 22) {								//조건문의 범위를 설정하여 적용함
				System.out.println("당첨입니다");
		}	
			else {
				System.out.println("범위 밖의 숫자 입니다");
		}
		
		
		/* 2. */
		//Q.1~45 숫자 하나를 입력하세요
		/*error사용 : 0입력 > 숫자입력이 잘못 되었습니다
					45보다 큰 숫자 입력 > 숫자는 1~45까지만 입력 가능합니다
					7,12,14 세가지 숫자가 입력될 시 당첨입니다. 출력. 그 외의 숫자시 다음기회에 참여하세요 출력 */
		Scanner a1 = new Scanner(System.in);
			System.out.println("Q.1~45 숫자 하나를 입력하세요");
		
		int b1 = a1.nextInt();
		
		if(b1 == 0) {												
			System.out.println("숫자 입력이 잘못 되었습니다");
		}
		else if(b1 > 45) {
			System.out.println("숫자는 1~45까지만 입력 가능합니다");
		}
		else if(b1 >=1 && b1 <=45) {
			
			if(b1 == 7 || b1 == 12 || b1 == 14){
				System.out.println("당첨입니다");
			}
			else {
				System.out.println("다음 기회에 참여하세요");
			}
			a1.close();
		}
	}
}
	/*
		if(b1 == 0) {
			System.out.println("숫자 입력이 잘못 되었습니다");
		}	
		else if(b1 > 45) {
				System.out.println("숫자는 1~45까지만 입력 가능합니다");
		}		
		else {
			if(b1 == 7 || b1 == 12 || b1 == 14)
						System.out.println("당첨입니다");
			else 
						System.out.println("다음 기회에 참여하세요");
			*/


