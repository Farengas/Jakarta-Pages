<!DOCTYPE html>
<html>
	<head>
		<title>Sessioni</title>
		<meta charset="UTF-8">
	</head>
	<body>
		<div>
		
			<h4>Nome: <%= session.getAttribute("nome") %></h4>
		
			<% session.invalidate(); %>
		
		</div>
	</body>
</html>
