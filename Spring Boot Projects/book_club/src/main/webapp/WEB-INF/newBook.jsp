<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<title>Add a New Book</title>
</head>
<body>
	<div class="container mt-5">
		<div class="d-flex align-items-center">
        <div class="col-sm-8">
			<h1>Add a Book to Your Shelf!</h1>
		</div>
		<div class="col-sm-4">
			<a href="/dashboard" class="btn btn-outline-warning">Back to the shelves!</a>
		</div>
		</div>
	<form:form action="/books/new" method="post" modelAttribute="newBook" class="form">
    	<div></div>
	   		<form:label path="title" class="form-label">Title:</form:label>
	   		<form:errors path="title" class="text-danger" />	
	   		<form:input path="title" type="text" class="form-control" />
	   		
	
	   		<form:label path="authorName" class="form-label">Author:</form:label>
	   		<form:errors path="authorName" class="text-danger" />	
	   		<form:input path="authorName" type="text" class="form-control" />
	   		
	   		
	   		<form:label path="myThoughts" class="form-label">My Thoughts:</form:label>
   			<form:errors path="myThoughts" class="text-danger" />	
   			<form:textarea path="myThoughts" class="form-control"></form:textarea>
		<button class="btn btn-outline-primary"> Submit</button>
		</form:form>
	
	
	</div>
</body>
</html>