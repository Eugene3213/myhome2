import java.net.InetAddress;
import java.net.UnknownHostException;
/* Server(접속공간) + Cilent(접속자)
 * P2P
 * 온라인 채팅 : Cilent ---> Server 접속
 * 1:1 채팅 P2P
 * 
 * IP : 네트워크 주소
  -IPv4 : 0~225까지 정수 4파트 0.0.0.0 -> abc.co.kr(DNS)
  -IPv6 : 128bit 단위로 설정 0:0:0:0:0:0:0:0			 */
public class net1 {
//UnknownHostException : HOST 정보가 확인 되지 않을 경우
	public static void main(String[] args) throws UnknownHostException{
		//InetAddress: IPnetworkAddress
		//getByName  ;접속 될 도메인 주소
		InetAddress ia = InetAddress.getByName("localhost");
			System.out.println(ia);
//			System.out.println(ia.getHostName());		//도메인명
//			System.out.println(ia.getHostAddress());	//DNS에 연결된 IP

		//getAllByName : 도메인에 IP정보 확인 (배열로 구성해야 합니다)
		InetAddress ia2[] =InetAddress.getAllByName("naver.com");
//			System.out.println(ia2[0].getHostAddress());
//			System.out.println(ia2[1].getHostAddress());
			System.out.println(ia2.length);		//해당 DNS에 IP개수
		int w=0;
		while(w<ia2.length) {
			System.out.println(ia2[w].getHostAddress());
			w++;
		}
	}

}