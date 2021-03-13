package com.hcl.petShop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.entities.User;

/**
 * Servlet implementation class SigninServlet
 */
@WebServlet("/Signin")
public class SigninServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SigninServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		// TODO Auto-generated method stub
				UserModel userM = new UserModel();
				
				String email = request.getParameter("email");
				String password = request.getParameter("pwd");
				//check if email is in the database
				if(userM.exists(email)) {
					//validate password
					if(userM.confirmPass(email, password)) {
						request.setAttribute("user", email);
						request.getRequestDispatcher("index.jsp").forward(request, response);
					}else {
						request.setAttribute("user", "Password Incorrect");
						request.getRequestDispatcher("Login.jsp").forward(request, response);
					}
				}
				else {
					request.setAttribute("user", "User already exists");
					request.getRequestDispatcher("Login.jsp").forward(request, response);
				}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
