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
	font-family: Arial,"Times New Roman", Georgia, Serif;
	font-size: 13px;
	background-color: #D3D3D3;
}

.picture {
	padding-bottom: 10px;
}

div#main-content {
	padding-top: 1px;
}

div.profile {
	text-align: center;
}

div.results {
	text-align: center;
	padding-right: 10px;
	padding-left: 10px;
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

th{
padding : 10px;
}
</style>
</head>
<body>
   <div style="width:1000px; margin:0 auto;">
        
	<div id="banner">
		<img src="/hack/resources/images/linkedinBanner2.png"
			style="width:100%">
	</div>
	<div id="main-content" class="container-fluid">
		<div class="profile col-xs-8">

			<div class="row">
				<img src="/hack/resources/images/profile1.png" style="width:100%">
			</div>
			<div class="row">
				<img src="/hack/resources/images/background1.png"
					style="width:100%">
			</div>
			<div class="row">
				<img src="/hack/resources/images/skills1.png" style="width:100%">
			</div>
			<div class="row">
				<img src="/hack/resources/images/education1.png"
					style="width:100%">
			</div>
		</div>
		<div class="results col-xs-4">
			<div class="row">
				<img src="/hack/resources/images/people1.png">
			</div>
			<br>
			<div class="row" style="background-color:white;" width="250px">
				<table >
					<tr><b><span style="font-size:125%">Check out these jobs</span></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i><font style="background-color:white;color:blue">
					<a href="/hack/listjobs/${profileId}" >see more...</a></font></i></tr>
					<c:forEach var="job" items="${jobs}">
						<tr>
							<td style="padding:5px;background-color:white"><img src="${job.companyLogo}" width="45px"
									height="45px" /></td>
							<td style="padding:5px;background-color:white"><font color="blue" style="background-color:white">${job.jobTitle}</font>
							<br>${job.location}</td>
								<c:choose>
									<c:when test="${job.rating < 40}">
										<td style="padding:5px;color:red;font-weight:bold;background-color:white">${job.rating}%</td>
    								</c:when>
									<c:when test="${job.rating < 70 && job.rating >= 40}">
										<td style="padding:5px;color:blue;font-weight:bold;background-color:white">${job.rating}%</td>
    								</c:when>
									<c:when test="${job.rating < 100 && job.rating >= 70}">
										<td style="padding:5px;color:green;font-weight:bold;background-color:white">${job.rating}%</td>
    								</c:when>
    								<c:otherwise>
        								<td style="padding:5px;color:yellow;font-weight:bold;background-color:white">${job.rating}%</td>
									</c:otherwise>
								</c:choose>
						</tr>
					</c:forEach>
				</table>
			</div>
			<br>
			<div class="row">
				<img src="/hack/resources/images/others1.png">
			</div>
			<br>
			<div class="row">
				<img src="/hack/resources/images/who1.png">
			</div>
		</div>
	</div>
	</div>
	<script type="text/javascript"></script>
</body>


</html>