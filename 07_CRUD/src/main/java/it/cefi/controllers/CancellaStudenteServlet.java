package it.cefi.controllers;

import java.io.IOException;
import java.sql.SQLException;

import it.cefi.models.Cefi;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class CancellaStudenteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		try {
			Cefi.deleteStudente(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		response.sendRedirect("index.jsp");
		
	}
	
}
