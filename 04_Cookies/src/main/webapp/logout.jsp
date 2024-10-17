<%-- Questa pagina rappresenta a tutti gli effetti un controller, 
	 pertanto, non mostrerà alcun tipo di marcatore. --%>

<%
	Cookie[] cookies = request.getCookies();

	if (cookies != null) {
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("nomeutente")) {
				
				cookie.setValue(null);
				cookie.setMaxAge(0);
				cookie.setPath("/");
				
				response.addCookie(cookie);
				
			}
		}
	}

	response.sendRedirect("index.jsp");
%>
