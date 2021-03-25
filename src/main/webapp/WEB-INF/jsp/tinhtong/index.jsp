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
	<div>Tính Tổng</div>
	<hr/>
	<div>
		<form action="<%=request.getContextPath() %>/tinh-tong/index" method="post">
			<div>
				<label>Dãy số :</label>
				<input type="text" value="" id="name" name="number" placeholder="nhập dãy số"/>
			
			</div>
			<div>
				<label>Tổng :</label>
				<input type="text" value="${sum}" />
			</div>
			<div>
				<input type="submit" value="Tính Tổng" />
			
			</div>
			<p style="color: red">${error}</p>
		</form>
	</div>
</body>
</html>