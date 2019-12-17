<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="insertUserSucces.htm" method="post">
		<input type="text" name="userName" />
		<input type="text" name="password" />
		<input type="text" name="role" />
		<input type="submit" value="Insert" />
	</form:form>
</body>
</html>