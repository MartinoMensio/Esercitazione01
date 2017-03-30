<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:template>
	<jsp:attribute name="header">
      <%@include file="components/navbar.jsp"%>
    </jsp:attribute>
	<jsp:attribute name="sidenav">
    <%@include file="components/list.jsp"%>
    </jsp:attribute>
	<jsp:attribute name="footer">
      <div id="pagefooter" class="row">
			<%@include file="components/footer.jsp"%>
		</div>
    </jsp:attribute>
	<jsp:body>
	<form action="login/do" method="POST" enctype="application/x-www-form-urlencoded">
		<div class="form-group" style="padding-top: 100px;">
			<div class="row">
	  			<div class="col-sm-4">
					<label for="username">Username:</label>
					<input type="text" name="username" class="form-control"/>
				</div>
			</div>
		</div>
		<div class="form-group">
			<div class="row">
	  			<div class="col-sm-4">
					<label for="password">Password:</label>
					<input type="password" name="password" class="form-control"/>
				</div>
			</div>
		</div>
		<button type="submit">Submit</button>
       </form> 
    </jsp:body>
</t:template>

