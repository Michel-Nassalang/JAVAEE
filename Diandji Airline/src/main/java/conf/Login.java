package conf;

import java.sql.Connection;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import db.DataBase;
import db.UserDB;

/**
 * Servlet implementation class Login
 */
@WebServlet (urlPatterns = "/login", loadOnStartup = 1)
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public void init() throws ServletException{
    	DataBase.init(this.getServletContext());
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("pseudo", "");
		request.setAttribute("mdp", "");
		request.setAttribute("errorMessage", "");
		request.getRequestDispatcher("/connected.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pseudo = request.getParameter("pseudo");
		String mdp = request.getParameter("mdp");
		
		request.setAttribute("pseudo", pseudo);
		request.setAttribute("mdp", mdp);
		
		UserDB connectedUser = UserDB.isValidLogin(pseudo, mdp);
		if(connectedUser != null) {
			
			HttpSession session = request.getSession(true);
			session.setAttribute("connectedUser", connectedUser);
			request.getRequestDispatcher("/users/users.jsp").forward(request, response);
	
		} else {
			request.setAttribute("errorMessage", "Bad identity");
			request.getRequestDispatcher("/connected.jsp").forward(request, response);
			
		}
	}

}
