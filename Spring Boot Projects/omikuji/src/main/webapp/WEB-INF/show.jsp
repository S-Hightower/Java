<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>View Your Omikuji</title>
</head>
<body>
	<div class="container">
		<div class="col-6" style="text-align: center">
			<div class="card text-dark bg-info" style="width: 25rem;">
				<h2 class="card-header">Here's Your Omikuji!</h2>
				<div class="card-body">
					<p class="card-text"> In ${number} years, you will live in ${city} with ${name} as your roommate, selling ${job} for a living.</p>
					<p class="card-text">The next time you see a ${animal}, you will have good luck.</p>
					<p class="card-text">Also, ${compliment}.</p>
					<a href="/omikuji" class="card-link text-dark">Go Back!</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>