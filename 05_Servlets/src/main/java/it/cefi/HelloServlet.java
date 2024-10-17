package it.cefi;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * Se voglio rendere la classe HelloServlet una servlet devo fargli
 * ereditare la super classe HttpServlet.
 * 
 * Le classi servlets non vengono istanziate dal programmatore bensì
 * dall'application server quando raggiungiamo la URL alla quale
 * rispondono.
 * 
 * La URL può essere assegnata tramite un'annotazione oppure tramite
 * il file "web.xml".
 * 
 * Le classi servlet possono essere utilizzate per produrre contenuti
 * HTML tramite l'override del metodo doGet.
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		System.out.println("Ho raggiunto la servlet... l'oggetto è stato istanziato");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlets</title>");
		out.println("<meta charset='UTF-8'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello</h1>");		
		out.println("</body>");
		out.println("</html>");
		
	}
	
	@Override
	public void destroy() {
		System.out.println("Ho abbandonato la servlet... l'oggetto è stato distrutto");
	}
	
}
