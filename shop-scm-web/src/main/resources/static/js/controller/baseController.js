//公共代码
app.controller("baseController",function($scope){
	// 分页的配置的信息
$scope.paginationConf = {
		 currentPage: 1, // 当前页数
		 totalItems: 10, // 总记录数
		 itemsPerPage: 10, // 每页显示多少条记录
		 perPageOptions: [10, 20, 30, 40, 50],// 显示多少条下拉列表
		 onChange: function(){ // 当页码、每页显示多少条下拉列表发生变化的时候，自动触发了
			$scope.reloadList();// 重新加载列表
		 }
	};

	$scope.reloadList = function(){
    		$scope.search($scope.paginationConf.currentPage,$scope.paginationConf.itemsPerPage);
    	}
});