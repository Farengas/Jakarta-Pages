<%@ page import="it.cefi.models.*"%>
<!DOCTYPE html>
<html>
	<head>
		<title>CRUD</title>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
	</head>
	<body>
		<div class='container'>
			<a href="edit.jsp" class='btn btn-primary my-3'><i class="bi bi-plus-circle"></i> Inserisci uno studente</a>
			<table class='table table-striped'>
				<thead class='table-dark'>
					<tr>
						<th>Id</th>
						<th>Nome</th>
						<th>Cognome</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
				<% 
					for (Studente studente : Cefi.getStudenti()) {
						out.println("<tr>");
						out.println("<td>" + studente.getId() + "</td>");
						out.println("<td>" + studente.getNome() + "</td>");
						out.println("<td>" + studente.getCognome() + "</td>");
						out.println("<td><a href='edit.jsp?id=" + studente.getId() + "' class='btn btn-secondary btn-sm'><i class='bi bi-arrow-down-up'></i></a>");
						out.println("<a href='delete?id=" + studente.getId() + "' class='btn btn-danger btn-sm'><i class='bi bi-trash'></i></a></td>");
						out.println("</tr>");
					}
				%>
				</tbody>
			</table>
		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
	</body>
</html>
