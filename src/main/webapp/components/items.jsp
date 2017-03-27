<%@ page language="java" import="it.polito.ai.businesslogic.*, java.util.*"%>
<div>
<%
	Set<TravelDocument> travelDocuments = (Set<TravelDocument>) request.getServletContext().getAttribute("travelDocuments");
	for (TravelDocument t : travelDocuments) {
%>
<p><%=t.getName()%></p>
<%
	}
%>
</div>