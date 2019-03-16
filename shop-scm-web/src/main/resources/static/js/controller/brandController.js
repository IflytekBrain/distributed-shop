 //品牌控制层
app.controller("brandController",function($scope,$controller,$http,brandService){
        $controller('baseController',{$scope:$scope});
        $scope.searchEntity={};
    	// 假设定义一个查询的实体：searchEntity
    	$scope.search = function(page,rows){
    		// 向后台发送请求获取数据:
    		brandService.search(page,rows,$scope.searchEntity).success(function(response){
    			$scope.paginationConf.totalItems = response.total;
    			$scope.list = response.rows;
    		});
    	}
});
