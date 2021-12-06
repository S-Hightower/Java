<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>Fruity Loops</title>
</head>
<body>
	<div class=container>
	<h1>Fruit Store</h1>
	<table class="table table-striped table table-bordered table table-sm">
		<thead>
		    <tr class="table-info">
		      <th scope="col">Name</th>
		      <th scope="col">Price</th>
		    </tr>
		</thead>
	    <tbody>
		  	<c:forEach var="fruits" items="${fruitsFromItemController}">
			<tr>
    			<td><c:out value="${fruits.name}"/></td>
    			<td>$<c:out value="${fruits.price}"/></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>