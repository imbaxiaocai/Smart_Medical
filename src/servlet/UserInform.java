package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.microsoft.sqlserver.jdbc.*;

import bean.User;
/**
 * Servlet implementation class Login_servlet
 */
@WebServlet("/UserInform")
public class UserInform extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserInform() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setHeader("Access-Control-Allow-Origin", "*");//øÁ”Ú∑√Œ 
		request.setCharacterEncoding("UTF-8");  
        response.setCharacterEncoding("UTF-8"); 	
		String uname = request.getParameter("account");
		String passwd = request.getParameter("password");
		User re;
		if((("user1".equals(uname))&&("123456".equals(passwd)))||(("user2".equals(uname))&&("123456".equals(passwd))))
		{
			re = new User("user1", "123456");
			Gson gson = new Gson();
			String json = gson.toJson(re);
			PrintWriter pw = response.getWriter();   
	        pw.print(json);  
	        pw.flush();  
	        pw.close();
			//response.sendRedirect("../TestInterface.jsp");
		}
		//else {
			re = new User("123","123");
			Gson gson = new Gson();
			//String json = gson.toJson(re);
			//session.setAttribute("rs", json);
			//PrintWriter pw = response.getWriter();   
	        //pw.print(json);  
	        //pw.flush();  
	        //pw.close();
	        ArrayList<User> u = new ArrayList<User>();
	        u.add(re);
	        re = new User("233","233");
	        u.add(re);
	        re = new User("333","333");
	        u.add(re);
	        String json = gson.toJson(u);
	        PrintWriter pw = response.getWriter();   
	        pw.print(json);  
	        pw.flush();  
	        pw.close();
	        //System.out.println(gson.toJson(u));
			//response.sendRedirect("file:///C:/Users/hp/Desktop/testhtml/result.html");
		//}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
