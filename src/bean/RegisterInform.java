package bean;

public class RegisterInform {
	public String inform;
	public boolean result;
	public String account;
	public String password;
	public RegisterInform(String inform,boolean result,String account,String password) {
		this.inform = inform;
		this.result = result;
		this.account = account;
		this.password = password;
	}
}
