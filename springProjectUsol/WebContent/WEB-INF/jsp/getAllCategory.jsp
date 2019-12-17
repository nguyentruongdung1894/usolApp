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
			<td colspan="2"><a href="insertCategory.htm">Insert Category</a></td>
		</tr>
		<c:forEach var="list" items="${sessionScope.categoryList}">
			<tr>
				<td>${list.categoryID}</td>
				<td>${list.categoryName}</td>
				<td>${list.description}</td>
				<td>${list.status}</td>
				<td><a href="updateCategory.htm?categoryID=${list.categoryID}">Edit</a></td>
				<td><a href="deleteCategory.htm?categoryID=${list.categoryID}">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>