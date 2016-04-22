
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
	href="${pageContext.request.contextPath}/css/iphone.css" />
<!-- FontAwesome -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css" />

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
		<section class="wrapper" style="padding-bottom: 80px;">
			<h3 style="text-align: center; color: #ee3b24; margin-top: 20px;">
				<b> Preview</b>
			</h3>
			<div class="wrapper">
				<div class="iphone">
					<div class="power"></div>
					<div class="lock"></div>
					<div class="volume up"></div>
					<div class="volume down"></div>
					<div class="camera"></div>
					<div class="speaker"></div>
					<div class="screen">
						<!-- Put screen stuff in here -->
 
      <!-- Navigation -->
      <div class="navbar">
        <div class="button1 button-left menu"><a>&#10005;</a></div>
        <div class="title">${survey.name}</div>
        <div class="button1 button-right">	<button type="button" class="btn" style="margin-left: -68px;">Submit</button> </div>
      </div>
      <!-- Pages -->
      <div id="home" class="page current">
       </br>
       <table>


									<c:forEach var="question" items="${questions}" varStatus="loop">
										<tr>
											<td width="30px"><span style="font-size: 12px">
													${loop.index+1} <span style="color: red">*</span>
											</span></td>
											<td>${question.title}</br><c:set var="string1" value="${question.title}" />
											<c:set var="string2" value="${fn:substring(string1, 0, 2)}" />
											<c:set var="string3" value="${fn:trim(string2)}" />
											<c:choose>
<c:when test="${string3 == '1'}">
postal code
  
  </c:when>
  <c:when test="${string3 == '2'}">
currency amount
  
  </c:when>
  <c:when test="${string3 == '3'}">
 date picker
  
  </c:when>
  <c:when test="${string3 == '4'}">
 email address
  
  </c:when>
  <c:when test="${string3 == '5'}">
  <div class="s3preview">

       <form>
    <input type="radio" class="button" id="Male" name="gender"></input>
    <label for="Male">MALE</label>
    <input type="radio" class="button" id="Female" name="gender"></input>
    <label for="Female">FEMALE</label>
  </form>
</div>
  
  </c:when>
  <c:when test="${string3 == '6'}">
 image display  
  </c:when>
  <c:when test="${string3 == '7'}">
  
 <img alt="" width="25" height="25" src="http://freshinbox.com/blog/wp-content/uploads/2015/01/hamburger-square-150x150.gif">
 <span style="color:grey; vertical-align:middle; display: inline-block;
    margin-top: -16px;">Tap to pick your answer</span>

  
  
  </c:when>
  <c:when test="${string3 == '8'}">
 map point
  
  </c:when>
  <c:when test="${string3 == '9'}">
 matrix
  
  </c:when>
  <c:when test="${string3 == '10'}">
 MCQ-ImageManyAnswer
  
  </c:when>
  <c:when test="${string3 == '11'}">
 DecimalNumber
  
  </c:when>
    <c:when test="${string3 == '12'}">
 MCQ-ImageSingleAnswers
  
  </c:when>
   <c:when test="${string3 == '13'}">
<a href="#" class="button2 small green rounded">Tap to select</a>
  
  </c:when>
  <c:when test="${string3 == '14'}">
<a href="#" class="button2 small green rounded">Tap to select</a>
  
  </c:when>
  <c:when test="${string3 == '15'}">
NetPromoterScore
  
  </c:when>
  <c:when test="${string3 == '16'}">
Number
  
  </c:when>
  <c:when test="${string3 == '17'}">
PDF(IOS)
  
  </c:when>
  <c:when test="${string3 == '18'}">
PhotoCapture
  
  </c:when>
  <c:when test="${string3 == '19'}">
 QRCodeReader
  
  </c:when>
  <c:when test="${string3 == '20'}">
 Ranking
  
  </c:when>
  <c:when test="${string3 == '21'}">
 SatisfactionRating
  
  </c:when>
  <c:when test="${string3 == '22'}">
 ScratchCard
  
  </c:when>
  <c:when test="${string3 == '23'}">
 SerialNumber(AlphaNumeric)
  
  </c:when>
  <c:when test="${string3 == '24'}">
 SignatureCapture
  
  </c:when>
  <c:when test="${string3 == '25'}">
 Slider
  
  </c:when>
  <c:when test="${string3 == '26'}">
 StarRating
  
  </c:when>
  <c:when test="${string3 == '27'}">
 StopWatch
  
  </c:when>
  <c:when test="${string3 == '28'}">
 Summary
  
  </c:when>
  <c:when test="${string3 == '29'}">
 Telephone(US/Canada)
  
  </c:when>
  <c:when test="${string3 == '30'}">
 Telephone(International)
  
  </c:when>
  <c:when test="${string3 == '31'}">
 Terms&Conditions
  
  </c:when>
  <c:when test="${string3 == '32'}">
 TextDisplay
  
  </c:when>
  <c:when test="${string3 == '33'}">
 <form>
    <label>
      <input class="input1" type="text" placeholder="Tap to enter"></input>
    </label>
   </form>
  
  </c:when>
  <c:when test="${string3 == '34'}">
 <form>
    <label>
      <input class="input1" type="text" placeholder="Tap to enter"></input>
    </label>
   </form>
  
  </c:when>
  <c:when test="${string3 == '35'}">
   <div class="s3preview">

       <form>
    <input type="radio" class="button" id="True" name="truefalse"></input>
    <label for="True">True</label>
    <input type="radio" class="button" id="False" name="truefalse"></input>
    <label for="False">False</label>
  </form>
</div>
  
  
  </c:when>
  <c:when test="${string3 == '36'}">
  <div class="s3preview">

       <form>
    <input type="radio" class="button" id="Yes" name="yesno"></input>
    <label for="Yes">Yes</label>
    <input type="radio" class="button" id="No" name="yesno"></input>
    <label for="No">No</label>
  </form>
</div>
  
  </c:when>
  <c:when test="${string3 == '37'}">
 USZipcode
  
  </c:when>
  <c:when test="${string3 == '38'}">
 WebsiteURL
  
  </c:when>
  <c:when test="${string3 == '39'}">
 WebsiteViewer
  
  </c:when>
  <c:when test="${string3 == '40'}">
 YoutubeVideo
  
  </c:when>
  
  <c:otherwise>
 mcqs and others
  
  </c:otherwise>
  </c:choose>
											
											<c:forEach var="response" items="${responses}">
<c:forEach var="rv" items="${response.responseValueses}">

<c:choose>

  <c:when test="${question.getQuestionNo()== rv.getQuestions().getQuestionNo()}">
 	<td>		
				</td>
  </c:when>
  </c:choose>

										</c:forEach>
										 	
											</td>
										</tr>
										</c:forEach>
									</c:forEach>


								</table>
							
      </div>
    
						<%-- <div id="global-nav">
							
								<span class="dialog"><a href="#" class="close-classic"></a></span>
								
									<div class="survey-name">${survey.name}</div>
									
									<span id="submit-button">
										<button type="button" class="btn">Submit</button>
									</span>
									
						</div>
						<div id="screen-body-outer">
							<div id="screen-body">
								<table>


									<c:forEach var="question" items="${questions}" varStatus="loop">
										<tr>
											<td width="30px"><span style="font-size: 12px">
													${loop.index+1} <span style="color: red">*</span>
											</span></td>
											<td>${question.title}</br> ${rv.value}
											</td>
										</tr>
									</c:forEach>


								</table>
							</div>
						</div> --%>
					</div>
					<div class="button">
						<div class="square"></div>
					</div>
				</div>
			</div>
		</section>
	</section>
	<!-- /MAIN CONTENT -->


	<jsp:include page="footer.jsp" />
	<script src="${pageContext.request.contextPath}/js/Chart.js"
		type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/chartjs-conf.js"
		type="text/javascript"></script>

	<script>
		$(function() {
			$('select.styled').customSelect();
		});
	</script>
</body>
</html>
