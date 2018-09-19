package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import bean.Answer;
import bean.Problem;

/**
 * Servlet implementation class QA
 */
@WebServlet("/QA")
public class QA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QA() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Access-Control-Allow-Origin", "*");//�������
		request.setCharacterEncoding("UTF-8");  
        response.setCharacterEncoding("UTF-8");
        Answer a1 = new Answer("user2", "�ش�");
        Problem p1 = new Problem("����1", a1,"user1","2018-05-30",2500000,"����");
        Problem p2 = new Problem("����2", a1,"user1","2018-05-30",2500000,"�ڿ�");
        Problem p3 = new Problem("����3", a1,"user1","2018-05-30",2500000,"xx����");
        Problem p4 = new Problem("����4", a1,"user1","2018-05-30",2500000,"xx����");
        Problem p5 = new Problem("����5", a1,"user1","2018-05-30",2500000,"xx����");
        ArrayList<Problem> list = new ArrayList<Problem>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        Gson gson = new Gson();
        String json = gson.toJson(list);
        PrintWriter pw = response.getWriter();   
        pw.print(json);  
        pw.flush();  
        pw.close();  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
