<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE  html>
<html lang="en_AU">
<head>
<meta charset="UTF-8">
<title>Member Registration</title>
<link rel="shortcut icon"
	href="<c:url value="/css/images/favicon.ico"/>" />
<link rel="stylesheet" href="<c:url value="/css/style.css"/>"
	type="text../css" media="all" />
<!--[if IE 6]>
	<link rel="stylesheet" href="./css/ie6.css" type="text../css" media="all" />	
	<![endif]-->
<link rel="stylesheet"
	href="<c:url value="/css/jquery.jscrollpane.css"/>" type="text../css"
	media="all" />
<script src="<c:url value="/js/jquery-1.7.min.js"/>"
	type="text/javascript"></script>
<script src="<c:url value="/js/DD_belatedPNG-min.js"/>"
	type="text/javascript"></script>
<script src="<c:url value="/js/jquery.jscrollpane.min.js"/>"
	type="text/javascript"></script>
<script src="<c:url value="/js/jquery.jcarousel.js"/>"
	type="text/javascript"></script>
<script src="<c:url value="/js/functions.js"/>" type="text/javascript"></script>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<!-- Logo -->
			<h1 id="logo">
				<a title="Home" href="#">Kovitad Store</a>
			</h1>
			<!-- Search -->
			<div class="search-expand"></div>
			<div id="search">
				<div class="retract-button">
					<p>retract</p>
				</div>
				<form action="" method="post">
					<input type="text" class="field" value="Search" title="Search" />
					<input type="submit" value="" class="submit-button" />
				</form>
			</div>
		</div>
		<div id="content" style="padding-top: 5cm">
			<div id="main">
				<div class="box">
					<div class="middle" id="register">
						<div class="post">
							<p>
								<span>Registration Form</span>
							</p>
							<p>Please enter your details.</p>
						</div>

						<s:form action="register" labelposition="left">
							<table>
								<tbody>
									<tr>
										<td>First Name:</td>
										<td><s:textfield key="firstName" maxlength="255" /></td>
									</tr>
									<tr>
										<td>Last Name:</td>
										<td><s:textfield key="lastName" maxlength="255" /></td>
									</tr>
									<tr>
										<td>Email:</td>
										<td><s:textfield key="Email" maxlength="255" /></td>
									</tr>
									<tr>
										<td>User Name:</td>
										<td><s:textfield key="userName" maxlength="255" /></td>
									</tr>
									<tr>
										<td>Password:</td>
										<td><s:password key="password" maxlength="255" /></td>
									</tr>
									<tr>
										<td>Confirm Password:</td>
										<td><s:password key="confirmPassword" maxlength="255" /></td>
									</tr>
									<tr>
										<td colspan="2"><s:submit label="Submit" /> <s:reset
												label="Reset" /></td>

									</tr>

								</tbody>
							</table>
						</s:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>