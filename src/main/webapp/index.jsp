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
			<p><h1>Welcome</h1>
		</div>
	</div>
</body>
</html>