<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<html>
<head>
<link type="text/css"
	href="${pageContext.request.contextPath}/css/panel.css"
	rel="stylesheet" />
<link type="text/css"
	href="${pageContext.request.contextPath}/css/login.css"
	rel="stylesheet" />
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/panel.min.js"
	type="text/javascript"></script>
<link
	href="http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic"
	rel="stylesheet" type="text/css">
<link type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet" />
<link type="text/css"
	href="${pageContext.request.contextPath}/css/welcome-page.css"
	rel="stylesheet" />
<link type="text/css"
	href="${pageContext.request.contextPath}/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" />

<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"
	type="text/javascript"></script>
<link
	href="http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic"
	rel="stylesheet" type="text/css">
<title>Log In to Your Account | QuickTapSurvey</title>
</head>
<body>


	<nav class="navbar navbar-default navbar-fixed-top topnav"
		role="navigation">
		<div class="container topnav">

			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand topnav" href="#">QuickTap Survey</a>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li></li>
					<li><a href=""> Capstone-Data Visaulization</a></li>
					<li></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>


	<div class="container">

		<h3 class="demo-panel-title">&nbsp;</h3>
		<div class="login">
			<div class="login-screen">
				<div class="login-icon">
					<img src="img/pc2.jpg" alt="Welcome " />
					<h4>
						Welcome to <small>Data Visaulization</small>
					</h4>
				</div>

				<div class="login-form">
					<div class="form-group">
						<form:form method="post" action="login" modelAttribute="login">
							<form:errors path="username" style="color:red" />
							<br />
							<br />
							<form:input type="text" class="form-control login-field"
								placeholder="Enter your username" path="username" />
							<br />
							<button type="submit" class="btn btn-primary btn-lg btn-block">Log
								in</button>

							<a class="login-link"
								href="https://www.quicktapsurvey.com/public/signup/?sourcePage=organic-login&rt=fbt"
								target="_blank"> Sign Up</a>

						</form:form>

					</div>
				</div>
			</div>
			<div class="row"></div>
		</div>
		<jsp:include page="footer.jsp" />
</body>
</html>