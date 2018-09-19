package bean;

public class Problem {
	public String question;
	public Answer answer;
	public String username;
	public String type;
	public String time;
	public long readNum;
	public Problem(String question,Answer answer,String username,String time,long readNum,String type) {
		this.question = question;
		this.answer = new Answer(answer.username, answer.answer);
		this.username = username;
		this.time = time;
		this.readNum = readNum;
		this.type = type;
	}
	public String getQuestion()
	{
		return question;
	}
	public Answer getAnswer()
	{
		return answer;
	}
}
