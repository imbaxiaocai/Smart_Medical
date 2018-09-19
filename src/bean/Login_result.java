package bean;

public class Login_result {
	public String inform;
	public boolean result;
	public String account;
	public String password;
	public Login_result(String inform,boolean result,String account,String password) {
		this.inform = inform;
		this.result = result;
		this.account = account;
		this.password = password;
	}
}
