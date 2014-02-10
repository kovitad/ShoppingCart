<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Products</title>

<link rel="shortcut icon" href="../css/images/favicon.ico" />
<link rel="stylesheet" href="../css/style.css" type="text../css"
	media="all" />
<!--[if IE 6]>
	<link rel="stylesheet" href="../css/ie6.css" type="text../css" media="all" />	
	<![endif]-->
<link rel="stylesheet" href="css/jquery.jscrollpane.css"
	type="text../css" media="all" />
<script src="../js/jquery-1.7.min.js" type="text/javascript"></script>
<script src="../js/DD_belatedPNG-min.js" type="text/javascript"></script>
<script src="../js/jquery.jscrollpane.min.js" type="text/javascript"></script>
<script src="../js/jquery.jcarousel.js" type="text/javascript"></script>
<script src="../js/functions.js" type="text/javascript"></script>
</head>
<body>
	<div class="products-holder">
		<c:forEach var="item" items="${products}">
			<p>${item.name}</p>
			<div class="product">
				<a title="Details" href="#"><img
					src="${item.imageSrc}" /></a>
			</div>
		</c:forEach>
	</div>
</body>
</html>