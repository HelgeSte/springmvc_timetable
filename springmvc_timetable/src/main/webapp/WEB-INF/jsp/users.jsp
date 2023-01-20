<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Users</title>
    <link rel="stylesheet" href="style.css" />
</head>
<body>
    	<header id="home" class="header">
		<nav class="nav" role="navigation">
			<div class="container nav-elements">
				<div class="branding">
					<a href="#home"><img src="images/timetable.png"
						alt="Timetable logo"></a>
				</div>
				<!-- branding -->
				<ul class="navbar">
				    <li><a href="#">home</a></li>
					<li><a href="#">users</a></li>
					<li><a href="#">customers</a></li>
					<li><a href="#">projects</a></li>

				</ul>
				<!-- navbar -->
			</div>
			<!-- container nav-elements -->
		</nav>

		<!-- <div class="container tagline">
    <h1 class="headline">Our Mission</h1>
    <p>We support and encourage <em>active and healthy</em> lifestyles, by offering <em>ethically sourced</em> and <em>eco-friendly</em> nutritional products for the <em>performance-driven</em> athlete.</p>
  </div>container tagline -->
	</header>
    <h1>Add a user</h1>
    <form:form>
        <label>First name:</label><form.input path="firstName" type="text" />
        <label>Last name:</label><form.input path="lastName" type="text" />
        <label>E-mail</label><form.input path="email" type="text" />
        <input type="submit" value="ADD USER" id="submit"/>
    </form:form>

</body>
</html>