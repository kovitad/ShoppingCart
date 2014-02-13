<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en-AU" ng-app="myApp">
<head>
<meta charset="UTF-8">
<title>Welcome to My Store</title>
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
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.12/angular.min.js"></script>
<script src="<c:url value="/js/Services.js"/>" type="text/javascript"></script>
</head>
<body ng-controller="TextController">
	<header id="branding">
		<!-- page header (not in section etc) -->
		<h1>Shopping Store</h1>
	</header>
	<div style="border-color: aqua; padding-top: 150px;"  >
		<p>{{someText.message}}</p>
		<div   ng-repeat="item in items">
			<p>{{item.name}}</p>
		</div>
	</div>
	<script>
		var myAppModule = angular.module('myApp', []);
		myAppModule.controller('TextController', function($scope, $http) {
			var someText = {};
			someText.message = 'You have started your journey 1.';
			$scope.someText = someText;
			$http.get('/shoppingcart/services/productListing', {
				cache : true
			}).success(function(data, status, headers, config) {
				$scope.items = data;
			});
		});
			
	</script>
</body>
</html>