package it.cefi.controllers;

import java.io.IOException;

import it.cefi.models.MatematicaBean;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/fattoriale")
public class FattorialeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// Catturo il numero inserito dall'utente nel form.
		double numero = Double.parseDouble(request.getParameter("numero"));
		
		// Calcolo il fattoriale del numero ricevuto in input.
		double fattoriale = MatematicaBean.fattoriale(numero);
		
		// Per riportare indietro il valore ottenuto mi creo un RequestDispatcher.
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
		request.setAttribute("fattoriale", fattoriale);
		requestDispatcher.forward(request, response);
		
	}
	
}
