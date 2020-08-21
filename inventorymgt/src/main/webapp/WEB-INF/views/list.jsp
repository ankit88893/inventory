<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>All Employees</title>
</head>
<body>

<h1>Listing all employees</h1>

<c:forEach items="${employees}"  var="employee">

<c:out value="${employee.id}"  />

<c:out value="${employee.name}"  />
<c:out value="${employee.salary}"  />
<c:out value="${employee.age}"  />

<br>
</c:forEach>


<a href="/logout"> Log out </a>

</body>
</html>