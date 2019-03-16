app.service('brandService',function($http){
	//读取列表数据绑定到表单中
			this.search = function(page,rows,searchEntity){
        		return $http.post("../brand/search.do?page="+page+"&rows="+rows,searchEntity);
        	}
});
