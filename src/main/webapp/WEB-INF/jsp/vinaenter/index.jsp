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

		<h1>VinaEnter</h1>
		
		<c:if test="${not empty arPlaceList}">
			<ul>
				<c:forEach items="${arPlaceList}" var="arPlace">
					<li>${arPlace.id}-${arPlace.place}-${arPlace.date_create}-${arPlace.student}</li>
				</c:forEach>


			</ul>
		</c:if>
</body>
</html>