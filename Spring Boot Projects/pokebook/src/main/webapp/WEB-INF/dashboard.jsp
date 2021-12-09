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
<title>Expense Dashboard</title>
</head>
<body>
	<div class="container mt-5">
	<h1>PokeBook</h1>
		<table class="table table-hover table-bordered align-middle">
   			<thead class="table-light">
   				<tr>
   					<th> Expense </th>
   					<th> Vendor </th>
   					<th> Amount </th>
   					<th> Actions </th>
   				</tr>
   			</thead>			
			<c:forEach var="expense" items="${expenses}"> 
				<tr>
					<td><a href="/expenses/${expense.id}">${expense.name}</a></td>
					<td>${expense.vendor} </td>
					<td>${expense.amount}</td>
					<td>
						<div class="btn-group" role="group">
							<a href="/expenses/${expense.id}/edit" class="btn btn-outline-info">Edit</a>
							<form action="/expenses/${expense.id}/delete" method="post">
							<input type="hidden" name="_method" value="delete" />
							<button class="btn btn-outline-danger"> Delete</button>
							</form>
						</div>
					</td>
				</tr>
			</c:forEach>
		</table>
		<h2>Add an expense:</h2>
		<form:form action="/dashboard" method="post" modelAttribute="newExpense" class="form">
	   		<form:label path="name" class="form-label"> Expense </form:label>
	   		<form:errors path="name" class="text-danger" />	
	   		<form:input path="name" type="text" class="form-control" />
	   		
	
	   		<form:label path="vendor" class="form-label">Vendor</form:label>
	   		<form:errors path="vendor" class="text-danger" />	
	   		<form:input path="vendor" type="text" class="form-control" />
	   		
	   		
	   		<form:label path="amount" class="form-label">Amount</form:label>
	   		<form:errors path="amount" class="text-danger" />	
	   		<form:input path="amount" type="double" class="form-control" />
	   		
	   		<form:label path="description" class="form-label">Description</form:label>
   			<form:errors path="description" class="text-danger" />	
   			<form:textarea path="description" class="form-control"></form:textarea>
	   		
		<button class="btn btn-outline-primary"> Submit</button>
		</form:form>	
	</div>
</body>
</html>