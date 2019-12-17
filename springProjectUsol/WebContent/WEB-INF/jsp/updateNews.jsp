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
	<form:form action="updateNewsSucces.htm" method="post"
		modelAttribute="news">
		<form:input path="newsID" readonly="true" />
		<form:input path="newsName" />
		<form:input path="description" />
		<form:input path="detail" />
		<form:input path="image" />
		<form:input path="date" />
		<form:input path="categoryID" />
		<form:input path="userID" />
		<form:input path="status" />
		<input type="submit" value="Update" />
		<input type="button" value="Back" onclick="history.go(-1)" />
	</form:form>
</body>
</html>