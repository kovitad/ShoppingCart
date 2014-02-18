<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html ng-app>
<head>
<meta charset="UTF-8">
<title>AngularJS Tutorial 1</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.12/angular.min.js"></script>
<script src="<c:url value="/js/Services.js"/>" type="text/javascript"></script>
</head>
<body ng-controller="ProductController">
	<h1>Your Order</h1>
	<div ng-repeat='item in items'>
		<span>{{item.name}}</span> <input ng-model='item.name'> <span>{{item.imageType
			| currency}}</span>
		<button ng-click="remove($index)">Remove</button>
	</div>
	</div>
</body>
</html>