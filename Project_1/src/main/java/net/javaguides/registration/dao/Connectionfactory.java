package net.javaguides.registration.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connectionfactory {
	
	/**
	 * <p>This ConnectionFactory class follows the Singleton Design Pattern and facilitates obtaining a connection to a Database for the ERS application.</p>
	 * <p>Following the Singleton Design Pattern, the provided Constructor is private, and you obtain an instance via the {@link ConnectionFactory#getInstance()} method.</p>
	 */
	

	    private static Connectionfactory instance;
	    
	    		

	    private Connectionfactory() {
	        super();
	    }

	    /**
	     * <p>This method follows the Singleton Design Pattern to restrict this class to only having 1 instance.</p>
	     * <p>It is invoked via:</p>
	     *
	     * {@code ConnectionFactory.getInstance()}
	     * @throws SQLException 
	     * @throws ClassNotFoundException 
	     */
	    public static Connectionfactory getInstance() throws ClassNotFoundException, SQLException {
	        if(instance == null) {
	            instance = new Connectionfactory();
	        }

	        return instance;
	    }

	    /**
	     * <p>The {@link ConnectionFactory#getConnection()} method is responsible for leveraging a specific Database Driver to obtain an instance of the {@link java.sql.Connection} interface.</p>
	     * <p>Typically, this is accomplished via the use of the {@link java.sql.DriverManager} class.</p>
	     */
	    public static Connection getConnection() {
	    	 Connection conn = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project1_schema", "root", "root1234");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    	return conn;
	    }
	}




