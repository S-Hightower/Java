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
<title>Dojo Info</title>
</head>
<body>
	<div class="container mt-5">
	<h1>${dojo.name} Location Ninjas</h1>
		<table class="table table-hover table-bordered align-middle">
   			<thead class="table-light">
   				<tr>
   					<th> First Name </th>
   					<th> Last Name </th>
   					<th> Age </th>
   				</tr>
   			</thead>			
			<c:forEach var="ninja" items="${dojo.ninjas}"> 
				<tr>
					<td>${ninja.firstName}</td>
					<td>${ninja.lastName} </td>
					<td>${ninja.age}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>