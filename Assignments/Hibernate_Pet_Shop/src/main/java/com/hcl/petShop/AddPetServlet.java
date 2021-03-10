package com.hcl.petShop;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hcl.entities.Pet;

/**
 * Servlet implementation class AddPetServlet
 */
@WebServlet(urlPatterns = {"/addPet"})
public class AddPetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPetServlet() {
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
		
		String name = request.getParameter("petName");
		String color = request.getParameter("petColor");
		String price = request.getParameter("petPrice");

		PetModel PetModel = new PetModel();

		Pet pet = new Pet();
		pet.setName(name);
		pet.setColor(color);

		pet.setPrice(Double.parseDouble(price));
		boolean status = request.getParameter("status") != null;
		if (PetModel.update(pet)) {
			request.setAttribute("msg", "Successful");
		} else {
			request.setAttribute("msg", "Failed");
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
