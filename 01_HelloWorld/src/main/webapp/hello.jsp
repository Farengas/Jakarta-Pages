<%@ page import="java.time.LocalDateTime" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>HelloWorld</title>
		<meta charset="UTF-8">
	</head>
	<body>
		<!-- Una pagina JSP è in grado di contenere ed eseguire del codice Java
		     prima che il suo contenuto venga restituito all'utente -->
		     
		<%-- Le pagine JSP sfruttano, a tal fine, quattro tipi di marcatori XML:
		     le direttive, le dichiarazioni, le scriptlets e le espressioni --%>
		     
		<%! 
			int contatoreVisite = 0;
		%>     
		     
		<% 
			LocalDateTime now = LocalDateTime.now();
			String nome = request.getParameter("nomeutente");
		%>     
		     
		<h1><%= now %></h1>
		
		<% if (!nome.isBlank()) { %>
			<h3>Ciao, <%= nome %></h3>
		<% } else { %>
			<h3>Non hai inviato il tuo nome</h3>
		<% } %>
		
		<c:if test="${!nome.isBlank()}">
			Ciao <c:out value="${nome}"/>
		</c:if>
		
		<h3>Numero di visite: <%= ++contatoreVisite %></h3>
		     
	</body>
</html>
