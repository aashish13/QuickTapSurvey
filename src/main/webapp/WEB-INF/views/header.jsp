<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap.css"
	rel="stylesheet" />
<link type="text/css"
	href="${pageContext.request.contextPath}/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" />
<link type="text/css"
	href="${pageContext.request.contextPath}/css/admin/style.css"
	rel="stylesheet" />
<link type="text/css"
	href="${pageContext.request.contextPath}/css/admin/style-responsive.css"
	rel="stylesheet" />

</head>
<body>

	<section id="container"> <header class="header black-bg">
	<div class="sidebar-toggle-box">
		<div class="fa fa-bars tooltips" data-placement="right"
			data-original-title="Toggle Navigation"></div>
	</div>
	<!--logo start--> <a href="/QuickTapSurvey/" class="logo"><b>Capstone</b></a>
	<!--logo end-->
	<div class="top-menu">
		<ul class="nav pull-right top-menu">
			<li><a class="logout" href="/QuickTapSurvey/login">Logout</a></li>
		</ul>
	</div>
	</header> <!--header end--> <!--sidebar start--> <aside>
	<div id="sidebar" class="nav-collapse ">
		<!-- sidebar menu start-->
		<ul class="sidebar-menu" id="nav-accordion">

			<p class="centered">
				<a href=""><img
					src="${pageContext.request.contextPath}/img/pc.png"
					class="img-circle" width="60"></a>
			</p>
			<h5 class="centered">User Name</h5>

			<li class="mt"><a href=""> <i class="fa fa-dashboard"></i> <span>Dashboard</span>
			</a></li>

			<li class="sub-menu"><a href="/QuickTapSurvey/survey"> <i
					class="fa fa-desktop"></i> <span>Surveys</span>
			</a></li>

			<!-- <li class="sub-menu"><a href="/QuickTapSurvey/response"> <i
					class=" fa fa-bar-chart-o"></i>Responses
			</a></li> -->
		</ul>
		<!-- sidebar menu end-->
	</div>
	</aside>
</body>

</html>
