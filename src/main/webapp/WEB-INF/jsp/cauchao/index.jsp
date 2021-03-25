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
	<div>In Câu Chào</div>
	<hr/>
	<div>
		<form action="<%=request.getContextPath() %>/cauchao/index" method="post">
			<div>
				<label>Nhập Tên :</label>
				<input type="text" value="" id="name" name="name" placeholder="nhập tên"/>
			
			</div>
			<div>
				<label>Câu Chào:</label>
				<span>${name}</span>
			</div>
			<div>
				<span>qqq ${abc}</span>
				<input type="submit" value="In Câu Chào" />
			
			</div>
		</form>
	</div>
</body>
</html>