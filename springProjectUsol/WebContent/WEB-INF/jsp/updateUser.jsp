<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Product</title>
</head>
<body>
	<form:form action="updateUserSucces.htm" method="post"
		modelAttribute="user">
		<form:input path="userID" readonly="true" />
		<form:input path="userName" />
		<form:input path="password" />
		<form:input path="role" />
		<input type="submit" value="Update" />
		<input type="button" value="Back" onclick="history.go(-1)" />
	</form:form>
</body>
</html>