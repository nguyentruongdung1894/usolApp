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
			<td>NewsID</td>
			<td>NewsName</td>
			<td>Description</td>
			<td>Detail</td>
			<td>Image</td>
			<td>Date</td>
			<td>CategoryID</td>
			<td>UserID</td>
			<td>Status</td>
			<td colspan="2"><a href="insertNews.htm">Insert News</a></td>
		</tr>
		<c:forEach var="list" items="${sessionScope.newsList}">
			<tr>
				<td>${list.newsID}</td>
				<td>${list.newsName}</td>
				<td>${list.description}</td>
				<td>${list.detail}</td>
				<td>${list.image}</td>
				<td>${list.date}</td>
				<td>${list.categoryID}</td>
				<td>${list.userID}</td>
				<td>${list.status}</td>
				<td><a href="updateNews.htm?newsID=${list.newsID}">Edit</a></td>
				<td><a href="deleteNews.htm?newsID=${list.newsID}">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>