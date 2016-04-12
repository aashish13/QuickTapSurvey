<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js">
<!--<![endif]-->
<head>
<!-- Basic Page Needs
    ================================================== -->
<meta charset="utf-8">
<title>QuicktapSurvey Capstone</title>
<meta name="description" content="">
<!-- Mobile Specific Metas
    ================================================== -->
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
<!-- CSS
         ================================================== -->
<!-- Bootstrap -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<!-- FontAwesome -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/font-awesome.min.css" />
<!-- Animation -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/animate.css" />
<!-- Owl Carousel -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/owl.carousel.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/owl.theme.css" />
<!-- Pretty Photo -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/prettyPhoto.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/flexslider.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/red.css" />

<!-- Template styles-->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/custom.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/responsive.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/jquery.fancybox.css?v=2.1.5"
	type="text/css" media="screen" />

<link rel="stylesheet" type="text/css"
	href="http://visapi-gadgets.googlecode.com/svn/trunk/wordcloud/wc.css" />


<script src="https://maps.googleapis.com/maps/api/js?v=3.exp&libraries=visualization"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/login/css/style.css">

</head>
<body data-spy="scroll" data-target=".navbar-fixed-top">

	<!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
	<header id="header" class="navbar-fixed-top navbar-inverse video-menu"
		role="banner">
		<div class="container">
			<!-- <div class="row"> -->
			<div class="navbar-header " style="margin-left: -50px;">
				<div class="sidebar-toggle-box">
					<div class="fa fa-bars tooltips" data-placement="right"
						data-original-title="Toggle Navigation"></div>
				</div>
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/QuickTapSurvey"> <img
					src="${pageContext.request.contextPath}/img/logo3.png" alt=""
					class="img-responsive">

				</a>
			</div>
			<!--Navbar header End-->
			<nav class="collapse navbar-collapse navigation"
				id="bs-example-navbar-collapse-1" role="navigation">
				<ul class="nav navbar-nav navbar-right ">
					<li class="active"><a href="/QuickTapSurvey"
						class="page-scroll" style="font-size: 18px; font-weight: bolder;"><b>Home</b>
					</a></li>

					<li><a class="page-scroll"
						style="font-size: 15px; font-weight: bolder;">Aashish</a></li>
				</ul>
			</nav>
		</div>
		<!-- /.container-fluid -->
	</header>
	<%@ include file="/WEB-INF/views/header.jsp"%>
	<section id="main-content">
		<section class="wrapper">

			<h3 style="text-align: center; color: #ee3b24; margin-top: 20px;">
				<b>Data Visualization</b>

				<!-- Code to show all questions for this survey -->
				<br /> <br />
			</h3>
			<form:select path="questions" id="all-question">
				<form:option value="-- Select a question --"></form:option>>
 					<form:options items="${questions}" />
			</form:select>
			<br/>
			<br/>
			<!-- page start-->
			<div
				style="margin-left: 200px; margin-top: 1px; box-shadow: 0px 0px 0px 0px #888888; padding-right: 60px">
				<div id="chart_info" style="float: right; color: #000000"></div>
				<div id="map" style="height: 500px; width: 800px;">
			</div>
			<!-- page end-->
		</section>
	</section>
	<jsp:include page="footer.jsp" />
	<script src="${pageContext.request.contextPath}/js/heatmapvisualize.js" type="text/javascript"></script>
	<script type="text/javascript">
		var chartType = '${chartType}';
	</script>
</body>
</html>