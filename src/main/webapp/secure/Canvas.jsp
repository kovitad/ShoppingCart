<%@ taglib prefix="s" uri="/struts-tags"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html ng-app="App">
<head>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.12/angular.min.js"></script>
<script src="<c:url value=" /js/script.js"/>" type="text/javascript"></script>
<script src="<c:url value=" /js/protractorTest.js"/>" type="text/javascript">
</script>
</head>
<body>

	<div ng-controller="FetchCtrl">
		<select ng-model="method">
			<option>GET</option>
			<option>JSONP</option>
		</select> <input type="text" ng-model="url" size="80" />
		<button id="fetchbtn" ng-click="fetch()">fetch</button>
		<br>
		<button id="samplegetbtn"
			ng-click="updateModel('GET', 'http-hello.html')">Sample GET</button>
		<button id="samplejsonpbtn"
			ng-click="updateModel('JSONP',
                  'http://angularjs.org/greet.php?callback=JSON_CALLBACK&name=Super%20Hero')">
			Sample JSONP</button>
		<button id="invalidjsonpbtn"
			ng-click="updateModel('JSONP', 'http://angularjs.org/doesntexist&callback=JSON_CALLBACK')">
			Invalid JSONP</button>
		<pre>http status code: {{status}}</pre>
		<pre>http response data: {{data}}</pre>
	</div>


</body>
</html>