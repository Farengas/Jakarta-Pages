<%-- Per poter accedere a questa pagina è necessario che il cookie sia stato creato. --%>

<%@ page errorPage="error.jsp" %>

<% 
	// Recupero gli eventuali cookies presenti nella cartella Temporary Internet Files...
	Cookie[] cookies = request.getCookies();
	
	String nomeUtente = null;
	// Se ho trovato dei cookies...
	if (cookies != null) {
		for (Cookie cookie : cookies) {
			// verifico se tra questi c'è il cookie di nome "nomeutente"...
			if (cookie.getName().equals("nomeutente")) {
				// e assegno il suo valore alla stringa "nomeUtente".
				nomeUtente = cookie.getValue();			
			}
		}
	}
	
	// Se il cookie non è stato trovato lancio eccezione...
	if (nomeUtente == null) {
		throw new Exception("Accesso alla pagina non consentito");
	}
%>
