<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customers</title>
    <link rel="stylesheet" href="css/style.css" />
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
                        <li><a href="/home">home</a></li>
                        <li><a href="/users">users</a></li>
                        <li><a href="/customers">customers</a></li>
                        <li><a href="/projects">projects</a></li>
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
    <h1>Add a customer</h1>
    <form:form method="post" action="/createcustomer" modelAttribute="newcustomer">
        <label>Customer name:</label><form:input path="customerName" type="text" />
        <label>Contact name:</label><form:input path="contactName" type="text" />
        <label>Contact E-mail</label><form:input path="contactEmail" type="text" />
        <input type="submit" value="ADD CUSTOMER" id="submit" />
    </form:form>
    <div><a href="/customers">Cancel</a></div>

</body>
</html>