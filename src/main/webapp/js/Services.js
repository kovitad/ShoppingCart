function ProductController($scope, $http) {
	$http.get('/shoppingcart/services/productListing', {
		cache : true
	}).success(function(data, status, headers, config) {
		$scope.items = data;
	});
	$scope.remove = function(index) {
		$scope.items.splice(index, 1);
	}
}