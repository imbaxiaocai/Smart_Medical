package bean;

public class Medical_inform {
	public String date;
	public String uname;
	public String type;
	public String datatype;
	public Object data;
	public Medical_inform(String date,String uname,String type,String datatype,Object data) {
		this.uname = uname;
		this.type = type;
		this.data = data;
		this.datatype = datatype;
		this.date = date;
	}
}