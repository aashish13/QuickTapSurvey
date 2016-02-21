<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>

	<title>Index</title>
</head>
<body>
<jsp:include page="header.jsp" />

  <section id="main-content">
          <section class="wrapper">
          <h3><i class="fa fa-angle-right"></i> Responses</h3>
              <!-- page start-->
              <div class="row">
				<div class="col-md-12 mt">
					<div class="content-panel">
						<table class="table table-hover">
							<h4>
								<i class="fa fa-angle-right"></i> Questions
							</h4>
							<thead>
								<tr>
									<th>#</th>
									<th>Question 1 </th>
									<th>Question 2</th>
									<th>Question 3</th>
									<th>Question 4</th>
								</tr>
							</thead>
							<tbody>
							<tr>
										<td>Answer</td>
										<td>Answer</td>
										<td>Answer</td>
										<td>Answer</td>
										<td>Answer</td>
									</tr>
								<c:forEach var="survey" items="${surveys}">
									<tr>
										<td>${survey.id}</td>
										<td>${survey.surveyId}</td>
										<td>${survey.name}</td>
										<td>${survey.totalResponses}</td>
										<td>
											<div class="dropdown">
												<button data-toggle="dropdown"
													class="btn btn-primary dropdown-toggle">
													Action <span class="caret"></span>
												</button>
												<ul class="dropdown-menu">
													<li><a href="response">Responses</a></li>
													<li><a href="#">Sync Now</a></li>
													<li><a href="#">Report</a></li>
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
              <!-- page end-->
          </section>          
      </section><!-- /MAIN CONTENT -->

<jsp:include page="footer.jsp" />
<script src="${pageContext.request.contextPath}/js/Chart.js" type="text/javascript"></script> 
<script src="${pageContext.request.contextPath}/js/chartjs-conf.js" type="text/javascript"></script> 
 
  <script>
      //custom select box

      $(function(){
          $('select.styled').customSelect();
      });

  </script>
</body>
</html>
