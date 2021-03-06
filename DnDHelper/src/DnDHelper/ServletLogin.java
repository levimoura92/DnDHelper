package DnDHelper;

import java.io.IOException;
import DnDHelper.UserDnD;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;
import DnDHelper.SQLUtils;
/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String sUser = request.getParameter("user");
		String sPwd = request.getParameter("pwd");
//		System.out.println(sUser+" "+sPwd);
		UserDnD loggedUser = new UserDnD();
		loggedUser = SQLUtils.getUser(sUser, sPwd);
		if(loggedUser != null) {
//		System.out.println(Integer.toString(cod));
			HttpSession session = request.getSession();
			session.setAttribute("user", loggedUser);
			session.setAttribute("camp", loggedUser.getCampanha());
			response.sendRedirect(request.getContextPath()+ "/main.jsp");
		}else {
			response.sendRedirect(request.getContextPath()+"/index.jsp?loggin='false'");
		}
	}
}
