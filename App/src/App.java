
public class App {

	public static void main(String[] args) {
		
		//1.
		int a = 10;
		int b = 20;
		int c;   //사칙연산기호 : +,-,*,/
		c = a + b;
		System.out.println(c);

		c = a * b;
		System.out.println(c);
		
		c = b / a;
		System.out.println(c);
		
		//2.
		String a1 = "환영합니다";
		String b1 = "홍길동";
		String c1;
			c1=a1+b1; //문자 형태일때 +는 문자+문자열로 표현할 수 있음.
			
				System.out.println(c1);
				
/*3. 다음과 같이 출력되는 코드를 완성하시오.
 * 
 * 홍길동님 적립금은 50000 입니다
 * 단, 홍길동과 50000의 값은 지속적으로 변화할 수 있다. */
				
				
			String q = "홍길동";
			int w = 50000;
			
				System.out.println(q + "님 적립금은" + w + "입니다");
				
		
/*4. 아마존 사이트에서 상품을 구매 했습니다. 
 * 장바구니에 담은 상품 가격을 모두 더해서 총 결제 금액이 출력되도록 하시오. 단, $ 기호로 출력.
 * 
 * 8.25
 * 4.02
 * 3.71
 * 
 * 결과 값은 다음과 같이 출력하세요
 * 총 결제금액 $(     ) 입니다.
 */
				

				
				
				int k = 3;
				int j = 9;
				double aw = (double)k /j;  //연산형태의 자료형 또한 있는 코드
				System.out.println(aw);
				
		
	}

}
