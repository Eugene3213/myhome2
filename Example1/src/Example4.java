
public class Example4 {

	public static void main(String[] args) {

		/*Q. 다음 결과값에 맞춰서 코드가 출력 되도록 하시오. 해당 코드는 for문으로 작성합니다.
		 * 45 35 25 15 10
		 */
		
		
		//1.
		int a;
		
		for(a=45;a>=10;a--) {
			
			if(a==45 || a==35 || a==25 || a==15 || a==10) {
				//System.out.println(" " +a);
			}
		}
		
		//2.
		int f;
		int v;
		
		for(f=9;f>0;f--) {
			
			v=5*f;
			
			if(f % 2 == 1 && f!=1 || f==2) {
				System.out.println(v+" ");
			}
		}
		
		
		
		
		
		
		
	}
	
}
