<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<!--  <% if(request.getAttribute("error") != null) { %>
		<h1> <font color="red"> <%= request.getAttribute("error")%></font></h1>
	<% } %>  -->
	<c:if  test="${not empty error}">
		<h1> <font color="red"> ${error}</font></h1>
	</c:if>
	<form action="login" method="post">
		Username : <input type="text" name="uname" />
		Password : <input type="password" name="upassword" />
		<input type="submit" name="login" value="Login"/>
	</form>
</body>
</html>