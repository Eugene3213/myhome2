import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		String ip ="192.168.1.199";
		int port = 8009;
		Scanner sn =null;
		OutputStream os=null;
		InputStream is =null;
		Socket sc =null;
		try {
			 sc = new Socket(ip,port);
				System.out.println("서버 접속 되었습니다");
			 os = sc.getOutputStream();
			 is = sc.getInputStream();
			
			for(;;) {	//지속적으로 소켓에 접속 되도록 하는 형태
			sn = new Scanner(System.in);
				System.out.println("입력하실 내용을 적어주세요:");
			String msg= sn.nextLine();
			
			os.write(msg.getBytes());
			os.flush();
			
			byte[] data =new byte[1024];
			int n = is.read(data);
			String cmsg =new String(data,0,n);
				System.out.println(cmsg);
			}
		}catch(Exception c) {
			if(c.getMessage()!=null) {
				System.out.println("현재 접속 장애가 발생 하였습니다");		
			}
		}
		finally {		//클라이언트가 접속 종료시 해당 소켓 및 각종 Stream, Scanner 모두 종료
			try {
				sc.close();
				sn.close();		
				os.close();
				is.close();
					System.out.println("종료");
			}catch(Exception aa) {
				
			}
		}
	}

}
