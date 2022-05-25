import java.util.Scanner;


public class Scan4 {

	public static void main(String[] args) {
		/* 1. */
		Scanner a = new Scanner(System.in);
		System.out.println("입력할 내용을 적어주세요");
		
		//String b = a.next();					//next() :  스페이스바 입력까지만 적용
		String b = a.nextLine();				//nextLine() : 스페이바 포함 모두 입력적용
		System.out.println(b);
		
		a.close();						//a.close : Scanner 종료 함수 > 기본적으로 종료 해줘야 
		
		/* 2. */
		//문자 park 숫자 25
		String mid = "park";			//String = %s
		int age = 25;					//int,byte,long,short (숫자) = %d
										//float,double = %f
										//date, time = %t
										//boolean = %b
		
		//=System.out.println(a1 + "님의 나이는" + b1 + "입니다");
		System.out.printf("%s님의 나이는 %d 입니다" , mid , age);				//printf(ormat)
		
		
	}

}
