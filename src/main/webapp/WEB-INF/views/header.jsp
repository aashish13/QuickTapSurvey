<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">
		var contextPath = '${pageContext.request.contextPath}';
	</script>
<link type="text/css"
	href="${pageContext.request.contextPath}/other/css/bootstrap.css"
	rel="stylesheet" />
<link type="text/css"
	href="${pageContext.request.contextPath}/other/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" />
<link type="text/css"
	href="${pageContext.request.contextPath}/other/css/admin/style.css"
	rel="stylesheet" />
<link type="text/css"
	href="${pageContext.request.contextPath}/other/css/admin/style-responsive.css"
	rel="stylesheet" />

</head>
<body>

	<!-- <section id="container"> <header class="header black-bg">
	<div class="sidebar-toggle-box">
		<div class="fa fa-bars tooltips" data-placement="right"
			data-original-title="Toggle Navigation"></div>
	</div>
	logo start <a href="/QuickTapSurvey/" class="logo"><b>Capstone</b></a>
	logo end
	<div class="top-menu">
		<ul class="nav pull-right top-menu">
			<li><a class="logout" href="/QuickTapSurvey/login">Logout</a></li>
		</ul>
	</div>
	</header> </section> --><!--header end--> <!--sidebar start--> <aside>
	<div id="sidebar" class="nav-collapse ">
		<!-- sidebar menu start-->
		<ul class="sidebar-menu" id="nav-accordion">

			<p class="centered">
				<a href="${pageContext.request.contextPath}"><img
					src="${pageContext.request.contextPath}/other/img/pc.png"
					class="img-circle" width="60"></a>
			</p>
			<h5 class="centered">Aashish</h5>

			<li class="mt"><a href="${pageContext.request.contextPath}/survey"> <i class="fa fa-dashboard"></i> <span><b>Dashboard</b></span>
			</a></li>

			<li class="sub-menu"><a href="${pageContext.request.contextPath}/survey"> <i
					class="fa fa-desktop"></i> <span><b>Surveys</b></span>
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