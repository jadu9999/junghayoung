package q196;

public class Member {
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
	   
	   @Override
	   public String toString() {
	      return "name : " + name + "\ntel : "+tel+"\naddr : " + addr+"\n";
	   }
	   
	   
	}

