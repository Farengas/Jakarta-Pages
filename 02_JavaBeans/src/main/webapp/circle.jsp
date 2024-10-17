<%@ page import="it.cefi.model.Circle" %>
<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Circle</title>
		<meta charset="UTF-8">
	</head>
	<body>
		<% 
			double radius = Double.parseDouble(request.getParameter("radius"));
			Circle circle = new Circle(radius);
		%>
		<div>
			<h3>Circumference: <%= circle.circumference() %></h3>
			<h3>Area: <%= circle.area() %></h3>
			<a href="index.html">Return to index</a>
		</div>
	</body>
</html>
