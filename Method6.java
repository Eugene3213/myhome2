import java.util.Arrays;

public class Method6 {

	public static void main(String[] args) {
		/*HW.
		 관리자에서 메뉴를 활성화하는 프로세서입니다. 해당 메뉴 활성화는 2차 배열이며, 메뉴명, 활성화하는 (Y,N)으로 구분.
		 해당값을 대입하여 "Y"로 적용되는 인덱스 번호에 맞는 메뉴명을 1차 배열로 재구성 후 메인에서 출력 되도록 합니다.
		 결과 : [로켓배송,로켓프레시,골드박스,이벤트,추석]		 
		 단, private 및 return을 활용하여 프로그램을 작성합니다.
		 */
		menus mn=new menus();
		String yn =mn.sub();
		String mn2[]= yn.split(",");
			System.out.println(Arrays.toString(mn2));
	}

}
class menus{
	private String arrays[][];
	
	
	public menus() {
		String ms[][]= {
				{"로켓배송","로켓프레시","쿠팡비즈","골드박스","이벤트","설날","추석"},
				{"Y","Y","N","Y","Y","N","Y"}
		};
		this.arrays=ms;
	}
	public String sub() {
		
		int w=0;
		int e=this.arrays[0].length;
		String result[] =new String[5];
		String yn;
		
		while(w<e) {
			if(this.arrays[1][w].equals("Y")) {
				
				yn=this.arrays[0][w];
			}
		
			w++;
		}
		return 
	}










}

