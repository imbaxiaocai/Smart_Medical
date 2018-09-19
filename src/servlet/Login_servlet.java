package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import bean.Login_result;

/**
 * Servlet implementation class Login_servlet
 */
@WebServlet("/Login_servlet")
public class Login_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_servlet() {
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
		HttpSession session = request.getSession();
		String uname = request.getParameter("account");
		String passwd = request.getParameter("password");
		Login_result re;
		if((("user1".equals(uname))&&("123456".equals(passwd)))||(("user2".equals(uname))&&("123456".equals(passwd))))
		{
			re = new Login_result("success", true,uname,passwd);
			Gson gson = new Gson();
			String json = gson.toJson(re);
			session.setAttribute("rs", json);
			PrintWriter pw = response.getWriter();   
	        pw.print(json);  
	        pw.flush();  
	        pw.close();  
			//response.sendRedirect("../TestInterface.jsp");
		}
		else {
			re = new Login_result("failed", false, null,null);
			Gson gson = new Gson();
			String json = gson.toJson(re);
			session.setAttribute("rs", json);
			PrintWriter pw = response.getWriter();   
	        pw.print(json);  
	        pw.flush();  
	        pw.close();
			//response.sendRedirect("file:///C:/Users/hp/Desktop/testhtml/result.html");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
