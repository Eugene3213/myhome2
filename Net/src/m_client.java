import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class m_client {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
			System.out.println("접속 할 아이디를 입력해주세요");
		String user =sc.nextLine();
		chatclient cc =new chatclient(user);
	}
}
class chatclient{
	static final String ip ="192.168.100.172";
	static final int port =9009;
	Socket sk= null;
	InputStream is =null;
	OutputStream os =null;
	String message =null;
	String result =null;
	
	public chatclient(String mid) {
		try {
			System.out.println(mid+ "님 접속 하셨습니다");
			this.sk =new Socket(this.ip,this.port);
			this.is =this.sk.getInputStream();
			this.os =this.sk.getOutputStream();
				System.out.println("채팅 내용을 입력 하는 코드");
		
			this.message =mid + "내용";
			this.os.write(this.message.getBytes());
			this.os.flush();
				
			while(true) {
				byte[] data= new byte[4096];
				int n =this.is.read(data);
				this.result = new String(data,0,n);
					System.out.println(this.result);
			}	
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}