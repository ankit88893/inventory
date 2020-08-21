<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>All Items Details</title>
</head>
<body>

<h1>Listing all Items</h1>

<c:forEach items="${items}"  var="item">

Item Id is <c:out value="${item.id}"  /><br>
Item Name is <c:out value="${item.name}"  /><br>

<br>
</c:forEach>
	<a href="/logout"> Log out </a>
</body>
</html>