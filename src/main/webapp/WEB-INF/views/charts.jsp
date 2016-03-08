<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Index</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<section id="main-content">
		<section class="wrapper">
			<h3>
				<i class="fa fa-angle-right"></i> Reports
			</h3>
			<!-- page start-->
			<a href="${pageContext.request.contextPath}/visualize/ColumnChart/${surveyId}" >Column Chart</a><br/>
			<a href="${pageContext.request.contextPath}/visualize/ComboChart/${surveyId}" >Combo Chart</a><br/>
			<a href="${pageContext.request.contextPath}/visualize/SteppedAreaChart/${surveyId}" >Stepped Area Chart</a><br/>
			<a href="${pageContext.request.contextPath}/visualize/AreaChart/${surveyId}" >Area Chart</a><br/>
			<a href="${pageContext.request.contextPath}/visualize/Histogram/${surveyId}" >Histogram</a><br/>
			
			<div class="tab-pane" id="chartjs">
				<div class="row mt">
					<div class="col-lg-6">
						<div class="content-panel">
							<a
								href="${pageContext.request.contextPath}/visualize/PieChart/${surveyId}">
							<h4>
									<i class="fa fa-angle-right"></i> Pie
							</h4>
							<div class="panel-body text-center">
									<canvas id="pie" height="300" width="400"></canvas>
							</div>
							</a>
						</div>
					</div>
					<div class="col-lg-6">
						<div class="content-panel">
							<h4>
								<i class="fa fa-angle-right"></i> Line <a
									href="${pageContext.request.contextPath}/visualize/LineChart/${surveyId}">
							</h4>
							<div class="panel-body text-center">
								<canvas id="line" height="300" width="400"></canvas>
							</div>
							</a>

						</div>
					</div>
				</div>
				<div class="row mt">
					<div class="col-lg-6">
						<div class="content-panel">
							<h4>
								<i class="fa fa-angle-right"></i> Bar 
								<a href="${pageContext.request.contextPath}/visualize/BarChart/${surveyId}">
							</h4>
							<div class="panel-body text-center">
								<canvas id="bar" height="300" width="400"></canvas>
							</div>
							</a>

						</div>
					</div>
					<div class="col-lg-6">
						<div class="content-panel">
							<h4>
								<i class="fa fa-angle-right"></i> Polar Area
							</h4>
							<div class="panel-body text-center">
								<canvas id="polarArea" height="300" width="400"></canvas>
							</div>
						</div>
					</div>
				</div>
				<div class="row mt">
					<div class="col-lg-6">
						<div class="content-panel">
							<h4>
								<i class="fa fa-angle-right"></i> Radar
							</h4>
							<div class="panel-body text-center">
								<canvas id="radar" height="300" width="400"></canvas>
							</div>
						</div>
					</div>
					<div class="col-lg-6">
						<div class="content-panel">
							<h4>
								<i class="fa fa-angle-right"></i> Doughnut
							</h4>
							<div class="panel-body text-center">
								<canvas id="doughnut" height="300" width="400"></canvas>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- page end-->
		</section>
	</section>
	<jsp:include page="footer.jsp" />
	<script src="${pageContext.request.contextPath}/other/js/Chart.js"
		type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/other/js/chartjs-conf.js"
		type="text/javascript"></script>
	<script>
		$(function() {
			$('select.styled').customSelect();
		});
	</script>
</body>
</html>