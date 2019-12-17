<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<body>
	<h2 style="text-align: center; margin-top: 150px"></h2>
	<form action="login.htm" method="post">
		<div class="input-container">
			<i class="fa fa-user icon"></i> 
			<input class="input-field"
				type="text" placeholder="Username" name="userName" required="required">
		</div>
		<div class="input-container">
			<i class="fa fa-key icon"></i> 
			<input class="input-field"
				type="password" placeholder="Password" name="password" required="required">
		</div>
		<input type="submit" value="Login" class="submitInput" />
	</form>
</body>
</html>