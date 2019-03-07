<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
<title>Microservices</title>
</head>

<body>
	<center>
		<h1 style="color: red">
			<u>Microservices with Spring Boot</u>
		</h1>
	</center>
	<div class="container">
		<div class="row">
			<h2>User Details</h2>
			<ul>
				<li><strong>Profile ID:</strong> ${profile.userId}</li>
				<li><strong>Profile Name:</strong> ${profile.name}</li>
			</ul>
		</div>
	</div>
</body>
</html>