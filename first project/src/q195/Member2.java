package q195;

import java.util.Scanner;

public class Member2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Member mam = new Member();
		mam.setName(sc.next());
		mam.setTel(sc.next());
		mam.setAddr(sc.next());

		System.out.println("name : " + mam.getName());
		System.out.println("tel : " + mam.getTel());
		System.out.println("addr : " + mam.getAddr());

	}

}

class Member {
	private String name;
	private String tel;
	private String addr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
