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

								<th></th>
									<c:forEach var="question" items="${questions}">
										<th>${question.title}</th>
								</c:forEach>
								</tr>
								<tr>
									<%-- <c:forEach var="response" items="${responses}">
										<th>${response.value}</th>
									</c:forEach> --%>
								</tr>
							</thead>
							<tbody>
							<c:forEach var="response" items="${responses}">
							<tr>
							<td> ${response.userName} <br/> ${response.dateCollected}</td>
								<c:forEach var="rv" items="${response.responseValueses}">
													<td>${rv.value}</td>			
								</c:forEach>
							</tr>
							</c:forEach>

									
							</thead>
							<tbody>
							
								<c:forEach var="survey" items="${surveys}">
									<tr>
										<td>${survey.id}</td>
										<td>${survey.surveyId}</td>
										<td>${survey.name}</td>
										<td>${survey.totalResponses}</td>
										<td>
											
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
<%-- <script src="${pageContext.request.contextPath}/js/Chart.js" type="text/javascript"></script> 
<script src="${pageContext.request.contextPath}/js/chartjs-conf.js" type="text/javascript"></script> --%> 
 
  <script>
      

      $(function(){
          $('select.styled').customSelect();
      });

  </script>
</body>
</html>
