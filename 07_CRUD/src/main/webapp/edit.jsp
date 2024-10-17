<%@ page import="it.cefi.models.*"%>
<!DOCTYPE html>
<html>
	<head>
		<title>CRUD</title>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
	</head>
	<body>
		<div class="container">
			<% 
				Studente studente = new Studente(0, "", "");
				if (request.getParameter("id") != null) {
					int id = Integer.parseInt(request.getParameter("id"));
					studente = Cefi.getStudente(id);
				}
			%>
			<form class='mt-3' action="save" method="post">
				<input type="hidden" name="id" value="<%= studente.getId() %>">
				<div class='mb-3'>
					<label class='form-label'>Nome</label>
					<input type="text" class='form-control' name="nome" value="<%= studente.getNome() %>">
				</div>
				<div class='mb-3'>
					<label class='form-label'>Cognome</label>
					<input type="text" class='form-control' name="cognome" value="<%= studente.getCognome() %>">
				</div>
				<button class='btn btn-primary col-1'>Salva</button>
				<a href="index.jsp" class='btn btn-secondary col-1'>Annulla</a>
			</form>
		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
	</body>
</html>
