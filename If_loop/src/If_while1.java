
public class If_while1 {

	public static void main(String[] args) {

		/* Q1. while문으로 10~30까지 숫자 중에서 홀수값만 출력하시오. */
		/* 전체 출력된 홀수값 중 20이상의 홀수값만 출력합니다. */
		int a=10;
		
			while(a<=30) {
				if(a%2 ==1 && a>=20) {
					//System.out.printf("%d ",a);
					
				}
				a++;
				
			}

		/* 카운터 값으로 갯수 파악하기
		 * 1~10까지 숫자 중에서 짝수값이 몇개 있는지 갯수를 출력하시오.	 */
			
		int ww =1;
		int count = 0;					//카운터 변수값
			
			while(ww <=10) {
				if(ww%2 == 0) {			//짝수일 경우
					count++;			//해당 조건이 맞을 경우 +1씩 증가함
				}
				
				ww++;
			}
			System.out.println("1~10까지 숫자중 짝수 갯수는 : " + count); //반복문 종료시 최종 카운터 값을 출력하게 됨.
		
			
	
			
			
			
			
			
	}
}
