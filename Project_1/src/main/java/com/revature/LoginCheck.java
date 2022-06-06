package com.revature;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheck() {
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
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		
		if(uname.equals("Basak") && password.equals("1234"))
		{
		
		response.sendRedirect("member.jsp");
			
			
		}
		else {
		response.sendRedirect("error.jsp");
		
	}
	}
}
	
	
		
	/*	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1_schema", "root", "root1234");//user //password
		
			PreparedStatement ps=conn.prepareStatement("insert into register values(?,?,?,?)");
		
		
		
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

}
		
	}



/*	
 response.setContentType("text/html");

PrintWriter out=response.getWriter();
String name=request.getParameter("name");
String country=request.getParameter("country");





//	int i=ps.executeUpdate();
	
	
//	if(i>0) {
	//	out.print("you are succesfully registered");
		
		
//	}
	
/*
 * Execute SQL query

     Statement stmt = conn.createStatement();
     String sql;
     sql = "SELECT id, first, last, age FROM Employees";
     ResultSet rs = stmt.executeQuery(sql);

 //
// Extract data from result set
    // while(rs.next()){
        //Retrieve by column name
    //    int id  = rs.getInt("id");
    //   int age = rs.getInt("age");
     //   String first = rs.getString("first");
     //   String last = rs.getString("last");

        //Display values
      System.out.println("ID: " + id + "<br>");
       System. out.println(", Age: " + age + "<br>");
      System .out.println(", First: " + first + "<br>");
       System.out.println(", Last: " + last + "<br>");
     }
   System.out.println("</body></html>");
// Clean-up environment
     rs.close();
     stmt.close();
     conn.close();

*/	