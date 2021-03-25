<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List News</title>
</head>
<body>
	<style>
.header {
	background: #0000f;
	padding: 10px;
}
</style>
	<div class="header">

		<h4>Username :${username}</h4>
		<h4>Full name:${fullname}</h4>
	</div>
	<h1>News</h1>
	<%-- <c:if test="${not empty news}">
	<ul>
		<li>${news.id}-${news.title}</li>
	</ul>
	</c:if> --%>

	<c:choose>
		<c:when test="${not empty news}">
			<ul>
				<li>${news.id}-${news.title}</li>
			</ul>
		</c:when>
		
		<c:otherwise>
			<p>Không có tin tức</p>
		</c:otherwise>

	</c:choose>
</body>
</html>