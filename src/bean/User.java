package bean;

public class User {
	private String uname;
	private String passwd;
	public User(String uname,String passwd) {
		this.uname = uname;
		this.passwd =passwd;
	}
	public String getName()
	{
		return uname;
	}
	public String getPwd()
	{
		return passwd;
	}
}
