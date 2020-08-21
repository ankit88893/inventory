<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<title>Employee Registeration</title>
</head>
<body>

<h1>Employee Registeration submits post request</h1>

<form:form method="post" action="/processpostregister" modelAttribute="employee">

<div>


<label>Name</label>
<form:input path="name"/>

</div>

<div>

<label>Salary</label>

<form:input path="salary"/>

</div>


<div>

<label>Age</label>
<form:input path="age"/>

</div>


<div>
<label>Password</label>
<form:input path="password"/>

</div>



<input type="submit" value="Create Employee">

</form:form>

</body>
</html>