<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC CRUD</title>
</head>
<body>
<h1>${save}</h1>
<a href ="saveStudent" >Create student</a>
<a href ="viewallstudents">View all Students</a>
<td>
<a href="delete?id=${Student} >Delete</a>
</td>
</body>
</html>