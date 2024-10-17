<%@ page session="true"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Sessioni</title>
		<meta charset="UTF-8">
	</head>
	<body>
		<div>
			<h3>Session Id: <%= session.getId() %></h3>
			<h4>Creation Time: <%= session.getCreationTime() %></h4>

			<% 
				session.setAttribute("nome", "Massimiliano");
			%>
		
			<h4>Nome: <%= session.getAttribute("nome") %></h4>
		
		</div>
	</body>
</html>
