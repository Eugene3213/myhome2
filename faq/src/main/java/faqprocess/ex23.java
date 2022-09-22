package faqprocess;

public class ex23 {
	static String a = null;
	static String b = null;
	
	public String names(){		//getter
		return this.a;
	}
	public String level() {		//getter
		return this.b;
	}
	public void inname() {		//setter
		this.a ="홍길동";
		this.b ="이순신";
	}
	public void inname2(String nm1, String nm2) {
		this.a = nm1;
		this.b = nm2;
	}
}
