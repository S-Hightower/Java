<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Counter Be Counting</title>
</head>
<body>
	<h1>You have visited the previous page <c:out value="${countToShow}"/> times!</h1>
	<a href="/">Return to the previous page!</a>
</body>
</html>