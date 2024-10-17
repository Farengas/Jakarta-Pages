package it.cefi.controllers;

import java.io.IOException;

import java.sql.SQLException;

import it.cefi.models.Cefi;
import it.cefi.models.Studente;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class SalvaStudenteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		
		// Quando l'id dello studente è 0 significa che voglio inserire un nuovo record nella tabella,
		// altrimenti devo aggiornare lo studente con l'id corrispondente.
		Studente studente = new Studente(id, nome, cognome);
		
		try {
			if (studente.getId() == 0) {
				Cefi.insertStudente(studente);
			} else {
				Cefi.updateStudente(studente);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		response.sendRedirect("index.jsp");
		
	}
	
}
