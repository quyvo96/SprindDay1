<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${param['check'] eq 'Show'}">
		<h1>Quản lý tin tức</h1>
		
		<c:if test="${not empty newsList}">
			<ul>
				<c:forEach items="${newsList}" var="news">
					<li>${news.id}-${news.title}</li>
				</c:forEach>


			</ul>
		</c:if>
	</c:if>
</body>
</html>