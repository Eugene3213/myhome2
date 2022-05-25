
public class While1 {

	public static void main(String[] args) {
		int a = 1;						//while 시작값
		while(a < 11) {    				//		범위값
			//System.out.print(a+",");
			a++;						//		증가값 or 감소값
		}
		
		int b = 10;
		while(b >= 5) {
			//System.out.print(b+",");
			b--;
		}
		
		/*Q. 다음 사항을 while문으로 작성하시오.
		 	22~16 숫자를 출력하시오	 */
		int c =22;
		while(c >=16) {
			//System.out.print(c+",");
			c--;
		}
		
		int aa = 1;						//초기값
		int bb = 10;					//종료값
		while(aa <= bb) {				//반복문 범위
			//System.out.printf("%d ",aa);
			aa++;
		}
		
		/*Q. 변수 두개를 이용하여 범위에 맞게 값을 출력하시오. 
		  	99~47 출력	 */
		
		int cc= 99;
		int dd= 47;
		while(cc>=dd) {
			System.out.printf("%d ",cc);
			cc--;
		}
		
		
		
		
		
		
		
		
	}

}
