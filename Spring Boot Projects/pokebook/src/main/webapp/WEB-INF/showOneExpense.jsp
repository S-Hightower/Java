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
<title>Expense Info</title>
</head>
<body>
	<div class="container mt-5">
		<div class="d-flex align-items-center">
        	<div class="col-sm-8">
				<h1>Expense Details</h1>
			</div>
			<div class="col-sm-4">
				<a href="/dashboard" class="btn btn-outline-success">Dashboard</a>
			</div>
		</div>
		<table class="table table-bordered align-middle">
   			<thead class="table-light">
   				<tr>
   					<th> Expense </th>
   					<th> Vendor </th>
   					<th> Amount </th>
   					<th> Description </th>
   				</tr>
   			</thead>
			<tr>
				<td>${expense.name }</td>
				<td>${expense.vendor }</td>
				<td>${expense.amount} </td>
				<td>${expense.description }</td>
			</tr>
		</table>	
	</div>
</body>
</html>