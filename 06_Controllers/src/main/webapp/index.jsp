<!DOCTYPE html>
<html>
	<head>
		<title>Controllers</title>
		<meta charset="UTF-8">
	</head>
	<body>
		<div>
			<% 
				if (request.getAttribute("fattoriale") != null) {
					out.println("<div>");
					out.println(request.getAttribute("fattoriale"));
					out.println("</div>");
				}
			%>
			<form action="fattoriale" method="get">
				<label>Numero</label>
				<input type="number" min="0" value="0" name="numero">
				<button>Fattoriale</button>
			</form>
		</div>
	</body>
</html>
