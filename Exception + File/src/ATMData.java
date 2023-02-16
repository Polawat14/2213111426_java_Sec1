
public class ATMData {
	private String accountNumber,password;
	
	public ATMData (String id,String pass) {
		this.accountNumber = id;
		this.password = pass;
	}
	public String getId() {
		return this.accountNumber;
	}
	public String getPass() {
		return this.password;
		}
	}
