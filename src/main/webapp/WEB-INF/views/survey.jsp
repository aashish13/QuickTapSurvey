
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<script type="text/javascript"
	src="http://maps.google.com/maps/api/js?sensor=false"></script>
<link href="http://fonts.googleapis.com/css?family=Lato:400,300"
	rel='stylesheet' type='text/css'>
<link href="http://fonts.googleapis.com/css?family=Raleway:400,300,500"
	rel='stylesheet' type='text/css'>
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
			<div class="navbar-header " style="
    margin-left: -50px;
">
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

					<li><a
						class="page-scroll" style="font-size: 15px; font-weight: bolder;">Aashish</a>
					</li>
				</ul>
			</nav>
		</div>
		<!-- /.container-fluid -->
	</header>

	<%@ include file="/WEB-INF/views/header.jsp"%>

	<section id="main-content">

		<section class="wrapper" style="padding-bottom: 80px;">

			<h3 style="
    text-align: center;
    color: #ee3b24;
    margin-top: 20px;
">
				<b> Active Surveys</b>
				
			</h3>


			<div class="row">
				<div class="col-md-12 mt">
					<div class="content-panel">
						<table class="table table-hover">
							<h4>
								<i class="fa fa-angle-right"></i> Survey List
								<form method="get" action="syncsurvey" style="float: right;">
									<button type="submit" class="btn btn-round btn-primary"
										style="width: 95px; margin-left: 830px;">
										<i class="fa fa-cog"></i> Sync All
									</button>
								</form>
							</h4>

							<br>
							<thead style="background: #eee; color:black;">
								<tr>
									<th><b>#</b></th>
									<th><b>Survey Id</b></th>
									<th><b>Survey Name</b></th>
									<th style="text-align: center;"><b>Responses</b></th>
									<th><b>Actions</b></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="survey" items="${surveys}">
									<tr>
										<td>${survey.id}</td>
										<td>${survey.surveyId}</td>
										<td>${survey.name}</td>
										<td style="text-align: center;">${survey.totalResponses}</td>
										<td>
											<div class="dropdown">
												<button data-toggle="dropdown"
													class="btn btn-primary dropdown-toggle">
													Action <span class="caret"></span>
												</button>
												<ul class="dropdown-menu"
													style="background-color: #294D6D; text-align: center; min-width: 80px; border-color: black; margin: 0 -10px -130px 0; border: 1px solid rgba(0, 0, 0, .15); box-shadow: 0 6px 12px rgb(75, 70, 93);">



													<li><a style="color: white"
														href="response?id=${survey.id}">Responses</a></li>
													<li><a style="color: white"
														href="survey">Sync Now</a></li>
													<li><a style="color: white" href="charts/${survey.id}">Report</a></li>
												</ul>
											</div>
										</td>


									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				<!-- /col-md-12 -->
			</div>
			<!-- row -->
		</section>


	</section>


	<jsp:include page="footer.jsp" />

</body>
</html>