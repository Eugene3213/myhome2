
public class If3 {

	public static void main(String[] args) {
		
		boolean ck = true; //boolean : true, false로 구분. 둘 중에 하나 선택 (ex체크박스)
		
		if(ck== true)
			System.out.println("회원가입이 진행 됩니다");
		else
			System.out.println("이용약관에 동의하셔야만 진행 됩니다");
		
		
		
		//ex1) a1234 park사용자
		
		String a = "park";
		String b = "a1234";
		
		if(a=="park" && b=="a1234")		//&& : 한가지 조건 이상 모두 맞을 경우 (and)
			System.out.println("로그인 하셨습니다");
		else
			System.out.println("아이디 및 패스워드를 확인하세요");

		
		if(a=="park" || a=="lee")		//|| : 한가지 조건 이상에서 한개라도 맞을 경우 (or)
		//if(a=="park" || b=="a1234") //두 조건중에 한가지라도 맞을 경우
			System.out.println("회원이 확인되었습니다");
		else
			System.out.println("확인된 아이디가 없습니다");
		
		
		
	
		
		

	}

}
