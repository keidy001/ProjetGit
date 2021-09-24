package com.odk.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    	ArrayList<User> listUser = new ArrayList<User>();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String nom = request.getParameter("nom");
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		User user = new User();
		 user.setNom(nom);
		 user.setLogin(login);
		 user.setPassword(password);
		 
		 listUser.add(user);
		 
		 request.setAttribute("list", listUser);
		 
		 this.getServletContext().getRequestDispatcher("/WEB-INF/vue.jsp").forward(request, response);
		 
		 
		 
	}

}
