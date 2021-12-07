<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>Send an Omikuji</title>
</head>
<body>
	<div class="container-md">
		<h1 style="text-align: center">Send an Omikuji!</h1>
		<form action='/build' method='POST'>
			<label for="number" class="form-label">Pick any number from 5 to 25:</label>
	  		<select name="number" class="ms-2">
	  			<% for (int num = 5; num <= 25; num ++) { %>
	  			<option value="<%= num %>"> <%= num %> </option> 
	  			<% } %>
	  		</select>
			<p>
            	<input class="form-control form-control-lg" type="text" name="city" id="" placeholder="Enter a city:">
            </p>
            <p>
            	<input class="form-control form-control-lg" type="text" name="name" id="" placeholder="Enter the name of any real person:">
            </p>
            <p>
            	<input class="form-control form-control-lg" type="text" name="job" id="" placeholder="Enter the name of any profession or hobby:">
            </p>
            <p>
            	<input class="form-control form-control-lg" type="text" name="animal" id="" placeholder="Enter the name of any living thing:">
            </p>
            <p>
            	<textarea class="form-control" name="compliment" id="" placeholder="Say something nice about someone:"></textarea>
            </p>
            <h3>Send and show a friend!</h3>
            <button type="submit" class="btn btn-outline-primary">Send</button>
    	</form>
	</div>
</body>
</html>