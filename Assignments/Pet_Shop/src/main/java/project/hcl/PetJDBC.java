package project.hcl;
import java.sql.*;

public class PetJDBC {
	
	 private Connection connection;

	    public PetJDBC(String dbURL, String user, String pwd) throws ClassNotFoundException, SQLException{

	        Class.forName("com.mysql.cj.jdbc.Driver");
	        this.connection = DriverManager.getConnection(dbURL, user, pwd);
	    }

	    public Connection getConnection(){
	        return this.connection;
	    }

	    public void closeConnection() throws SQLException {
	        if (this.connection != null)
	            this.connection.close();
	    }
	    
}
