<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
</tr>

<c:forEach var="student" items="${students}">
<tr>
<td>${student.getId()}</td>
<td>${student.getName()}</td>
<td>${student.getEmail()}</td>


</tr>
</c:forEach>
</table>
</body>
</html>