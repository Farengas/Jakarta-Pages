<!DOCTYPE html>
<html>
	<head>
		<title>Cookies</title>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://bootswatch.com/5/superhero/bootstrap.min.css">
	</head>
	<body>
		<div class='container'>
			<%
				// Questo scriptlet compone il messaggio di avvertimento di "login fallito".
				if (request.getAttribute("loginfallito") != null) {
					out.println("<div class='alert alert-danger my-3'>");
					out.println(request.getAttribute("loginfallito"));
					out.println("</div>");
				}
			%>
			<form class='col-6 offset-3' action="login.jsp" method="post">
				<div class='mb-3'>
					<label for="nome" class='form-label'>Nome utente</label>
					<input type="text" id="nome" class='form-control' name="nomeutente">				
				</div>
				<div class='mb-3'>
					<label for="pass" class='form-label'>Password</label>
					<input type="password" id="pass" class='form-control' name="password">				
				</div>
				<button class='btn btn-primary'>Esegui login</button>
			</form>
		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
	</body>
</html>
