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
    </head>

 <body data-spy="scroll" data-target=".navbar-fixed-top">
        <!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

    <header id="header" class="navbar-fixed-top navbar-inverse video-menu" role="banner">
    	<div class="container">
    		<!-- <div class="row"> -->
                 <div class="navbar-header ">
                     <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="#">
                                <img src="${pageContext.request.contextPath}/img/logo3.png" alt="" class="img-responsive">
                                
                        </a>
                 </div><!--Navbar header End-->
                 	<nav class="collapse navbar-collapse navigation" id="bs-example-navbar-collapse-1" role="navigation">
                        <ul class="nav navbar-nav navbar-right ">
                           	<li class="active"> <a href="#home" class="page-scroll">Home </a></li>
                          <!--  <li><a href="#service" class="page-scroll" >QuickTapSurvey</a> </li> -->
                            <li><a href="#portfolio"  class="page-scroll">Data Visualization</a> </li>
                            <li><a href="#about" class="page-scroll">StartUp </a> </li>
                            <li><a href="#team" class="page-scroll">Our Team </a> </li>
                            
                            <li><a href="#contact" class="page-scroll">Contact Us</a> </li>
                            <li><a href="/QuickTapSurvey/login" class="page-scroll">Login</a> </li>
                        </ul>
                     </nav>
                </div><!-- /.container-fluid -->
</header>
 <!-- Slider start -->
    <section id="home" class="hero landing hero-section">
        <div class="video-background-container">
            <video preload="auto" autoplay loop muted class="video-background">
                <source type="video/mp4" src="${pageContext.request.contextPath}/videos/gdrive.mp4" />
                <source type="video/ogg" src="${pageContext.request.contextPath}/videos/gdrive.ogv" />
                <source type="video/webm" src="${pageContext.request.contextPath}/videos/gdrive.webm" />
            </video>
        </div> 

        <div class="parallax-overlay"></div>

        <div class="container">
            <div class="hero-content text-center">
                <div class="hero-text wow fadeIn" data-wow-delay=".8s">
                    <h3 class="hero-title"><span>QuickTapSurvey</span><br> In-Person Survey and Data Collection App</h3>
                    <p class="hero-description">Use iPads, iPhones and Android devices 
                                                to collect data anywhere!</p>
                    <p class="hero-buttons">
                       <!-- <a href="#" class="btn btn-dark">
                            <strong>Learn More </strong> </i>
                        </a> -->
                         <a href="/QuickTapSurvey/login" class="btn btn-main featured">
                            <strong>Join Now </strong> </i>
                        </a>

                    </p>
                </div><!--/ Hero text end -->
            </div><!--/ Hero content end -->
        </div><!--/ Container end -->
    </section><!--/ Home end -->

<!-- Service Area start -->

    <section id="service">
        <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="feature_header text-center">
                            <h3 class="feature_title">Why <b>QuickTapSurvey</b></h3>
                            <h4 class="feature_sub">To Enable the users to visualize and consume data effectively using graphs and charts.<br>Users will be able to find patterns and correlations necessary to make informed decisions.</h4>
                            <div class="divider"></div>
                        </div>
                    </div>  <!-- Col-md-12 End -->
                </div>
                <div class="row">
                    <div class="main_feature text-center">
                        <div class="col-md-3 col-xs-12 col-sm-6">
                                <div class="feature_content">
                                    <i class="fa fa-desktop"></i>
                                    <h5>No &nbsp;Internet &nbsp;Required</h5>
                                    <p>Never rely on internet again! <br>Wherever you are, <br>you can count on <br>QuickTapSurvey.</p>
                                    <button class="btn btn-main" style="
    width: 160px;
"> Internet</button>
                                </div>
                        </div> 
                        
                        <div class="col-md-3 col-xs-12 col-sm-6">
                                <div class="feature_content">
                                    <i class="fa fa-pencil"></i>
                                    <h5>Beautiful &nbsp;Design</h5>
                                    <p>Make your surveys <br>look great by customizing <br>the layout and <br>design. </p>
                                    <button class="btn btn-main" style="
    width: 160px;
"> Design</button>
                                </div>
                        </div> <!-- Col-md-4 Single_feature End -->
                        <div class="col-md-3 col-xs-12 col-sm-6">
                                <div class="feature_content">
                                    <i class="fa fa-cog"></i>
                                    <h5>Quick &nbsp;and &nbsp;Easy &nbsp;Setup</h5>
                                    <p>Quick and Easy Setup helps you <br>Choose one of our templates <br>or create your own survey <br>in minutes. </p>
                                    <button class="btn btn-main" style="
    width: 160px;
"> Setup</button>
                                </div>
                        </div> <!-- Col-md-4 Single_feature End -->
                        <div class="col-md-3 col-xs-12 col-sm-6">
                                <div class="feature_content">
                                    <i class="fa fa-lightbulb-o"></i>
                                    <h5>Make &nbsp;Better &nbsp;Decisions</h5>
                                    <p>Instant graphical reports <br>help you understand your <br>customers and make <br>data-driven decisions.</p>
                                    <button class="btn btn-main" style="
    width: 160px;
"> Decisions</button>
                                </div>
                            </div>
                        <!-- Col-md-4 Single_feature End -->
                        <!-- <button class="btn btn-main"> Read More</button> -->
                    </div>
            </div>  <!-- Row End -->
        </div>  <!-- Container End -->
    </section>
<!-- Service Area End -->


<!-- Portfolio works Start -->

    <section id="portfolio">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="feature_header text-center">
                        <h3 class="feature_title">Visualize <b>DATA</b></h3>
                        <h4 class="feature_sub">Our on-site surveys are easy to create, fun to do and provide fast, <br>actionable insights by collecting data and visualizing them easily for the following </h4>
                        <div class="divider"></div>
                    </div>
                </div>  <!-- Col-md-12 End -->
            </div>
        </div>


    
    <div class="clearfix"></div>
   			<div class="text-center ">
              <ul class="portfolio-wrap" id="portfolio_items">
                   <li class="col-md-3 col-xs-12 col-sm-6 single-portfolio identity web-design">
                        <figure>
                            <img src="${pageContext.request.contextPath}/img/portfolio/p1.jpg" alt="" class="img-responsive"/>
                            <figcaption>
                                <h5>Customer Feedback</h5>
                                <p class="links">
                                    <a href="http://www.quicktapsurvey.com/satisfaction/on-site-customer-feedback.php"> <i class="fa fa-link"></i></a>
                                    <a href="${pageContext.request.contextPath}/img/portfolio/p1.jpg" data-rel="prettyPhoto" >
                                        <i class="fa fa-plus"></i>
                                    </a>
                                </p>
                                <p class="description">
                                    Guaranteed to give you more feedback than other survey method.
                                </p>
                            </figcaption>
                        </figure>
                    </li>

                    <li class="col-md-3 col-xs-12 col-sm-6 single-portfolio logo graphic">
                        <figure>
                        <img src="${pageContext.request.contextPath}/img/portfolio/p2.jpg" alt="" class="img-responsive" />
                            <figcaption>
                                <h5>Lead Capture</h5>
                                <p class="links">
                                    <a href="http://www.quicktapsurvey.com/use/lead-capture-app-trade-show-event.php"> <i class="fa fa-link"></i></a>
                                    <a href="${pageContext.request.contextPath}/img/portfolio/p2.jpg"  data-rel="prettyPhoto">
                                        <i class="fa fa-plus"></i>
                                    </a>
                                </p>
                                <p class="description">
                                    Create a lead capture survey. Add qualifiers and branding.
                                </p>
                                </figcaption>
                        </figure>
                    </li> 

                    <li class="col-md-3 col-xs-12 col-sm-6 single-portfolio graphic logo">
                        <figure>
                            <img src="${pageContext.request.contextPath}/img/portfolio/p3.jpg" alt="" class="img-responsive"/>
                            <figcaption>
                                <h5>Contest Entry</h5>
                                <p class="links">
                                    <a href="http://www.quicktapsurvey.com/use/contest-sweepstake-entry-app-prize-giveaway.php"> <i class="fa fa-link"></i></a>
                                    <a href="${pageContext.request.contextPath}/img/portfolio/p3.jpg" data-rel="prettyPhoto">
                                        <i class="fa fa-plus"></i>
                                    </a>
                                </p>
                                <p class="description">
                                   Painless and delightful for consumers to enter your contest.
                                </p>
                            </figcaption>
                        </figure>
                    </li>

                    <li class="col-md-3 col-xs-12 col-sm-6 single-portfolio web-design identity">
                        <figure>
                            <img src="${pageContext.request.contextPath}/img/portfolio/p4.jpg" alt="" class="img-responsive" />
                            <figcaption>
                                <h5>Research</h5>
                                <p class="links">
                                    <a href="http://www.quicktapsurvey.com/use/research-app-ipad-iphone-android.php"> <i class="fa fa-link"></i></a>
                                    <a href="${pageContext.request.contextPath}/img/portfolio/p7.jpg" data-rel="prettyPhoto">
                                        <i class="fa fa-plus"></i>
                                    </a>
                                </p>
                                <p class="description">
                                    Create your own research survey.
                                </p>
                            </figcaption>
                        </figure>
                    </li> 

                    <li class="col-md-3 col-xs-12 col-sm-6 single-portfolio logo web-design">
                        <figure>
                            <img src="${pageContext.request.contextPath}/img/portfolio/p5.jpg" alt="" class="img-responsive" />
                            <figcaption>
                                <h5>Audits</h5>
                                <p class="links">
                                    <a href="http://www.quicktapsurvey.com/use/audit-inspection-checklist-app-ipad-iphone-android.php"> <i class="fa fa-link"></i></a>
                                    <a href="${pageContext.request.contextPath}/img/portfolio/p5.jpg" data-rel="prettyPhoto">
                                        <i class="fa fa-plus"></i>
                                    </a>
                                </p>
                                <p class="description">
                                    Create an audit survey and add checklist items online.
                                </p>
                            </figcaption>
                        </figure>
                    </li>

                    <li class="col-md-3 col-xs-12 col-sm-6 single-portfolio logo graphic">
                        <figure>
                            <img src="${pageContext.request.contextPath}/img/portfolio/p6.jpg" alt="" class="img-responsive" />
                            <figcaption>
                                <h5>Inspections</h5>
                                <p class="links">
                                    <a href="http://www.quicktapsurvey.com/use/audit-inspection-checklist-app-ipad-iphone-android.php"> <i class="fa fa-link"></i></a>
                                    <a href="${pageContext.request.contextPath}/img/portfolio/p6.jpg" data-rel="prettyPhoto">
                                        <i class="fa fa-plus"></i>
                                    </a>
                                </p>
                                <p class="description">
                                    Use the app to record inspection results offline.
                                </p>
                            </figcaption>
                        </figure>
                    </li>

                    <li class="col-md-3 col-xs-12 col-sm-6 single-portfolio graphic identity">
                        <figure>
                            <img src="${pageContext.request.contextPath}/img/portfolio/p7.jpg" alt="" class="img-responsive" />
                            <figcaption>
                                <h5>Assessments</h5>
                                <p class="links">
                                    <a href="http://www.quicktapsurvey.com/use/assessment-evaluation-app-ipad-iphone-android.php"> <i class="fa fa-link"></i></a>
                                    <a href="${pageContext.request.contextPath}/img/portfolio/p3.jpg" data-rel="prettyPhoto">
                                        <i class="fa fa-plus"></i>
                                    </a>
                                </p>
                                <p class="description">
                                    Create an assessment survey and add items to evaluate.
                                </p>
                            </figcaption>
                        </figure>
                    </li>

                    <li class="col-md-3 col-xs-12 col-sm-6 single-portfolio web-design graphic">
                        <figure>
                            <img src="${pageContext.request.contextPath}/img/portfolio/p8.jpg" alt="" class="img-responsive" />
                            <figcaption>
                                <h5>Evaluations</h5>
                                <p class="links">
                                    <a href="http://www.quicktapsurvey.com/use/assessment-evaluation-app-ipad-iphone-android.php"> <i class="fa fa-link"></i></a>
                                    <a href="${pageContext.request.contextPath}/img/portfolio/p7.jpg" data-rel="prettyPhoto">
                                        <i class="fa fa-plus"></i>
                                    </a>
                                </p>
                                <p class="description">
                                    Automatically calculate a score for assessment
                                </p>
                            </figcaption>
                        </figure>
                    </li>

                </ul>
        </div> <!-- Container Full End -->
</section>  <!-- Portfolio Section End -->

<div class="clearfix"></div>

<!-- About us start -->
<section id="about">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="feature_header text-center">
                    <h3 class="feature_title">Easy <b>Startup</b></h3>
                    <h4 class="feature_sub">Three Easy steps is all you need to get started</h4>
                    <div class="divider"></div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="feature-tab">
            <div class="col-md-6">
                <div class="tab-content">
                      <div role="tabpanel" class="tab-pane active" id="profile1">
                      		<img src="${pageContext.request.contextPath}/img/about/web1.png" alt="" class="img-responsive">
                      </div>
                      <div role="tabpanel" class="tab-pane" id="profile">
                      		<img src="${pageContext.request.contextPath}/img/about/graphics.png" alt="" class="img-responsive">
                      </div>
                      <div role="tabpanel" class="tab-pane" id="messages">
                            <img src="${pageContext.request.contextPath}/img/about/browse.png" alt="" class="img-responsive">
                      </div>
                </div>
            </div>
            <div class="col-md-6">
                <ul class="nav nav-tabs" role="tablist">
                      <li role="presentation">
                      	<a href="#profile1" role="tab" data-toggle="tab">
                            <div class="col-sm-12 single-feature">
                                <div class="col-sm-2 feature-icon">
                                    <i class="fa fa-laptop"></i>
                                </div>
                                <div class="col-sm-10 feature-content">
                                    <h4>Create a Survey</h4>
                                    <p>Create a survey and customize your survey screens online.</p>
                                </div>
                            </div>
                      	</a>
                      </li>
                       <li role="presentation">
                      	<a href="#profile" role="tab" data-toggle="tab">
                            <div class="col-sm-12 single-feature">
                                <div class="col-sm-2 feature-icon">
                                    <i class="fa fa-send"></i>
                                </div>
                                <div class="col-sm-10 feature-content">
                                    <h4>Collect Responses</h4>
                                    <p>Collect  from survey responses using app even when offline.</p>
                                </div>
                            </div>
                      	</a>
                      </li>
                      <li role="presentation">
                      	<a href="#messages" role="tab" data-toggle="tab">
                      		<div class="col-sm-12 single-feature">
                                <div class="col-sm-2 feature-icon">
                                    <i class="fa fa-heart"></i>
                                </div>
                                <div class="col-sm-10 feature-content">
                                    <h4>Take Action</h4>
                                    <p>Take action by Download, analyze, and report on your data.</p>
                                </div>
                            </div>
                      	</a>
                      </li>
                </ul>
            </div>
        </div>
        <hr>
    </div>
    </div>
</section>
<!-- About us End -->

<!-- Counter Strat -->
<div class="feature_header text-center">
                    <h3 class="feature_title">Milestone  <b>Facts</b></h3>    
                    
                    <div class="divider"></div>
                </div>
<section id="counter_area">

        <div class="facts">
            
            <div class="container">
                
                <div class="col-md-3 col-sm-6 columns">

                    <div class="facts-wrap">
                     <div class="graph">
                        <div class="graph-left-side">
                        	<div class="graph-left-container">
                        		<div class="graph-left-half"> </div>
                        	</div>
                        </div>
                        <div class="graph-right-side">
                        	<div class="graph-right-container">
                        		<div class="graph-right-half"></div>
                        	</div>
                        </div>
                        <i class="fa fa-thumbs-o-up fa-3x fw"></i>
                        <div class="facts-wrap-num">
                            <span class="counter">2011</span>
                        </div>
                    </div>
                        <h6>Start Up</h6>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 columns">
                    <div class="facts-wrap">
                     <div class="graph">
                        <div class="graph-left-side">
                        	<div class="graph-left-container">
                        		<div class="graph-left-half"> </div>
                        	</div>
                        </div>
                        <div class="graph-right-side">
                        	<div class="graph-right-container">
                        		<div class="graph-right-half"></div>
                        	</div>
                        </div>
                        <i class="fa fa-gift fa-3x fw"></i>
                        <div class="facts-wrap-num"><span class="counter">80</span></div>
                     </div>
                        <h6>Countries</h6>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 columns">
                    <div class="facts-wrap">
                     <div class="graph">
                        <div class="graph-left-side">
                            <div class="graph-left-container">
                                <div class="graph-left-half"> </div>
                            </div>
                        </div>
                        <div class="graph-right-side">
                            <div class="graph-right-container">
                                <div class="graph-right-half"></div>
                            </div>
                        </div>
                        <i class="fa fa-envelope-o fa-3x fw"></i>
                        <div class="facts-wrap-num"><span class="counter">67,186</span></div>
                        </div>
                        <h6>Users</h6>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 columns">
                    <div class="facts-wrap">
                     <div class="graph">
                        <div class="graph-left-side">
                        	<div class="graph-left-container">
                        		<div class="graph-left-half"> </div>
                        	</div>
                        </div>
                        <div class="graph-right-side">
                        	<div class="graph-right-container">
                        		<div class="graph-right-half"></div>
                        	</div>
                        </div>
                        <i class="fa fa-check-square-o fa-3x fw"></i>
                        <div class="facts-wrap-num"><span class="counter">7,812,380</span></div>
                        </div>
                        <h6>Surveys</h6>
                    </div>
                </div>
                
            </div> <!-- Conatainer End -->
        </div>	<!-- Fact div ENd -->
</section>
<!-- Counter End -->
<div class="clearfix"></div>

<!-- Team MEmber Start -->
<section id="team">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="feature_header text-center">
                    <h3 class="feature_title">Our <b>Team</b></h3>
                    <h4 class="feature_sub">Capstone Project group from Humber college   </h4>
                    <div class="divider"></div>
                </div>
            </div>  <!-- Col-md-12 End -->

            <div id="owl-demo" class="owl-carousel owl-theme team-items">
                <div class="item text-center">
                    <div class="single-member">
                        <div class="overlay-hover">
                            <img src="${pageContext.request.contextPath}/img/team/pic6.jpg" alt="" class="img-responsive">
                            <div class="overlay-effect">
                                <ul class="social list-inline">
                                    <li><a href=""><i class="fa fa-facebook"></i></a></li>
                                    <li><a href=""><i class="fa fa-google-plus"></i></a></li>
                                    <li><a href=""><i class="fa fa-twitter"></i></a></li>
                                    <li><a href=""><i class="fa fa-pinterest"></i></a></li>
                                    <li><a href=""><i class="fa fa-skype"></i></a></li>
                                </ul>
                                <p>Full Stack software developer </p>
                            </div>
                        </div>
                        <h3>Esha Sherry</h3>
                        <h5>Software Developer</h5>
                    </div>
                </div>  <!-- item wrapper end -->
                <div class="item text-center">
                    <div class="single-member">
                        <div class="overlay-hover">
                            <img src="${pageContext.request.contextPath}/img/team/pic1.jpg" alt="" class="img-responsive">
                            <div class="overlay-effect">
                                <ul class="social list-inline">
                                    <li><a href=""><i class="fa fa-facebook"></i></a></li>
                                    <li><a href=""><i class="fa fa-google-plus"></i></a></li>
                                    <li><a href=""><i class="fa fa-twitter"></i></a></li>
                                    <li><a href=""><i class="fa fa-pinterest"></i></a></li>
                                    <li><a href=""><i class="fa fa-skype"></i></a></li>
                                </ul>
                                <p>Full Stack software developer </p>
                            </div>
                        </div>
                        <h3>Aashish Kumar Singh</h3>
                        <h5>Software Developer</h5>
                    </div>
                </div>  <!-- item wrapper end -->
                <div class="item text-center">
                    <div class="single-member">
                        <div class="overlay-hover">
                            <img src="${pageContext.request.contextPath}/img/team/pic2.jpg" alt="" class="img-responsive">
                            <div class="overlay-effect">
                                <ul class="social list-inline">
                                    <li><a href=""><i class="fa fa-facebook"></i></a></li>
                                    <li><a href=""><i class="fa fa-google-plus"></i></a></li>
                                    <li><a href=""><i class="fa fa-twitter"></i></a></li>
                                    <li><a href=""><i class="fa fa-pinterest"></i></a></li>
                                    <li><a href=""><i class="fa fa-skype"></i></a></li>
                                </ul>
                                <p>Full Stack software developer </p>
                            </div>
                        </div>
                        <h3>Ravinder Aulakh</h3>
                        <h5>Software Developer</h5>
                    </div>
                </div>  <!-- item wrapper end -->
                <div class="item text-center">
                    <div class="single-member">
                        <div class="overlay-hover">
                            <img src="${pageContext.request.contextPath}/img/team/pic5.jpg" alt="" class="img-responsive">
                            <div class="overlay-effect">
                                <ul class="social list-inline">
                                    <li><a href=""><i class="fa fa-facebook"></i></a></li>
                                    <li><a href=""><i class="fa fa-google-plus"></i></a></li>
                                    <li><a href=""><i class="fa fa-twitter"></i></a></li>
                                    <li><a href=""><i class="fa fa-pinterest"></i></a></li>
                                    <li><a href=""><i class="fa fa-skype"></i></a></li>
                                </ul>
                                <p>Full Stack software developer </p>
                            </div>
                        </div>
                        <h3>Ajay Kondath</h3>
                        <h5>Software Developer</h5>
                    </div>
                </div>  <!-- item wrapper end -->
                <div class="item text-center">
                    <div class="single-member">
                        <div class="overlay-hover">
                            <img src="${pageContext.request.contextPath}/img/team/pic4.jpg" alt="" class="img-responsive">
                            <div class="overlay-effect">
                                <ul class="social list-inline">
                                    <li><a href=""><i class="fa fa-facebook"></i></a></li>
                                    <li><a href=""><i class="fa fa-google-plus"></i></a></li>
                                    <li><a href=""><i class="fa fa-twitter"></i></a></li>
                                    <li><a href=""><i class="fa fa-pinterest"></i></a></li>
                                    <li><a href=""><i class="fa fa-skype"></i></a></li>
                                </ul>
                                <p>Full Stack software developer</p>
                            </div>
                        </div>
                        <h3>Ashwini Chandra</h3>
                        <h5>Software Developer</h5>
                    </div>
                </div>  <!-- item wrapper end -->
            </div>
        </div>
    </div> <!-- Conatiner Team end -->
</section>  <!-- Section TEam End -->

<!-- Our Team Members End -->
<div class="clearfix"></div>



<!-- Pricing Table Start -->
<section id="pricing_table" class="pricing_overlay">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="feature_header text-center">
                    <h3 class="feature_title">Our <b>Pricing</b></h3>
                    <h4 class="feature_sub">Try for free, no credit card required</h4>
                    <h5 class="feature_sub">Affordable for small organizations and scales seamlessly for large enterprises.</h5>
                    <div class="divider"></div>
                </div>
            </div>  <!-- Col-md-12 End -->

            <div class="text-center pricing">
                <div class="col-md-4">
                    <div class="single_table">
                    <div class="plan_wraper"></div>
                        <ul>
                            <li class="plan">Basic <br><span>Monthly plan</span></li>
                            <li class="price"> 19 <span>$</span></li>
                            <li>Our Core Features</li>
                            <li>Unlimited Surveys</li>
                            <li>Unlimited Responses</li>
                            <li> Question Branching</li>
                            <li> <strike>Add Your Own Branding</li>
                            <li><strike>Kiosk Mode</li>
                            <li> <strike>Enhanced Reporting</li>
                            <li> <strike>Auto-Reply Email</li>
                            <li> <strike>Interactive Question Types</li>
                            <li> <strike>Email Notifications</li>
                            <li> <strike>Survey Scoring</li>
                            <li> <strike>White Labeling</li>
                            <li class="price_button"> <button class="btn btn-main">Sign UP Now!</button></li>
                        </ul>
                    </div>
                </div> <!-- Single col-md-4 End -->
                <div class="col-md-4">
                    <div class="single_table grey_bg  ">
                        <div class="plan_wraper"></div>
                        <ul>
                            <li class="plan">Advanced  <br><span>Popular Monthly plan</span></li>
                            <li class="price"> 49 <span>$</span></li>
                             <li>Our Core Features</li>
                            <li>Unlimited Surveys</li>
                            <li>Unlimited Responses</li>
                            <li> Question Branching</li>
                            <li> Add Your Own Branding</li>
                            <li>Kiosk Mode</li>
                            <li> Enhanced Reporting</li>
                            <li> <strike>Auto-Reply Email</li>
                            <li> <strike>Interactive Question Types</li>
                            <li> <strike>Email Notifications</li>
                            <li> <strike>Survey Scoring</li>
                            <li> <strike>White Labeling</li>
                            <li class="price_button"> <button class="btn btn-main featured">Sign UP Now!</button></li>
                        </ul>
                    </div>
                </div> <!-- Single col-md-4 End -->
                <div class="col-md-4">
                    <div class="single_table dark_bg">
                        <div class="plan_wraper"></div>
                        <ul>
                            <li class="plan">Expert  <br><span>Monthly plan</span></li>
                            <li class="price"> 99 <span>$</span></li>
                             <li>Our Core Features</li>
                            <li>Unlimited Surveys</li>
                            <li>Unlimited Responses</li>
                            <li> Question Branching</li>
                            <li> Add Your Own Branding</li>
                            <li>Kiosk Mode</li>
                            <li> Enhanced Reporting</li>
                            <li> Auto-Reply Email</li>
                            <li> Interactive Question Types</li>
                            <li> Email Notifications</li>
                            <li> Survey Scoring</li>
                            <li> White Labeling</li>
                            <li class="price_button"> <button class="btn btn-main">Sign UP Now!</button></li>
                        </ul>
                    </div>
                </div> <!-- Single col-md-4 End -->
            </div>
        </div>
    </div>
</section>  <!-- Pricing Section End -->
<!-- Pricing Table End -->



<!-- Testimonial Start -->

<section id="testimonial" class="wow fadeInUp">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="feature_header text-center">
                    <h3 class="feature_title"><b>Customers</b> Feedback</h3>
                    <h4 class="feature_sub">Hear what some of our customers have to say</h4>
                    <div class="divider"></div>
                </div>
            </div>  <!-- Col-md-12 End -->
        </div>
                <div class="row">
                    <div id="testimonial-carousel" class="owl-carousel owl-theme text-center testimonial-slide">
                        <div class="item">
                          <div class="testimonial-thumb">
                            <img class="img-circle" src="${pageContext.request.contextPath}/img/team/pic2.jpg" alt="testimonial" class="img-responsive">
                          </div>
                          <div class="testimonial-content">
                            <h3 class="name">Jennifer Evans-Cowley <span>Vice Provost for Capital Planning and Regional Campuses at Ohio State University</span></h3>
                            <p class="testimonial-text"><b>
                              The great thing about QuickTapSurvey is that it was easy to train people on how to use it.</b>
                            </p>
                          </div>
                        </div>
                        <div class="item">
                          <div class="testimonial-thumb">
                            <img class="img-circle" src="${pageContext.request.contextPath}/img/team/pic1.jpg" alt="testimonial" class="img-responsive">
                          </div>
                          <div class="testimonial-content">
                          	<h3 class="name">Manish Punjabi <span>Marketing Manager at Alcatel Lucent</span></h3>
                            <p class="testimonial-text"><b>
                              QuickTapSurvey was a hit. Easy to use, affordable, and reduced our data capture process from weeks to days.</b>
                            </p>
                          </div>
                        </div>
                        
                  </div> 
                  	<!-- Navigation start -->
                  	<div class="customNavigation cyprass-carousel-controller">
                        <a class="prev left">
                        	<i class="fa fa-chevron-left"></i>
                       	</a>
                        <a class="next right" style="
    margin-left: -3px;
">
                          <i class="fa fa-chevron-right"></i>
                        </a>
                	</div>
                	<!-- Navigation ENd -->
                </div>
            </div> <!-- Row End -->

</section> <!-- Section Testimonial End -->

<!-- Testimonial Area End -->



<!-- Conatct Area Start-->

<section id="contact">
    <div class="container">
        <div class="row">
  			<div class="col-md-12">
                <div class="feature_header text-center">
                    <h3 class="feature_title">Contact <b>US</b></h3>
                    <h4 class="feature_sub">We want to hear from you. Get in touch with us the best way that works for you. </h4>
                    <div class="divider"></div>
                </div>
  			</div>
        </div>
        <div class="row">
             <div class="contact_full">
                <div class="col-md-6 left">
                    <div class="left_contact">
                        <form action="role">
                            <div class="form-level">
                                <input name="name" placeholder="Name" id="name"  value="" type="text" class="input-block" style="
    color: black;
">
                                <span class="form-icon fa fa-user"></span>
                            </div>
                            <div class="form-level">
                                <input name="email" placeholder="Email" id="mail" class="input-block" value="" type="email" style="
    color: black;
">
                                <span class="form-icon fa fa-envelope-o"></span>
                            </div>
                            <div class="form-level">
                                <input name="name" placeholder="Phone" id="phone" class="input-block" value="" type="text" style="
    color: black;
">
                                <span class="form-icon fa fa-phone"></span>
                            </div>
                        </form>
                    </div>
                </div>

                <div class="col-md-6 right">
                    <div class="form-level">
                        <textarea name="" id="messege"  rows="5" class="textarea-block" placeholder="message"></textarea>
                        <span class="form-icon fa fa-pencil"></span>
                    </div>
                </div>
                <div class="col-md-12 text-center">
                    <button class="btn btn-main featured">Submit Now</button>
                </div>
            </div>
        </div>
    </div>
</section>

<div id="g-map" class="no-padding">
	<div class="container-fluid">
		<div class="row">
			<div class="map" id="map"></div>
		</div>
	</div>
</div>
<!-- Footer Area Start -->

<section id="footer">
    <div class="footer_top">
        <div class="container">
            <div class="row">
                <div class="col-md-3 col-sm-6">
                    <h3 class="menu_head">Main Menu</h3>
                    <div class="footer_menu">
                        <ul>
                            <li><a href="#home">Home</a></li>
                            <li><a href="#service">Service</a></li>
                            <li><a href="#portfolio">Data Collection</a></li>
                            <li><a href="login">Login</a></li>
                            <li><a href="#contact">Contact</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <h3 class="menu_head">Useful Links</h3>
                    <div class="footer_menu">
                        <ul>
                            <li><a href="http://www.quicktapsurvey.com/tour.php" target="_blank">Tour</a></li>
                            <li><a href="http://www.quicktapsurvey.com/features.php" target="_blank">Features</a></li>
                            <li><a href="http://www.quicktapsurvey.com/pricing.php" target="_blank"> Pricing</a></li>
                            <li><a href="http://www.quicktapsurvey.com/compareplans.php" target="_blank">Compare Plans</a></li>
                            <li><a href="http://www.quicktapsurvey.com/questiontypes.php" target="_blank">Question Types</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <h3 class="menu_head">Contact us</h3>
                    <div class="footer_menu_contact">
                        <ul>
                            <li> <i class="fa fa-home"></i>
                                <span> 67 Yonge Street, Suite 810 Toronto </span></li>
                            <li><i class="fa fa-globe"></i>
                                <span></span>sales@quicktapsurvey.com</li>
                            <li><i class="fa fa-phone"></i>
                                <span>  +1 888-395-9285</span></li>
                      <!--      <li><i class="fa fa-map-marker"></i>
                            <span>http://www.quicktapsurvey.com/contact.php</span></li> -->
                        </ul>
                    </div>
                </div>

                <div class="col-md-3 col-sm-6">
                    <h3 class="menu_head">Tags</h3>
                    <div class="footer_menu tags">
                        <a href="#"> Design</a>
                        <a href="#"> Data Visualization</a>
                        <a href="#"> Customer feedback</a>
                        <a href="#"> api</a>
                        <a href="#"> Development</a>
                        <a href="#"> Survey</a>
                        <a href="#"> Responses</a>
                        <a href="#"> Report</a>
                        <a href="#"> Setup</a>
                        <a href="#"> Internet</a>
                    </div>
                </div>

            </div>
        </div>
    </div>

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
