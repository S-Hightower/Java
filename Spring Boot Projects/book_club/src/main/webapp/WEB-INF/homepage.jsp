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
<title>Homepage</title>
</head>
<body>
	<div class="container mt-5">
	<div class="d-flex align-items-center">
        <div class="col-sm-8">
			<h1>Welcome ${userName}!</h1>
		</div>
		<div class="col-sm-4">
			<a href="/logout" class="btn btn-outline-danger">Logout</a>
		</div>
	</div>
	<div class="d-flex align-items-center">
        <div class="col-sm-8">
			<h4>Books from everyone's shelves:</h4>
		</div>
		<div class="col-sm-4">
			<a href="/books/new" class="btn btn-outline-success">Add Book to Shelf</a>
		</div>
	</div>
	<table class="table table-hover table-bordered align-middle">
   			<thead class="table-light">
   				<tr>
   					<th> Title: </th>
   					<th> Author Name: </th>
   					<th> Posted By: </th>
   				</tr>
   			</thead>			
			<c:forEach var="book" items="${books}"> 
				<tr>
					<td><a href="/books/${book.id}">${book.title}</a></td>
					<td>${book.authorName} </td>
					<td>${book.user.getUserName()}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>