<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<title>Create a New Ninja</title>
</head>
<body>
	<div class="container mt-5">
	<h1>Add a New Ninja</h1>
	<form:form action="/ninjas" method="post" modelAttribute="newNinja" class="form">
		<form:label path="dojo" class="form-label">Select Dojo:</form:label>
		<form:select path="dojo" class="form-select">
	        <c:forEach var="eachDojo" items="${dojos}">
	            <form:option value="${eachDojo.id}" path="dojo">${eachDojo.name}</form:option>
	        </c:forEach>
    	</form:select>
    	<div></div>
	   		<form:label path="firstName" class="form-label"> First Name </form:label>
	   		<form:errors path="firstName" class="text-danger" />	
	   		<form:input path="firstName" type="text" class="form-control" />
	   		
	
	   		<form:label path="lastName" class="form-label">Last Name</form:label>
	   		<form:errors path="lastName" class="text-danger" />	
	   		<form:input path="lastName" type="text" class="form-control" />
	   		
	   		
	   		<form:label path="age" class="form-label">Age</form:label>
	   		<form:errors path="age" class="text-danger" />	
	   		<form:input path="age" type="number" class="form-control" />
		<button class="btn btn-outline-primary"> Submit</button>
		</form:form>
	</div>
</body>
</html>