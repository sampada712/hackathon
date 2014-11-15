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
	background-color: #D3D3D3;
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
	padding-right: 30px;
	padding-left: 30px;
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

	<div id="banner">
		<image src="/hack/resources/images/linkedinBanner2.png"
			style="width:100%">
	</div>
	<div id="search">
		<image src="/hack/resources/images/jobSearch.png"
			style="width:100%">
	</div>
	<div id="main-content" class="container-fluid">
		<div class="results col-xs-10">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>#</th>
						<th>Job Information</th>
						<th>Rating</th>
					</tr>
				</thead>
				<tbody>

					<tr>
						<td rowspan="2">1</td>
						<td class="job-title">${job.jobTitle}</td>
						<td class="rating">5.0 Match!</td>
					</tr>
					<tr>
						<td class="description">a job description blah blah blah</td>
						<td class="keywords pull-right"><span
							class="label label-primary">Javascript</span> <span
							class="label label-primary">PHP</span> <span
							class="label label-primary">Java</span> <span
							class="label label-primary">HTML</span> <span
							class="label label-primary">Ruby on Rails</span> <span
							class="label label-primary">Python</span></td>
					</tr>

				</tbody>
			</table>
		</div>
	</div>

	<script type="text/javascript"></script>
</body>


</html>