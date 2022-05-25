import java.util.Scanner;

public class Loop_Scan2 {

	public static void main(String[] args) {
		/*Scanner와 함께 while문으로 사용자가 입력하는 값으로 구구단 결과값 출력하시오.	 */
	
		
		Scanner sc=new Scanner(System.in);
			System.out.print("원하는 구구단을 입력하시오");
		int gugu=sc.nextInt();
		int w=1;
		int aws;
		
		while(w < 10) {
			aws = gugu * w;
			System.out.printf("%d ",aws);
			w++;
			
		}
		sc.close();
	}
}
