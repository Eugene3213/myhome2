
public class For1 {

	public static void main(String[] args) {
		/*반복문 :데이터를 일괄적으로 입출력 할 수 있도록 하는 문법 */
		
		//int z = 1;
		//z++;  > +1 증가 : 출력 후 +1 증가 ex1,2,3,4
		//z--;  > -1 감소 : 출력 후 -1 감소
		//++z;  > +1 증가 : +1 증가 후 출력 ex2,3,4,5
		//--z;  > -1 감소 : -1 감소 후 출력
		//System.out.println(z);
		
		for(int a = 0; a< 100; a++) { //for(초기값;범위값;증가or감소)
			//System.out.println(a);
		}
		
		int b;
		for(b=5;b<=10;b++) {
			//System.out.println(b);
		}
		
		int c;
		for(c=10; c>3 ;c--) { //주의사항: c<3 0~음수까지 전부 찍혀버리는 상황이 발생함
			//System.out.println(c);
		}
		
		//Q, 20~27까지 출력
		short d;
		for(d=20; d<=27 ;d++) {
			//System.out.print(d);
		}
		
		//Q. 39~21까지 출력
		int e;
		for(e=39; e>=21 ; e--) {
			//System.out.print(e + ",");
		}
		//Q. 1~10까지 숫자 출력
		int aa;
		int bb=10;
		for(aa=1;aa<=bb;aa++) {
			//System.out.print(aa+",");
		}
		/*Q. 변수 두개를 이용하여 다음 데이터를 출력하시오.
		55~4까지 출력 */
		
		int cc;
		int dd=4;
		for(cc=55;cc>=dd;cc--) {
			System.out.print(cc+",");
		}
	}		
}

