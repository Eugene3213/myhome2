import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {

		/*Q. 사용자가 해당 값을 입력합니다.
		단, 사용자가 두개의 숫자를 입력하되 첫번쨰 숫자오 ㅏ두번째 숫자 범위 안에 있는 모든 숫자를 더해서 결과값이 나오도록 제작하시오.
		단, 해당 코드는 do while문으로 작성.
		ex) 첫번째 범위 숫자는? 5
		두번째 범위 숫자는? 10
		범위 숫자 모든 합계는 45입니다. */
		
		
		/*Scanner sc =new Scanner(System.in);
			System.out.println("숫자를 입력하시오");
		int a= sc.nextInt();   //a=첫번째 숫자
		
		
		Scanner sc1=new Scanner(System.in);
			System.out.println("숫자를 입력하시오");
		int b=sc.nextInt();   //b=두번째 숫자

		int total=0;   //더한값
		
		do {
			
			total=total*(a+b);
			if(a==5) {
				sysout
			}
			
			
			
			a++;
		}while(a<b);  */
		
		Scanner sc = new Scanner(System.in);
			System.out.println("첫번째 범위 숫자는?");
		int a= sc.nextInt();
			System.out.println("두번째 범위 숫자는?");
		int b= sc.nextInt();
		
		int total=0;
		
		
		do {
			total=total+a;
			a++;
		}while(a<=b);
		
		System.out.printf("범위 숫자 모든 합계는 : %d",total);
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
