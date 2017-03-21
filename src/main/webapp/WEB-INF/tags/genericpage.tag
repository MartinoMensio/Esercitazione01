<%@ tag language="java" pageEncoding="UTF-8"%>
<%@attribute name="header" fragment="true"%>
<%@attribute name="footer" fragment="true"%>
<!DOCTYPE html>
<html>
<body>
	<div id="pageheader">
		<jsp:invoke fragment="header" />
	</div>
	<div id="body">
		<div id="sidenav">
			<jsp:invoke fragment="sidenav" />
		</div>
		<jsp:doBody />
	</div>
	<div id="pagefooter">
		<jsp:invoke fragment="footer" />
	</div>
</body>
</html>