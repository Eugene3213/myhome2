
public class For_Plus {

	public static void main(String[] args) {
			
		/*1~10 모든 숫자를 합한 결과값을 출력하시오*/
		
		int f;
		int total=0;
		
		for(f=1;f<=10;f++) {				//total변수값에 반복값을 지속적으로 증가시킴
			//total = total +f;
			total+=f;
		}
			System.out.println("총합계:"+total);
	
			// b = b - f;   ---->  b -= f;
			//+=(더하기할당), -=(빼기할당) , *=(곱하기할당), /=(나누기할당)
			
			
		/* Q. 전체값은 500이 있습니다. 총 8회 동안 반복되면서 한번 반복할때마다 12씩 감소하도록 하여 최종값을 출력. */
			
		int alls = 500;
		int m =12;
		int w;
		
		for(w=0;w<=8;w++) {
			alls=alls-m;
		}		
		System.out.println(alls);
	
		/* Q. 구구단 2단 2*1 ~ 2*9까지의 총 합계를 출력하시오. 정답;90 */
	
	
	
	
	
	}	

}
