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
			<h2>User Profiles</h2>
			<ul>
				<c:forEach items="${profiles}" var="profile">
					<li><a href="userDetails?id=${profile.userId}">${profile.name}</a></li>
				</c:forEach>
			</ul>
		</div>
	</div>
</body>
</html>