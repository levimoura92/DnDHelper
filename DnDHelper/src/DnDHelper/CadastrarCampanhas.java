package DnDHelper;

import java.io.IOException;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import DnDHelper.UserDnD;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadastrarCampanhas
 */
@WebServlet("/CadastrarCampanhas")
public class CadastrarCampanhas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarCampanhas() {
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
		String campName = request.getParameter("campName");
		int uCod = Integer.parseInt(request.getParameter("userCod"));
		System.out.println(campName + " user: "+Integer.toString(uCod));
		SQLUtils.cadastraCampanhas(campName, uCod);
	}

}
