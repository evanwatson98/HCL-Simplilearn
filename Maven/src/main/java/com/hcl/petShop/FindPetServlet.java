package com.hcl.petShop;


import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com .hcl.entities.Pet;

/**
 * Servlet implementation class FindPetServlet
 */
@WebServlet(urlPatterns = {"/SearchPet"})
public class FindPetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindPetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 try {
             SessionFactory factory = HibernateUtil.getSessionFactory();
             
             Session session = factory.openSession();
             // using HQL
             List<Pet> list = session.createQuery("from products", Pet.class).list();
             
             session.close();
             
              PrintWriter out = response.getWriter();
              out.println("<html><body>");
              out.println("<b>Product Listing</b><br>");
              for(Pet p: list) {
                      out.println("ID: " + String.valueOf(p.getId()) + ", Name: " + p.getName() +
                                      ", Price: " + String.valueOf(p.getPrice()) + "<br>");
              }
              
          out.println("</body></html>");
          
          
      } catch (Exception ex) {
              throw ex;
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
