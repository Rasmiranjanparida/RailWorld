package encapsulation;

public class Account {

	private long acc_no;
	private String name;
	private String email;
	private float amount;

	public long getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	

	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email=email;
	}

	public float getamount() {
		return amount;
	}
	public void setamount(float amount) {
		this.amount=amount;
	}
	public static void main(String[] args) {
		Account ac=new Account();
		ac.setAcc_no(92678251);
		ac.setamount(500000);
		ac.setemail("rasmiranjanparida@gmail.com");
		ac.setname("Rasmi");
		System.out.println("Acc_no ="+ac.getAcc_no());
		System.out.println("Name ="+ac.getname());
		System.out.println("Email ="+ac.getemail());
		System.out.println("Amount ="+ac.getamount());
		
		System.out.println();
		Account ac1=new Account();
		ac1.setAcc_no(926);
		ac1.setamount(100000);
		ac1.setemail("jatin@gmail.com");
		ac1.setname("jatin");
		System.out.println("Acc_no ="+ac1.getAcc_no());
		System.out.println("Name ="+ac1.getname());
		System.out.println("Email ="+ac1.getemail());
		System.out.println("Amount ="+ac1.getamount());
		
		
	}

}
