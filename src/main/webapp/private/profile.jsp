<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:template>
	<jsp:attribute name="header">
      <%@include file="/components/navbar.jsp"%>
    </jsp:attribute>
	<jsp:attribute name="sidenav">
    <%@include file="/components/list.jsp"%>
    </jsp:attribute>
	<jsp:attribute name="footer">
      <p>Footer</p>
    </jsp:attribute>
	<jsp:body>
		<h1>Profile</h1>
        
    </jsp:body>
</t:template>