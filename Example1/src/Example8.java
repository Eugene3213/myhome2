import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {

		/*Q. 사용자 패스워드는 a1234 입니다.
		 * 사용자가 패스워드를 입력합니다. 단, 3회 이상 실패시 다음과 같이 출력 되도록 합니다/
		 * "패스워드 횟수 제한으로 가까운 지점에 방문하셔야 합니다."
		 * 단, 패스워드가 맞을 경우 "로그인 되었습니다." 라고 출력 되어야 합니다.		 */

		
		//break;       반복문을 강제 종료 할떄 사용
	
		/*
		Scanner sc =new Scanner(System.in);
			System.out.println("패스워드를 입력하시오");
				String pass =sc.next();
			 
			int number=1;
			
			while(number>=1) {
				
				if(pass.equals("a1234")) {
					System.out.println("로그인 되었습니다.");
					break;
				}
				else if(number>=3){
					System.out.println("패스워드 횟수 제한으로 가까운 지점에 방문하셔야 합니다.");
					break;
				
				}
					
					number++;
			}
		*/
			
		
		final String pw="a1234";
		int c =3;
		Scanner sc=new Scanner(System.in);
		int w=1;
		while(w <4) {
			System.out.println("패스워드를 입력해 주세요: ");
			
			String userpw =sc.next();
			
				if(pw.equals(userpw)) {
					System.out.println("로그인 되었습니다.");
					break;
				}
				
				else {
					
				}
				System.out.println("패스워드 횟수 제한으로 가까운 지점에 방문하셔야 합니다.");
				w++;
		}
		
		
		
		
		
		
		
		
		
		
	}

}
