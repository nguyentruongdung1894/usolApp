<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center">
		<tr>
			<td>productId</td>
			<td>productName</td>
			<td>productProvider</td>
			<td>productPrice</td>
			<td colspan="2"><a href="insertUser.htm">Insert User</a></td>
		</tr>
		<c:forEach var="list" items="${sessionScope.userList}">
			<tr>
				<td>${list.userID}</td>
				<td>${list.userName}</td>
				<td>${list.password}</td>
				<td>${list.role}</td>
				<td><a href="updateUser.htm?userID=${list.userID}">Edit</a></td>
				<td><a href="deleteUser.htm?userID=${list.userID}">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>