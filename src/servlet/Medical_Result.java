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

import bean.BloodPressure;
import bean.BloodSuger;
import bean.Medical_inform;

/**
 * Servlet implementation class Medical_Result
 */
@WebServlet("/Medical_Result")
public class Medical_Result extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Medical_Result() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Access-Control-Allow-Origin", "*");//øÁ”Ú∑√Œ 
		request.setCharacterEncoding("UTF-8");  
        response.setCharacterEncoding("UTF-8");
        BloodPressure b = new BloodPressure(110,75);
        //if("user1".equals(request.getParameter("account"))||"user2".equals(request.getParameter("account")))
        //{
        Medical_inform m1 = new Medical_inform("05-21", "user1", "bloodsuger", "class",b);
        Medical_inform m2 = new Medical_inform("05-20", "user1", "bloodsuger", "class",b);
        Medical_inform m3 = new Medical_inform("05-19", "user1", "bloodsuger", "class",b);
        Medical_inform m4 = new Medical_inform("05-18", "user1", "bloodsuger", "class",b);
        Medical_inform m5 = new Medical_inform("05-21", "user1", "bloodsuger", "image","http://www.imbaxiaocai.cn:8080/Smart_Medica/image/bs1.jpg");
        Gson gson = new Gson();
        ArrayList<Medical_inform> list = new ArrayList<Medical_inform>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        list.add(m5);
        String json = gson.toJson(list);
        PrintWriter pw = response.getWriter();   
        pw.print(json);  
        pw.flush();  
        pw.close();  
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
