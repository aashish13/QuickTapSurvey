<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>

<title>Survey List</title>
</head>


<body>

	<%@ include file="/WEB-INF/views/header.jsp"%>

	<!--main content start-->
	<section id="main-content">

		<section class="wrapper">
			<h3>
				<i class="fa fa-angle-right"></i> Active Surveys
			</h3>
			<form method="get" action="sync">
				<button type="submit" class="btn btn-round btn-primary">
					<i class="fa fa-cog"></i> Sync
				</button>
			</form>

			<div class="row">
				<div class="col-md-12 mt">



					<div class="content-panel">
						<table class="table table-hover">
							<h4>
								<i class="fa fa-angle-right"></i> Survey List
							</h4>
							<hr>
							<thead>
								<tr>
									<th>#</th>
									<th>Survey Id</th>
									<th>Survey Name</th>
									<th>Responses</th>
									<th>Actions</th>

								</tr>
							</thead>
							<tbody>

								<tr>

									<td>1</td>


									<td>${SID}</td>


									<td>${SN}</td>



									<td>${RN}</td>


									<td>
										<button data-toggle="dropdown"
											class="btn btn-primary dropdown-toggle">
											Action <span class="caret"></span>
										</button>
										<ul class="dropdown-menu">
											<li><a href="#">Responses</a></li>
											<li><a href="#">Sync Now</a></li>
											<li><a href="#">Report</a></li>
										</ul>
										</div>
									</td>

								</tr>



								<tr>


									<td>
										<form method="get" action="sync">
											<button type="submit" class="btn btn-round btn-primary">
												<i class="fa fa-cog"></i> Sync
											</button>
										</form>
									</td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>


								</tr>
							</tbody>
						</table>
					</div>
					<! --/content-panel -->
				</div>
				<!-- /col-md-12 -->
			</div>
			<!-- row -->



		</section>

		<%@ include file="/WEB-INF/views/footer2.jsp"%>
</body>
</html>
