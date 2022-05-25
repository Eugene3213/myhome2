import java.util.Scanner;

public class Scan2 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
			System.out.println("아이디를 입력하세요?");
			String mid = a.next();
			//System.out.println(mid);
			
			if(mid.equals("kim")) //문자열 형태는 scanner이용시 equals라는 함수 사용
				System.out.println("회원이 확인 되었습니다");
			
			else
				System.out.println("확인되지 않습니다");
			
a.close();
	}

}
