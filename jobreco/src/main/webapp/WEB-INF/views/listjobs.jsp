<%@page import="com.linkedin.hack.job.Job"%>
<%@page import="java.util.List"%>
<%@page import="com.linkedin.hack.job.JobSearchClient"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title></title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link href='http://fonts.googleapis.com/css?family=Dosis'
	rel='stylesheet' type='text/css'>
<style type="text/css">
* {
	font-family: 'Dosis', sans-serif;
}

.picture {
	padding-bottom: 10px;
}

div#main-content {
	padding-top: 30px;
}

div.profile {
	text-align: center;
}

div.results {
	text-align: center;
}

.company {
	
}

.job-title {
	font-weight: bold;
}

.rating {
	font-weight: bold;
}

th {
	font-weight: bold;
	font-size: large;
	text-align: center;
}
</style>
</head>
<body>
	<div style="width: 1000px; margin: 0 auto;">
		<div id="banner">
			<image src="/hack/resources/images/linkedinBanner2.png"
				style="width:100%">
		</div>
		<div id="search">
			<image src="/hack/resources/images/jobSearch.png" style="width:100%">
		</div>
		<div id="main-content">
			<div class="results">
				<table class="table table-striped">

					<tbody>
						<c:forEach var="job" items="${jobs}">
							<tr>
								<td width="70%"><div>
										<div style="float: left">
											<image src="${job.companyLogo}" />
										</div>
										<div style="float: left">
											<span
												style="padding-left: 15px; padding-top: 5px; font-weight: bold; font-family: arial; font-size: 18px; vertical-align: text-top"><a
												href="">${job.jobTitle}</a></span></br> <span
												style="font-family: arial; font-size: 14px; padding-left: 15px; padding-top: 5px;">${job.companyName}
												- ${job.location}</span><br /> <span
												style="padding-left: 15px; vertical-align: text-top; font-family: arial; font-size: 12px">${job.jobDesc}.....</span>
										</div>
									</div></td>
								<td width="30%"><span
									style="vertical-align: text-top; font-family: arial; font-weight: bold; font-size: 14px">Matched
										Criteria: </span><span style="font-family: arial; font-size: 12px;">
										<c:forEach var="criteria" items="${job.matchedCriteria}">
											<c:choose>
												<c:when
													test="${criteria.value != null && !(criteria.key eq 'Connections')}">
													${criteria.key}:(
														<c:forEach var="skill" items="${criteria.value}">
															${skill}, 
														</c:forEach>
													) 
												</c:when>
												<c:when test="${criteria.key eq 'Connections'}">
													Connections: <a href="/">${criteria.value[0]} people </a>
												</c:when>
												<c:otherwise>
													${criteria.key}, 
												</c:otherwise>
											</c:choose>
										</c:forEach>
								</span><br /> <span
									style="vertical-align: text-top; font-family: arial; font-weight: bold; font-size: 14px; padding-bottom: 3px">Score:
								</span> <c:choose>
										<c:when test="${job.rating < 40}">
											<span style="color: red; font-weight: bold;">${job.rating}%
											</span>

										</c:when>
										<c:when test="${job.rating < 70 && job.rating >= 40}">
											<span style="color: blue; font-weight: bold;">${job.rating}%
											</span>

										</c:when>
										<c:when test="${job.rating < 100 && job.rating >= 70}">
											<span style="color: green; font-weight: bold;">${job.rating}%</span>

										</c:when>
										<c:otherwise>
											<span style="color: yellow; font-weight: bold;">${job.rating}%</span>

										</c:otherwise>
									</c:choose> <br /> <span
									style="vertical-align: text-top; font-weight: bold;"><a
										href=""><span class="label label-primary">Apply</span></a></span></td>
							</tr>


						</c:forEach>

					</tbody>
				</table>
			</div>
		</div>
	</div>

	<script type="text/javascript"></script>
</body>


</html>