import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {

		/* Q.
		 * A학생에 대한 성적을 입력 받고 평균점수가 나오는 프로그램을 제작합니다.
		 * "점수를 입력하세요?" 라는 문구는 총 5번(횟수)이 나오게 되며, 모든 점수는 합산(합계)하여 출력합니다. do while 작성		 */
		// 합산 한 후 5개의 점수에 대한 평균값을 출력하시오.  "출력 점수는 해당 점수의 평점은:  "
		// 단, 해당 점수가 40점 이하일 경우 "재시험 입니다." 메세지를 출력 후 프로세서는 종료합니다. 40점 이상일 경우 "합격"이라고 메세지를 출력하십시오.
		
		// 추가기획
		//입력하실 과목 수를 적어주세요 라고 제일 먼저 출력 후 해당과목수 만큼 반복문이 적용이 되며 과목수 만큼 평균값이 적용되어야 합니다.
		
		
		/*내꺼 Scanner sc=new Scanner(System.in);
	
		System.out.println("입력하실 과목 수를 적어주세요.");
		
		
				int total=0;			//합계
				int num=1;				//횟수
				
				int co ;                // 평균점수
				int b = sc.nextInt();   // 입력 과목 수 
				
				
				
				do {
					System.out.println("점수를 입력하세요?");
					int a=sc.nextInt();
					total=(total+a);
														
					num++;
					
				}while(num<=b);
		
				// System.out.println("합계: "+ total);
		  
		co = total / b;
		
		if(co < 40) {
			System.out.println("해당 점수의 평점은 "+co+"입니다.");
			System.out.println("재시험 입니다.");
		}
		else {
			System.out.println("해당 점수의 평점은 "+co+"입니다.");
			System.out.println("합격 입니다.");
		}
		
		
		
		sc.close(); */
		
		
		Scanner sc =new Scanner(System.in);
		
			int w =1;
			int user;
			int total=0;
			
			while(w<=5) {
				System.out.println("점수를 입력해 주세요: ");
				user =sc.nextInt();
				total = total +user;
				
				w++;
			}
			double avg = total /5;
			
				
				//System.out.println("최종 평균 점수는" + avg);
			String msg;
			if(avg<40) {
				msg="재시험입니다.";
				
			}
			else {
				msg="합격입니다.";
			}
			System.out.println("최종 평균 점수는: " + avg + "점 이며," + msg);
		
		sc.close();
		
		
	}

}
