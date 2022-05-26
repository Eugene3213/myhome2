
public class If_dowhile1 {

	public static void main(String[] args) {

		/*Q. 구구단 6단 중에서 35이상 결과 숫자만 출력하시오. */
		
		int a=1;
		int b=6;
		int c;
		
			do {
				c=b*a;
				if(c>35) {
					//System.out.println(" " + c);
				}
				a++;
			} while (a<=9);

		/*Q. 14~27까지 숫자 중 짝수값만 모두 더하여 최종 결과값을 출력하시오. */
			
		int aa=14;
		int bb=0;
		
			do {
				
				if(aa%2==0) {
					bb=bb+aa;
				}
				
				aa++;
			} while(aa<=27);
		
			System.out.println(" " + bb);
			
			
			
			
			
			
			

	}

}
