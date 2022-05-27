
public class Example5 {

	public static void main(String[] args) {

		/*Q. 다음 코드를 보고 while 문으로 변환하시오.
		 * 
		 * int sum=0;
		 * int i;
		 * 	for(i=1;i<=12;i++){
				if(i%2 == 0){
					sum=i+sum;
				}
			}
			sysout("1부터 12까지의 짝수의 합 = "  + sum);
		 */

		int sum=0;
		int i=1;
		
			while(i<=12){
				
				if(i%2==0) {
					sum=sum+i;
				}
				
				i++;
			}
		System.out.println("1부터 12까지의 짝수의 합 = "  + sum);
		
		
		
		
	}

}
