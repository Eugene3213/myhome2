
public class If_for2 {

	public static void main(String[] args) {
		
		//1~100까지 숫자 중 80이상의 숫자만 출력
		int f;
		for(f=1;f<=100;f++) {
			
			if(f >=80) {
				//System.out.println(f+" ");
			}
		}

		//200~300까지 숫자 중 240이하의 숫자만 출력
		
		int ff;
		for(ff=200;ff<=300;ff++) {
			
			if(ff<=240) {
				//System.out.println(ff+" ");
			}
		}
		
		//
		final int a =2;
		int w;
		for(w=1;w<=10;w++) {
			
			if(w %a ==0) {
				//System.out.printf("%d ",w);
			}
		}
		
		final int aa=3;
		int bb;
		for(bb=1;bb<=10;bb++) {
			
			if(bb % aa ==0) {
				//System.out.printf("%d ",bb);
			}
		}
		
		//Q. 구구단 중 2단을 반복합니다. 단, 2단 결과값 중 10 이상 숫자만 출력합니다.
		
		final int g=2;
		int ww;
		int total;
		for(ww=2;ww<=9;ww++) {
			
			total=g*ww;
			if(total >= 10) {						//순서 중요
				//System.out.printf("%d ", total);
			}
		}
		
		/*Q. 다음 결과값을 보고 해당 값이 출력 되도록 코드를 제작하시오.
			18 36 54 72	*/
		
		int p;
		int total1;
		for(p=1;p<=9;p++) {
			total1 = 9*p;
	
			if(p%2 == 0) {
			//System.out.println(total1+ " ");
			}
		}
		
		/* Q. 다음 결과값을 보고 해당 값이 출력되도록 코드를 제작하시오.
		 * 1~20 사이의 숫자 입니다.
		 	6 14 17 19	 */
		
		int z;
		for(z=1;z<=20;z++) {
			
			if(z == 6 || z==14 || z==17 || z==19) {
				System.out.println(z+" ");
			}
		}
		
		
		
		
		
		
		
		
		
	}
}


