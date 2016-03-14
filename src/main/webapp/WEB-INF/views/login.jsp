 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
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
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css"/>
        <!-- FontAwesome -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css"/>
        <!-- Animation -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/animate.css" />
        <!-- Owl Carousel -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/owl.carousel.css"/>
         <link rel="stylesheet" href="${pageContext.request.contextPath}/css/owl.theme.css"/>
         <!-- Pretty Photo -->
         <link rel="stylesheet" href="${pageContext.request.contextPath}/css/prettyPhoto.css"/>
         <link rel="stylesheet" href="${pageContext.request.contextPath}/css/flexslider.css"/>
         <link rel="stylesheet" href="${pageContext.request.contextPath}/css/red.css"/>

        <!-- Template styles-->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/custom.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/responsive.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.fancybox.css?v=2.1.5" type="text/css" media="screen" />
	
		<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false"></script>
        <link href="http://fonts.googleapis.com/css?family=Lato:400,300" rel='stylesheet' type='text/css'>
        <link href="http://fonts.googleapis.com/css?family=Raleway:400,300,500" rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/login/css/style.css">
    </head>

 <body data-spy="scroll" data-target=".navbar-fixed-top">
        <!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

    <header id="header" class="navbar-fixed-top navbar-inverse video-menu" role="banner">
    	<div class="container">
    		<!-- <div class="row"> -->
                 <div class="navbar-header " style="
    margin-left: -50px;
">
                     <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="/QuickTapSurvey">
                                <img src="${pageContext.request.contextPath}/img/logo3.png" alt="" class="img-responsive">
                                
                        </a>
                 </div><!--Navbar header End-->
                 	<nav class="collapse navbar-collapse navigation" id="bs-example-navbar-collapse-1" role="navigation">
                        <ul class="nav navbar-nav navbar-right ">
                           	<li class="active"> <a href="/QuickTapSurvey" class="page-scroll" style="font-size:18px;font-weight:bolder;"><b>Home</b> </a></li>
                          
                            <li><a href="https://www.quicktapsurvey.com/public/signup/?sourcePage=organic-home&rt=fbt" class="page-scroll" style="font-size:15px;font-weight:bolder;" target="_blank">SignUp</a> </li>
                        </ul>
                     </nav>
                </div><!-- /.container-fluid -->
</header>
 <!-- Slider start -->
    

<!-- Service Area start -->
<div class="wrapper-login">
    <div class="container-login">
        <h1>Welcome to QuickTapSurvey</h1>
        <br><br>
        <form class="form" method="post" action="survey" modelAttribute="login">
            <input type="text" placeholder="Username" required>
            <input type="password" placeholder="Password" required> 
            <button type="submit" id="login-button">Login</button>
            <h5><a style="color:black;" href="https://www.quicktapsurvey.com/public/signup/?sourcePage=organic-home&rt=fbt" target="_blank">Don't have an account? <b>Sign Up</b></a></h5>
                    </form>
                    
    </div>
    
    
    <ul class="bg-bubbles">
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
    </ul>
    
</div>

    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

        <script src="${pageContext.request.contextPath}/login/js/index.js"></script>
    
<!-- Footer Area Start -->

<section id="footer">
   

    <div class="footer_b">
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <div class="footer_bottom">
                        <p class="text-block"> &copy; Copyright reserved to <span>QuickTapSurvey </span></p>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="footer_mid pull-right">
                        <ul class="social-contact list-inline">
                            <li> <a href="https://www.facebook.com/quicktapsurvey" target="_blank"><i class="fa fa-facebook"></i></a></li>
                            <li> <a href="https://twitter.com/quicktapsurvey" target="_blank"><i class="fa fa-twitter"></i></a></li>
                           <!-- <li> <a href="#"><i class="fa fa-rss"></i></a></li> -->
                            <li> <a href="https://plus.google.com/+QuickTapSurvey" target="_blank"><i class="fa fa-google-plus"></i> </a></li>
                            <li><a href="https://www.linkedin.com/company/quicktapsurvey" target="_blank"> <i class="fa fa-linkedin"></i></a></li>
                            <!-- <li><a href="#"> <i class="fa fa-pinterest"></i></a></li> -->
                        </ul>
                    </div>
                </div>

            </div>
        </div>
    </div>
</section>
<!-- Footer Area End -->



<!-- Back To Top Button -->
       <!--  <div id="back-to-top" data-spy="affix" data-offset-top="10" class="back-to-top affix">
                <button class="btn btn-primary" title="Back to Top"><i class="fa fa-angle-double-up"></i></button>
            </div> -->
    <div id="back-top">
        <a href="#slider_part" class="scroll" data-scroll>
            <button class="btn btn-primary" title="Back to Top"><i class="fa fa-angle-up"></i></button>
        </a>
    </div>
    <!-- End Back To Top Button -->



<!-- Javascript Files
    ================================================== -->
    <!-- initialize jQuery Library -->

		<!-- initialize jQuery Library -->
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
        <!-- Bootstrap jQuery -->
         <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <!-- Owl Carousel -->
        <script src="${pageContext.request.contextPath}/js/owl.carousel.min.js"></script>
        <!-- Isotope -->
        <script src="${pageContext.request.contextPath}/js/jquery.isotope.js"></script>
        <!-- Pretty Photo -->
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.prettyPhoto.js"></script>
        <!-- SmoothScroll -->
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/smooth-scroll.js"></script>
        <!-- Image Fancybox -->
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.fancybox.pack.js?v=2.1.5"></script>
        <!-- Counter  -->
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.counterup.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/waypoints.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.bxslider.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.scrollTo.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easing.1.3.js"></script>
   		<!-- PrettyPhoto -->
        <script src="${pageContext.request.contextPath}/js/jquery.singlePageNav.js"></script>
      	<!-- Wow Animation -->
        <script type="${pageContext.request.contextPath}/js/javascript" src="${pageContext.request.contextPath}/js/wow.min.js"></script>
        <!-- Google Map  Source -->
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/gmaps.js"></script>
			<!-- Custom js -->
        <script src="${pageContext.request.contextPath}/js/custom.js"></script>
	<script>
		// Google Map - with support of gmaps.js
     var map;
        map = new GMaps({
          div: '#map',
          lat: 43.6487315,
          lng: -79.3774131,
          scrollwheel: false,
          panControl: false,
          zoomControl: false,
        });

        map.addMarker({
          lat: 43.6487315,
          lng: -79.3774131,
          title: 'QuickTapSurvey',
          infoWindow: { 
            content: '<p> QuickTapSurvey</p>'
          },
          icon: "${pageContext.request.contextPath}/img/map1.png"
        });
      	</script>
 
    </body>
</html>
