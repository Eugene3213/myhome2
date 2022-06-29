import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class chat_client {

	public static void main(String[] args) {
		
		try {
			client_chat cc =new client_chat();
			cc.chat();		
		}catch(Exception a) {
			if(a.getMessage()!=null) {
				System.out.println(a);
			}
		}
	}
}
class client_chat{
	private final String ip ="";
	final int port = 8009;
	Scanner sc = null;
	InputStream is =null;
	OutputStream os =null;
	private String mid =null;
	Socket sk = null;
	String msg = null;
	String smsg= null;
	String check =null;		//exit 단어 검색
	public void chat() {
		//각종 Stream을 close 하지 않습니다. 왜냐면 모든 Stream이 소켓과 연결이 되어 있으므로 close시 소켓도 함께 종료가 됩니다,
		//Socket은 데이터가 본 데이터가 변경이되면 접속이 끊어지는 현상이 발생할 수 있음.
		try {
			this.sc= new Scanner (System.in);
			System.out.println("아이디를 생성해 주세요");
			this.mid =this.sc.next();
			
			int c=0;
			while(true) {
				this.sk =new Socket(this.ip,this.port);
				this.is =this.sk.getInputStream();
				this.os=this.sk.getOutputStream();
				
				if(c==0) {
					this.msg= "[" + this.mid + "]: 님 입장하였습니다";					
				}
				else {
					this.sc= new Scanner(System.in);
					System.out.println("내용을 입력해 주세요ㅗ");
					this.check = this.sc.nextLine().intern();
					this.msg= "[" + this.mid + "]:" + this.check;					
				}
				if(this.check=="exit") {
					this.msg ="[" + this.mid +"]: 님이 퇴장 하셨습니다";
					this.os.write(this.msg.getBytes());
					this.os.flush();
					this.sk.close();
				}
				else {
					this.os.write(this.msg.getBytes());
					this.os.flush();				
				}
								
				byte data[]=new byte[1024];
				int n =this.is.read(data);
				this.smsg= new String(data,0,n);
				System.out.println(this.smsg);
				
				c++;
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}