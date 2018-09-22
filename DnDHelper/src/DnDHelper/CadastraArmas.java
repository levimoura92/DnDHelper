package DnDHelper;

import java.io.IOException;
import DnDHelper.SQLUtils;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadastraArmas
 */
@WebServlet("/CadastraArmas")
public class CadastraArmas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastraArmas() {
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
		String wpnName = request.getParameter("wpnName");
		int wpnDice = Integer.parseInt(request.getParameter("wpnDice"));
		int wpnNumDice = Integer.parseInt(request.getParameter("wpnNumDice"));
		String wpnEffect = request.getParameter("wpnEffect");
		SQLUtils.cadastraArmas(wpnName, wpnDice, wpnNumDice, wpnEffect);
//		System.out.println(wpnName+ " "+Integer.toString(wpnNumDice)+"d"+Integer.toString(wpnDice)+ " "+ wpnEffect);
	}

}
