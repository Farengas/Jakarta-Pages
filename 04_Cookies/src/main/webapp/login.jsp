<%-- Questa pagina rappresenta a tutti gli effetti un controller, 
	 pertanto, non mostrerà alcun tipo di marcatore. --%>
	 
<%
	String nomeutente = request.getParameter("nomeutente");
	String password = request.getParameter("password");
	
	// Impedisco l'apertura della pagina direttamente dal browser.
	if (nomeutente == null || password == null) {
		
		response.sendRedirect("index.jsp");
		
	// Se l'utente inserisce delle credenziali corrette...
	} else if (nomeutente.equals("admin") && password.equals("123456")) {
		
		// creo il cookie...
		Cookie cookie = new Cookie("nomeutente", nomeutente);
		cookie.setMaxAge(900);
		cookie.setPath("/");
		
		// ed invio l'utente su "page1.jsp".
		response.addCookie(cookie);
		response.sendRedirect("page1.jsp");
	
	// Se l'utente inserisce delle credenziali non corrette...
	} else {
		
		// utilizzo un dispatcher per trasferire l'utente sulla pagina "index.jsp".
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
		request.setAttribute("loginfallito", "Nome utente o password non corretta");
		requestDispatcher.forward(request, response);
		
	}
%>
