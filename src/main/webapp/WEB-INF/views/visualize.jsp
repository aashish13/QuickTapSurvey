<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<html>
<head>
<title>Index</title>

	<script type="text/javascript">
		var chartType = '${chartType}';
	</script>
</head>
<body>
	<jsp:include page="header.jsp" />
	<section id="main-content">
		<section class="wrapper">
			<h3>
				<i class="fa fa-angle-right"></i>Questions
				<!-- Code to show all questions for this survey -->
				<br/><br/>
				<form:select path="questions" id="all-question">
					<form:option value="-- Select a question --"></form:option>>
 					<form:options items="${questions}" />
				</form:select>
			</h3>
			<!-- page start-->
			<div>
				<div id="chart_div" style="width: 4000px"></div>
			</div>
			<!-- page end-->
		</section>
	</section>
	<jsp:include page="footer.jsp" />
	<script type="text/javascript" src="https://www.google.com/jsapi"></script>
	<script src="${pageContext.request.contextPath}/js/visualize.js"
		type="text/javascript"></script>


</body>
</html>