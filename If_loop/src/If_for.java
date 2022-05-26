
public class If_for {

	public static void main(String[] args) {
		final int a=1;			
		/*final을 사용시 변수 > 상수로 변경
		 * 상수: 절대 변하지 않는 수	 */
		final String name ="홍길동";
		
		//System.out.println(name);
		//System.out.println(a);
	
		
		final int ct =3;				//고정값
		int f;							//반복문
		boolean ok =false;				//조건에 대한 true,false;
		
		for(f=1;f<=10;f++) {
			
			if(f==ct) {		//반목문 값과 고정값이 같을 경우
				System.out.println("등록된 값이 확인 됩니다");
				ok =true;	//조건에 대한 값을 변경합니다
			}
			
		}
		if(ok==false) {		//만약에 반복문이 끝났는데도 반복문 안에 조건 사항이 없을 경우 출력되는 코드.
			System.out.println("확인이 되지 않는 숫자 입니다");
		}
		
		
		
		/* 총 20번의 값을 반복. 그 중 홀수값만 출력 */
		
		int ff;
		String odd="";				//odd:홀수 even:짝수
		for(ff=1;ff<=20;ff++) {
			
			if(ff % 2 != 1) {
				System.out.print(ff+" ");
			}
			else {						//만약에 홀수 값일 경우 odd 변수에 지속적으로 값을 추가
				odd+=ff + " ";			//추가 할 경우 " " 빈공간을 확용하여 적용
			}
		}
		System.out.println(odd);
		
	}

}
