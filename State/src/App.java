
public class App {

	public static void main(String[] args) {
		/*합산 계산공식 중 작은 값을 출력하시오
			1. 25+31*4+12 
			2. 15*3+9+14 */
			
		int a = 25+31*4+12;
		int b = 15*3+9+14;
		//System.out.println(a,b입력); 값 추출
		
		if(a > b)
			System.out.println("공식 2번 값이 작습니다");
			else if (a < b)
				System.out.println("공식 1번 값이 작습니다");
		else
			System.out.println("두 값이 같습니다");
		
		
		
		/* 해당값을 2진수로 짝수, 홀수로 확인하기 */
		
		int a1 = 11%2;			// %기호로 사용시 0 또는 1로 나머지 값이 출력이 됩니다.
								// System.out.println(a1);
		
		if(a1==0)
			System.out.println("짝수 입니다");
		else
			System.out.println("홀수 입니다");
		

	}

}
