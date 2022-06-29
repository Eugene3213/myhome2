import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

	public static void main(String[] args) {

		int port =8009;
		ServerSocket ss =null;
		Socket sc =null;
		try {
			ss =new ServerSocket(port);
				System.out.println("서버 연결 대기중...");
			sc =ss.accept();
			InputStream is =sc.getInputStream();
			OutputStream os =sc.getOutputStream();
			byte[] data= new byte[1024];
			int n = is.read(data);
			String message =new String(data,0,n);
				System.out.println(message);
			os.flush();
			is.close();
			sc.close();
			os.close();
			
		}catch(Exception e) {
			System.out.println(sc.getInetAddress());
			
		}

	}

}
