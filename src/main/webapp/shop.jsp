<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="it.polito.ai.businesslogic.TravelDocument"%>
<%@ page import="java.net.*"%>
<!DOCTYPE html>
<html>
<head>
<base
	href="<%=new URL(request.getScheme(), request.getServerName(), request.getServerPort(),
					request.getContextPath())%>/">
<title>${title}</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"></link>
<link rel="stylesheet" href="css/style.css"></link>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
</head>
<body>
	<div id="pageheader" class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<%@include file="components/navbar.jsp"%>
		</div>
	</div>
	<div id="sidenav" class="navbar-fixed-top vertical-center"
		style="width: 250px; margin-top: 50px;">
		<%@include file="components/list.jsp"%>
	</div>
	<div class="container" style="padding-top: 50px; padding-left: 250px">
		<div id="body" class="row">
			<%
				java.util.Set<TravelDocument> travelDocuments = (java.util.Set<TravelDocument>) request.getServletContext()
						.getAttribute("travelDocuments");
				for (TravelDocument t : travelDocuments) {
			%>
			<p><%=t.getName()%></p>
			<%
				}
			%>
		</div>
		<div id="pagefooter" class="row">
			<%@include file="components/footer.jsp"%>
		</div>

	</div>
</body>
</html>