import java.util.Scanner;

public class Loop_Scan3 {

	public static void main(String[] args) {
		
		/* Scanner과 함께 do while문으로 사용자가 입력하는 값으로 구구단 결과가 출력되는 프로그램을 제작하시오. */
		
		Scanner sc = new Scanner(System.in);
			System.out.println("원하는 구구단을 입력하시오");
		int gugu = sc.nextInt();
		int w=1;
		int aws;
		
			do {
				aws=w*gugu;
				System.out.print(aws + " ");
				w++;
			}while(w<=9);
		
		
			sc.close();
	}

}
