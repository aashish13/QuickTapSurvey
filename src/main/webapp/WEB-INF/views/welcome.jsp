<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>QuickTapSurvey Data Visualization</title>
<link type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet" />
<link type="text/css"
	href="${pageContext.request.contextPath}/css/welcome-page.css"
	rel="stylesheet" />
<link type="text/css"
	href="${pageContext.request.contextPath}/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" />
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"
	type="text/javascript"></script>
<link
	href="http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic"
	rel="stylesheet" type="text/css">

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
					<li><a href="">QuickTapSurvey Data Visaulization</a></li>
					<li></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>
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
	<!-- Header -->
	<div class="intro-header">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="intro-message">
						<h1>Data Visualization</h1>
						<h3>Telling the stories behind the numbers</h3>
						<hr class="intro-divider">
						<ul class="list-inline intro-login-button">
							<li><a href="/QuickTapSurvey/login"
								class="btn btn-default btn-lg"><i class="fa fa-sign-in "></i>
									<span class="login-text"> Login</span></a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="content-section-1">
		<div class="container">
			<div class="row">
				<div class="col-lg-5 col-sm-6">
					<hr class="section-heading-spacer">
					<div class="clearfix"></div>
					<h2 class="section-heading">Turning data into information,
						&amp; information into insight</h2>
					<p class="lead">Helping you understand the significance of your
						data by placing it in a visual context.</p>
				</div>
				<div class="col-lg-5 col-lg-offset-2 col-sm-6">
					<img class="img-responsive"
						src="${pageContext.request.contextPath}/img/ipad.png" alt="">
				</div>
			</div>
		</div>
	</div>
	<div class="content-section-2">
		<div class="container">
			<div class="row">
				<div class="col-lg-5 col-lg-offset-1 col-sm-push-6  col-sm-6">
					<hr class="section-heading-spacer">
					<div class="clearfix"></div>
					<h2 class="section-heading">Going beyond Excel</h2>
					<p class="lead">Presentation of data in a pictorial or
						graphical format such as charts and maps helps to understand
						information more easily and quickly. !</p>
				</div>
				<div class="col-lg-5 col-sm-pull-6  col-sm-6">
					<img class="img-responsive"
						src="${pageContext.request.contextPath}/img/cup.png" alt="">
				</div>
			</div>
		</div>
	</div>
	<div class="content-section-a">
		<div class="container">
			<div class="row">
				<div class="col-lg-5 col-sm-6">
					<hr class="section-heading-spacer">
					<div class="clearfix"></div>
					<h2 class="section-heading">Communicating information clearly
						and efficiently to users</h2>
					<p class="lead">Patterns, trends and correlations that might go
						undetected in text-based data can be exposed and recognized easier
						with data visualization software.</p>
				</div>
				<div class="col-lg-5 col-lg-offset-2 col-sm-6">
					<img class="img-responsive"
						src="${pageContext.request.contextPath}/img/phones.png" alt="">
				</div>
			</div>
		</div>	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>
