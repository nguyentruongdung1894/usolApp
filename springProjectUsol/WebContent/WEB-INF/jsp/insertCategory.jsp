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
	<form:form action="insertCategorySucces.htm" method="post">
		<input type="text" name="categoryName" />
		<input type="text" name="description" />
		<input type="text" name="status" />
		<input type="submit" value="Insert" />
	</form:form>
</body>
</html>