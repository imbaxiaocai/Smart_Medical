package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import bean.RegisterInform;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setHeader("Access-Control-Allow-Origin", "*");//跨域访问
		request.setCharacterEncoding("UTF-8");  
        response.setCharacterEncoding("UTF-8"); 	
		String uname = request.getParameter("account");
		String passwd = request.getParameter("password");
		RegisterInform ri;
		boolean flag = true;
		String inform = "";
		//合法性验证
		
		//jdbc
		
		if(flag)
		{
			ri = new RegisterInform("success", flag, uname, passwd);
			Gson gson = new Gson();
			String json = gson.toJson(ri);
			PrintWriter pw = response.getWriter();   
	        pw.print(json);  
	        pw.flush();  
	        pw.close();
		}
		else
		{
			ri = new RegisterInform(inform, flag, null, null);
			Gson gson = new Gson();
			String json = gson.toJson(ri);
			PrintWriter pw = response.getWriter();   
	        pw.print(json);  
	        pw.flush();  
	        pw.close();
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
