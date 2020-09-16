package com.ahmed.adel.TestDB;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

/**
 * Servlet implementation class TestDB
 */
@WebServlet("/TestDB")
public class TestDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath() +"<br />");
		
		// setup connection variables
				String user = "root";
				String pass = "root";
				String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
				String driver = "com.mysql.jdbc.Driver";
				
				// get connection to database
				try {
					PrintWriter out = response.getWriter();
					response.setContentType("text/html");
					out.println("<html><body><h3 style=\'color:#069\'>"+"Connecting to database: " +"</h3> <\br>"+ jdbcUrl);
					Class.forName(driver);
					Connection myConn = (Connection) DriverManager.getConnection(jdbcUrl, user, pass);
					out.println("<h3 style=\'color:#069\'>"+"SUCCESS!!!" +"</h3></body></html>");
					//response.sendRedirect("customer/list") ;
					myConn.close();
				}
				catch (Exception exc) {
					exc.printStackTrace();
					throw new ServletException(exc);
				}
			
	}

	

}
