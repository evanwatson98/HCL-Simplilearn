package project.hcl;

import java.beans.Statement;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PetShopServlet
 */
@WebServlet(urlPatterns = {"/PetShopServlet"})
public class PetShopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PetShopServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        // TODO Auto-generated method stub
		
		int id = 0;
        
        try {
        	PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
            String pet = request.getParameter("petid");
//            InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
//            Properties props = new Properties();
//            props.load(in);
                
            PetJDBC conn = new PetJDBC(("jdbc:mysql://localhost:3306/pets"), ("springuser"), ("ThePassword"));
        	java.sql.Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
        	ResultSet rst = stmt.executeQuery("select count(*) from products");
        	int petId = 0;
        	 
        	if(pet.isEmpty() ) {
            	out.print("<h1 style=\"color: red\">Must input someting</h1>");
            }else if(!pet.matches("-?(0|[1-9]\\d*)")) {
            	out.println("<h1 style=\"color: red\">Not a number. Please Try again</h1>");
            }else {
            	Integer.parseInt(pet);
             	 while (rst.next()) {
             		 id = rst.getInt(1);
             	 }
            	if(0 >= petId || petId >= id) {
                   	out.println("<h1 style=\"color: red\">Pet ID: " + pet + " is greater than or less than the total pet IDs: " + id +". Please try a different #</h1>");
                   }
            	}
            	
        	rst = stmt.executeQuery("select * from products where id=" + pet);
   
            
            while (rst.next()) {
                out.println("<tr><td>" + rst.getString("name") + "</td>" + "<td>" +
                		rst.getString("color") + "</td><td>" + rst.getBigDecimal("price") + "</td></tr>");
            }
            
            out.println("</table>");
        
            stmt.close();        
   
        
            out.println("</body></html>");
            conn.closeConnection();
        
        } catch (ClassNotFoundException e) {
        	e.printStackTrace();
        } catch (SQLException e) {
        	e.printStackTrace();
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
