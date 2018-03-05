var app = angular.module("demoApp",[])
app.controller("demoCtrl", function($scope,$http){
    $scope.myFunc=function(){
    $http.get('/Student/StudentData').then(function(response) {      
                $scope.lists=response.data;
                
    });
    } 
});