package main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businessLogicFacades.ItemFacade;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String THANKS_JSP = "/Thanks.jsp";
	private String[] names = { "question", "answer", "wrongAnwer",
			"wrongAnwer2", "wrongAnwer3", "courseID" };
	
	private Statement stmt;
	private Connection conn;
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/quizzler";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "";

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		RequestDispatcher view = req.getRequestDispatcher(THANKS_JSP);
		view.forward(req, resp);
		ItemFacade.createItem(req.getParameterValues(names[5])[0]);
	}
}
