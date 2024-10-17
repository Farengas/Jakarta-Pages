<%@ include file="WEB-INF/check-cookie.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Cookies</title>
		<meta charset="UTF-8">
	</head>
	<body>
		<div>
			<h3>Pagina 2</h3>
			<h4>Benvenuto, <%= nomeUtente %></h4>
			<ul>
				<li><a href="page1.jsp">Torna su pagina 1</a></li>
				<li><a href="page3.jsp">Vai a pagina 3</a></li>
				<li><a href="logout.jsp">Esegui logout</a></li>
			</ul>
		</div>
	</body>
</html>
