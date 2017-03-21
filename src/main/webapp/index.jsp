<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:template>
	<jsp:attribute name="header">
      <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Page 1</a></li>
      <li><a href="#">Page 2</a></li>
      <li><a href="#">Page 3</a></li>
    </ul>
    </jsp:attribute>
	<jsp:attribute name="sidenav">
    <h1>Sidenav</h1>
    </jsp:attribute>
	<jsp:attribute name="footer">
      <p >Footer</p>
    </jsp:attribute>
	<jsp:body>
		<h1>Home page</h1>
        <p>Hi I'm the heart of the message</p>
        
    </jsp:body>
</t:template>