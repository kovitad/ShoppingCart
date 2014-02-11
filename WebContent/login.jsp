<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en-AU">
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link rel="shortcut icon" href="<c:url value="/css/images/favicon.ico"/>" />
<link rel="stylesheet" href="<c:url value="/css/style.css"/>" type="text../css"
	media="all" />
<!--[if IE 6]>
	<link rel="stylesheet" href="./css/ie6.css" type="text../css" media="all" />	
	<![endif]-->
<link rel="stylesheet" href="<c:url value="/css/jquery.jscrollpane.css"/>"
	type="text../css" media="all" />
<script src="<c:url value="/js/jquery-1.7.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/js/DD_belatedPNG-min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/js/jquery.jscrollpane.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/js/jquery.jcarousel.js"/>" type="text/javascript"></script>
<script src="<c:url value="/js/functions.js"/>" type="text/javascript"></script>

</head>
<body>
	<div id="wrapper">
		<div id="header">
			<!-- Logo -->
			<h1 id="logo">
				<a title="Home" href="#">Kovitad Store</a>
			</h1>
			<p class="shopping-cart">
				<a class="cart" href="#" title="Your Shopping Cart">Your
					Shopping Cart</a><span>Articles:</span>&nbsp;4<span>Cost:</span>&nbsp;$59.99
			</p>
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
		<div id="main">
			<div class="box" style="padding-top: 200px; padding-left: 150px;">
				<div class="middle" id="login">
					<div class="post">
						<p>
							<span>Login to our System</span>
						</p>
						<p>Please enter your username and password.</p>
					</div>
					<div class="cl"></div>
					<form name='f' action="<c:url value='j_spring_security_check' />"
						method='POST'>
						<table>
							<tr>
								<td>User:</td>
								<td><input type='text' name='j_username' value=''></td>
							</tr>
							<tr>
								<td>Password:</td>
								<td><input type='password' name='j_password' /></td>
							</tr>
							<tr>
								<td colspan='2'><input name="submit" type="submit"
									value="submit" /> <input name="reset" type="reset" /></td>
							</tr>
						</table>
					</form>
					<div class="cl">&nbsp;</div>
				</div>
				<div class="bottom"></div>
			</div>
		</div>
	</div>
	<footer id="footer"> </footer>
</body>
</html>