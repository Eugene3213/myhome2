import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

//crawling 사용 
public class net3 {

	public static void main(String[] args) throws Exception{
		String url = "";
		URL urls = new URL(url);
		URLConnection con =urls.openConnection();
		int size = con.getContentLength();
			System.out.println(urls.getProtocol());		//프로토컬 http,https
			System.out.println(urls.getPort());		//포트번호
			System.out.println(urls.getFile());		//접속 파일명
		InputStream is =urls.openStream();	
		InputStreamReader isr =new InputStreamReader(is,"UTF8");
		BufferedReader br =new BufferedReader(isr);
		FileOutputStream fs =new FileOutputStream("login.html");
		byte html[] =new byte[1024];
		String str="";
 
			fs.write(html,0,size);
		}
//		br.close();
//		fs.flush();
//		fs.close();

}
