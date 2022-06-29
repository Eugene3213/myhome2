import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class m_server {

	public static void main(String[] args) {
		chatroom cr =new chatroom();
	}

}
class chatroom{		//기본사항 -> 값 접속마다 thread를 분할
	ServerSocket server= null;
	static final int port=9009;		//Thread에서 공용으로 사용하기 위함
	Socket sk =null;
	
	public chatroom() {
		try {
			this.server =new ServerSocket(this.port);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("****멀티 채팅 시작!!****");
		
		while(true) {
			try {
				sk = this.server.accept();		//클라이언트 접속 허가
				chat_thread ct =new chat_thread(sk);	//accept 정보 보냄
				Thread t =new Thread(ct);
				t.start();
			}catch(Exception e2) {
			}
		}
	}
}
class chat_thread implements Runnable{
	Socket sk = null;
	InputStream is =null;
	OutputStream os =null;
	String message =null;
	String result =null;
	String m=null;
	Scanner sc= null;
	//배열을 메모리에 기억시킴 (static) : 누적시키기 위해서
	//접속자 발생시 Thread가 새롭게 생성되므로 static에 올리지 않으면 누적없이 계속 초기화 되어버림
	static ArrayList<Socket> user =new  ArrayList<Socket>();	//접속자
	
	public chat_thread(Socket s) {
		this.sk =s;
		this.user.add(this.sk);
		try {
			System.out.println("채팅에 참여 하셨습니다");
			System.out.println(this.sk);
			this.is =this.sk.getInputStream();
			this.os =this.sk.getOutputStream();
		}catch(Exception e) {
			System.out.println("클라이언트 접속 정보가 올바르지 않습니다");
		}
	}
	@Override
	public void run() {
		try {
				byte data[]= new byte[1024];
				int n = this.is.read(data);
				this.message= new String(data,0,n);
					System.out.println(this.message);
					
			while(true) {
				System.out.println(this.user.size());
				this.sc =new Scanner(System.in);
					System.out.println("보낼 메세지를 입력하세요");
				this.result = this.sc.nextLine();
				/* 배열에 있는 vport에 대한 정보를 담은 수만큼 반복*/
				for(int j=0;j<this.user.size();j++) {
					//배열에 있는 사용자 vport로 전송
					OutputStream all =this.user.get(j).getOutputStream();
					//사용자별로 Stream을 생성
					all.write(this.result.getBytes());	//생성
					all.flush();	//해당 전송 메세지를 비움(메모리)
//					this.os.write(this.result.getBytes());
//					this.os.flush();
				}
//				Thread.sleep(10000);
//				this.os.write(this.m.getBytes());
//				this.os.flush();
//				this.os.write(this.message.getBytes());	//회신
//				this.os.flush();
			}
		}catch(Exception e) {
			System.out.println("클라이언트가 종료 되었습니다");
		}
		finally {
			try {
				this.is.close();
				this.os.close();
				this.sk.close();
			}catch(Exception e) {
			}
		}
	}
}