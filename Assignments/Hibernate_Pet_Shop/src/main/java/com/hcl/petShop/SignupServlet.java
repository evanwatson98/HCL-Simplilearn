package com.hcl.petShop;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.entities.User;

/**
 * Servlet implementation class SignupServlet
 */
@WebServlet("/Signup")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost( request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserModel userM = new UserModel();
		
		String email = request.getParameter("newEmail");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String password = request.getParameter("newPassword");
		
		User user= new User();
		user.setEmail(email);
		user.setFname(fname);
		user.setLname(lname);
		user.setPassword(password);
		if(userM.update(user)) {
			String name = fname + " " + lname;
			request.setAttribute("user", email);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else {
			request.setAttribute("user", "User already exists");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
		
		
	}

}
