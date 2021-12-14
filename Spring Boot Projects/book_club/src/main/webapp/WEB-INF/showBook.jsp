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
<title>Book Information</title>
</head>
<body>
	<div class="container mt-5">
		<div class="d-flex align-items-center">
        <div class="col-sm-8">
			<h1 class="fw-bold text-primary">${book.title}</h1>
		</div>
		<div class="col-sm-4">
			<a href="/dashboard" class="btn btn-outline-warning">Back to the shelves!</a>
		</div>
	</div>
	<div class="d-flex align-items-center mt-4">
		<h4>${book.user.userName} read ${book.title} by ${book.authorName}.</h4>
	</div>
	<div class="mt-2">
		<h5 class="text-decoration-underline">Here are ${book.user.userName}'s thoughts:</h5>
	</div>
	<div class="mt-5 text-center">
		<h5>${book.myThoughts}</h5>
	</div>
	</div>
</body>
</html>