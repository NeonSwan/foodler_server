package main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businessLogicFacades.ItemFacade;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Items")
public class Items extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String[] names = { "itemName" };

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ItemFacade.deleteItem(req.getParameterValues(names[0])[0]);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter printWriter = resp.getWriter();
		printWriter.write(ItemFacade.getAllItems());
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doPut(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ItemFacade.createItem(req.getParameterValues(names[0])[0]);
	}

}
