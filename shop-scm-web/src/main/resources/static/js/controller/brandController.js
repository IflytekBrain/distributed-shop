 //品牌控制层
app.controller('brandController' ,function($scope,brandService){
     //读取列表数据绑定到表单中
	$scope.findAll=function(){
		brandService.findAll().success(
			function(response){
				$scope.list=response;
			}
		);
	}
	 // 分页查询
    $scope.findByPage = function(page,rows){
    		// 向后台发送请求获取数据:
    		brandService.findByPage(page,rows).success(function(response){
    		    //$scope.paginationConf.totalItems改变分页控件的总条数，
    		    //这时分页控件自动按总条数分也页
    			$scope.paginationConf.totalItems = response.total;
    			$scope.list = response.rows;
    		});
    	}
});
