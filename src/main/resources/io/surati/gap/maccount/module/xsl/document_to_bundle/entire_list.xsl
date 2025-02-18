<?xml version="1.0" encoding="UTF-8"?>
<!--
Copyright (c) 2022 Surati

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to read
the Software only. Permissions is hereby NOT GRANTED to use, copy, modify,
merge, publish, distribute, sublicense, and/or sell copies of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
-->
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:sec="http://www.surati.io/Security/User/Profile" version="2.0">
  <xsl:output method="html" include-content-type="no" doctype-system="about:legacy-compat" encoding="UTF-8" indent="yes"/>
  <xsl:include href="/io/surati/gap/web/base/xsl/layout.xsl"/>
  <xsl:template match="page" mode="head">
    <title><xsl:text>GAP</xsl:text> - <xsl:value-of select="root_page/title"/> - <xsl:value-of select="root_page/subtitle"/>
    </title>
  </xsl:template>
  <xsl:template match="page" mode="header">
    <div class="app-page-title app-page-title-simple">
      <div class="page-title-wrapper">
        <div class="page-title-heading">
          <div class="page-title-icon">
            <i class="lnr-briefcase icon-gradient bg-night-fade"/>
          </div>
          <div>
            <xsl:value-of select="root_page/title"/>
            <div class="page-title-subheading opacity-10">
              <nav class="" aria-label="breadcrumb">
                <ol class="breadcrumb">
                  <li class="breadcrumb-item">
                    <a href="/home">
                      <i aria-hidden="true" class="fa fa-home"/>
                    </a>
                  </li>
                  <li class="active breadcrumb-item">
                    <xsl:value-of select="root_page/subtitle"/>
                  </li>
                </ol>
              </nav>
            </div>
          </div>
        </div>
      </div>
    </div>
  </xsl:template>
  <xsl:template match="page" mode="body">
    <div class="main-card mb-3 card card-body" app="app" ng-controller="AppCtrl as vm">
      <div class="card-header">
        <div class="card-header-title font-size-lg text-capitalize font-weight-normal">
          <xsl:value-of select="root_page/subtitle"/>
        </div>
      </div>
      <div class="card-body">
        <div class="row dataTables_wrapper dt-bootstrap4">
          <div class="col-sm-12 col-md-3">
            <div class="dataTables_length">
              <label>Afficher 
	      				<select name="example_length" aria-controls="example" class="custom-select custom-select-sm form-control form-control-sm" ng-model="vm.nbItemsPerPage" ng-options="option for option in vm.nbperpageoptions" ng-change="vm.nbItemsPerPageChanged(vm.nbItemsPerPage)"/> éléments
     				</label>
            </div>
          </div>
          <div class="col-sm-12 col-md-9">
            <div class="input-group input-group-sm">
              <div class="input-group-prepend">
                <span class="input-group-text">Contient</span>
              </div>
              <input type="search" class="form-control form-control-sm" placeholder="N° document, Imputation" aria-controls="example" ng-model="vm.filter" ng-model-options="{{ debounce: 1500 }}" ng-change="vm.search()" aria-describedby="search-addon"/>
              <div class="input-group-append">
                <span class="input-group-text" id="search-addon1">
                  <i class="fa fa-search"/>
                </span>
              </div>
            </div>
          </div>
        </div>
        <div class="row mt-2">
          <div class="col-sm-12 col-md-4 offset-md-4">
            <div class="d-flex align-items-center">
              <label class="col-md-4">Année:</label>
              <select class="col-md-8 custom-select custom-select-sm form-control form-control-sm" aria-controls="example" ng-model="vm.yearId" ng-model-options="{{ debounce: 500 }}" ng-change="vm.search()">
                <option ng-repeat="item in vm.years" value="{{{{item.id}}}}">{{item.id}}</option>
              </select>
            </div>
          </div>
          <div class="col-sm-12 col-md-4">
            <div class="d-flex align-items-center">
              <label class="col-md-4">Titre:</label>
              <select class="col-md-8 custom-select custom-select-sm form-control form-control-sm" aria-controls="example" ng-model="vm.titleId" ng-model-options="{{ debounce: 500 }}" ng-change="vm.search()">
                <option value="0"> -- Choisir un titre -- </option>
                <option ng-repeat="item in vm.titles" value="{{{{item.id}}}}">{{item.name}}</option>
              </select>
            </div>
          </div>
        </div>
        <div class="row mt-2">
          <div class="col-sm-12 col-md-4 offset-md-4">
            <div class="d-flex align-items-center">
              <label class="col-md-4">Section:</label>
              <select class="col-md-8 custom-select custom-select-sm form-control form-control-sm" aria-controls="example" ng-model="vm.sectionId" ng-model-options="{{ debounce: 500 }}" ng-change="vm.search()">
                <option value="0"> -- Choisir une section -- </option>
                <option ng-repeat="item in vm.sections" value="{{{{item.id}}}}">{{item.name}}</option>
              </select>
            </div>
          </div>
          <div class="col-sm-12 col-md-4">
            <div class="d-flex align-items-center">
              <label class="col-md-4">Liasse:</label>
              <select class="col-md-8 custom-select custom-select-sm form-control form-control-sm" aria-controls="example" ng-model="vm.bundleId" ng-model-options="{{ debounce: 500 }}" ng-change="vm.search()">
                <option value="0"> -- Choisir une liasse -- </option>
                <option ng-repeat="item in vm.bundles" value="{{{{item.id}}}}">{{item.name}}</option>
              </select>
            </div>
          </div>
        </div>
        <div class="row mt-2" ng-if="vm.loadingData">
          <div class="col-sm-12 text-center">
            <h4 class="text-muted">Chargement des données... <small>Veuillez patienter</small></h4>
            <img src="/io/surati/gap/web/base/img/loader.gif" width="250"/>
          </div>
        </div>
        <div class="mt-2" ng-if="!vm.loadingData">
          <h6 class="text-center pb-1 pt-5" ng-if="vm.items.length == 0">
            <xsl:text>Il n'y a aucun document trouvé.</xsl:text>
          </h6>
          <div class="row" ng-if="vm.items.length &gt; 0">
            <div class="col-sm-12 col-md-12">
              <button type="button" class="mb-1 mr-1 btn btn-sm btn-success" ng-click="vm.selectMultiple()" ng-disabled="vm.loadingSelectMultiple"><i class="fa fa-spinner fa-spin" ng-if="vm.loadingSelectMultiple"/><i class="lnr-book" ng-if="!vm.loadingSelectMultiple"/> Enliasser les éléments sélectionnés
                    </button>
            </div>
            <div class="col-sm-12 col-md-12">
              <div class="table-responsive">
                <table class="table table-hover table-striped table-bordered table-sm dataTable dtr-inline">
                  <thead>
                    <tr>
                      <th>
                        <input type="checkbox" ng-model="vm.selectAll" ng-change="vm.selectAllChanged(vm.selectAll)"/>
                      </th>
                      <th>N°</th>
                      <th>Année</th>
                      <th>Titre</th>
                      <th>Section</th>
                      <th>Liasse</th>
                      <th>Document</th>
                      <th>Imputation</th>
                      <th>Bénéficiaire</th>
                      <th>Montant</th>
                      <th>Actions</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr ng-repeat="item in vm.items">
                      <td>
                        <input type="checkbox" ng-model="item.selected"/>
                      </td>
                      <td>
			                    {{ vm.firstPosition + $index }}
			                  </td>
                      <td>
			                    {{ item.year_of_payment }}
			                  </td>
                      <td>
								  {{ item.title }}
							  </td>
                      <td>
								  {{ item.section }}
							  </td>
                      <td>
								  {{ item.bundle }}
							  </td>
                      <td>
			                    {{ item.name }}
			                  </td>
                      <td>
								  {{ item.imputation }}
							  </td>
                      <td>
			                    {{ item.beneficiary }}
			                  </td>
                      <td>
			                    {{ item.total_amount_in_human }}
			                  </td>
                      <td>
                        <div role="group">
                          <xsl:if test="sec:hasAccess(.,'VISUALISER_DOCUMENT_REF')">
                            <a href="/reference-document/view?id={{{{item.id}}}}&amp;{root_page/full}" class="mb-1 mr-1 btn btn-xs btn-outline-primary">
                              <i class="fa fa-eye"/>
                            </a>
                          </xsl:if>
                        </div>
                      </td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </div>
            <div class="d-block p-4 card-footer">
              <div ng-if="vm.annual_amount_paid &gt; 0" class="badge badge-pill badge-success">Total : {{vm.annual_amount_paid_in_human}}</div>
              <div ng-if="!(vm.annual_amount_paid &gt; 0)" class="badge badge-pill badge-danger">Total : {{vm.annual_amount_paid_in_human}}</div>
            </div>
          </div>
          <div class="row mt-3" ng-if="vm.items.length &gt; 0">
            <div class="col-sm-12 col-md-5">
              <div class="dataTables_info" id="example_info" role="status" aria-live="polite">Affichant de {{vm.firstPosition}} à {{vm.lastPosition}} - {{vm.totalCount}} éléments</div>
            </div>
            <div class="col-md-7">
              <ul uib-pagination="" first-text="Premier" last-text="Dernier" previous-text="Précédent" next-text="Suivant" total-items="vm.totalCount" ng-model="vm.currentPage" items-per-page="vm.nbItemsPerPage" max-size="vm.pageSize" num-pages="vm.pagesCount" class="pagination-md float-right" rotate="false" boundary-links="true" force-ellipses="true" ng-change="vm.pageChanged()"/>
            </div>
          </div>
        </div>
      </div>
    </div>
  </xsl:template>
  <xsl:template match="page" mode="custom-script">
    <script type="text/javascript"><![CDATA[
				var app = angular.module("app", ['ui.bootstrap']);			
	
				app.controller("AppCtrl", ["$scope", "$http", "$httpParamSerializerJQLike", function ($scope, $http, $httpParamSerializerJQLike) {
					   var vm = this;

		               vm.nbItemsPerPageChanged = function(newnb) {
		               		vm.search();
		               }
		               
		               vm.filterChanged = function(filter) {
		               		vm.search();
		               }
		               
		               vm.search = function() {							
				            var config = {
				                params: {
				                    page: vm.currentPage,
				                    nbperpage: vm.nbItemsPerPage,
				                    filter: vm.filter,
				                    year_of_payment: vm.yearId,
									section_id: vm.sectionId,
									title_id: vm.titleId,
									bundle_id: vm.bundleId
				                }
				            };
				
				            vm.loadingData = true;
				            return $http.get('/maccount/document-to-bundle/entire/search', config).then(
						            function(response){
						            	vm.loadingData = false;
						            	
						            	vm.totalCount = response.data.count;						            
							            vm.items = response.data.items;
						                vm.annual_amount_paid = response.data.annual_amount_paid;
						                vm.annual_amount_paid_in_human = response.data.annual_amount_paid_in_human;
							            vm.firstPosition = vm.nbItemsPerPage * (vm.currentPage - 1) + 1;
							            vm.lastPosition = vm.firstPosition + vm.items.length - 1;
						            },
						            function(error){
						            	vm.loadingData = false;
						            }
				            );
				       }
				       
				       vm.selectSelection = function() {
					      vm.loadingSelectSelection = true;
					   	  select([], function() {
					   	  	vm.loadingSelectSelection = false;
					   	  });
					   }
					   
					   vm.selectMultiple = function() {
					      var docids = [];
					      vm.items.forEach(function(item, index) {
					      	if(item.selected) {
					      	   docids.push(item.id);
					      	}
					      });
					      if(docids.length == 0) {
					      	return;
					      }
					      vm.loadingSelectMultiple = true;
					   	  select(docids, function() {
					   	  	vm.loadingSelectMultiple = false;
					   	  });
					   }
					   
					   vm.selectOne = function(item) {
					   	   item.loadingSelectOne = true;
					   	   select([item.id], function() {
					   	   	 item.loadingSelectOne = false;
					   	   });
					   }
					   
         			   function select(docids, callback) {							
				            var data = {
			                    page: vm.currentPage,
			                    nbperpage: vm.nbItemsPerPage,
			                    filtercontains: vm.filterContains,
			                    filternotcontains: vm.filterNotContains,
			                    editbegindate: vm.editbegindate,
			                    editenddate: vm.editenddate,
			                    year_of_payment: vm.yearId,
			                    section_id: vm.sectionId,
			                    title_id: vm.titleId,
			                    bundle_id: vm.bundleId,
			                    refdocids: docids
			                };
			                
				            return $http(
					            {
								    url: '/reference-document/select',
								    method: 'POST',
								    data: $httpParamSerializerJQLike(data),
								    headers: {
								      'Content-Type': 'application/x-www-form-urlencoded'
								    }
								}
							).then(
					            function(response){
					            	vm.totalCount = response.data.count;						            
						            vm.items = response.data.items;
						            vm.total_amount = response.data.total_amount;
						            vm.total_amount_in_human = response.data.total_amount_in_human;
						            vm.amount_selected = response.data.amount_selected;
						            vm.amount_selected_in_human = response.data.amount_selected_in_human;
						            vm.amount_left = response.data.amount_left;
						            vm.amount_left_in_human = response.data.amount_left_in_human;
						            vm.selectAll = false;
						            vm.firstPosition = vm.nbItemsPerPage * (vm.currentPage - 1) + 1;
						            vm.lastPosition = vm.firstPosition + vm.items.length - 1;
						            callback();
					            },
					            function(error){
					                callback();
					                toastr.error(error.data.message);
					            }
				            );
				       }
				        
          			   vm.selectAllChanged = function(selected){
          			   	   vm.items.forEach(function(item, index) {
          			   	   		item.selected = selected;
          			   	   });
          			   }
          			   
		               vm.pageChanged = function(){
		               		vm.search();
		               };	
		               
		               vm.sections = [
			                    ]]><xsl:for-each select="sections/section">
			                    {
			                    	id: '<xsl:value-of select="id"/>',
			                    	name: "<xsl:value-of select="fullname"/>"
			                    },
			                    </xsl:for-each><![CDATA[
			           ];
			           
			           vm.bundles = [
			                    ]]><xsl:for-each select="bundles/bundle">
			                    {
			                    	id: '<xsl:value-of select="id"/>',
			                    	name: "<xsl:value-of select="code"/>"
			                    },
			                    </xsl:for-each><![CDATA[
			           ];

			           vm.titles = [
			                    ]]><xsl:for-each select="titles/title">
									{
									id: '<xsl:value-of select="id"/>',
									name: "<xsl:value-of select="fullname"/>"
									},
								</xsl:for-each><![CDATA[
					   ];

					   vm.years = [
			                    ]]><xsl:for-each select="budget_years/budget_year">
									{
									id: '<xsl:value-of select="."/>'
									},
								</xsl:for-each><![CDATA[
					   ];
		               
					   this.$onInit = function(){
						    vm.totalCount = 0;
			                vm.firstPosition = 0;
			                vm.lastPosition = 0;
			                vm.nbperpageoptions = [10, 25, 50, 100];
					   	    vm.nbItemsPerPage = 25;
					   	    vm.currentPage = 1;
					   	    vm.pageSize = 5;
					   	    vm.sectionId = "0";
					   	    vm.bundleId = "0";
					   	    vm.titleId = "0";
					   	    vm.yearId = vm.years[0].id;
					   	    vm.amountSelected = "O FCFA";
					   	    vm.search();
					   };
			    }]);	
				
				angular.bootstrap(document, ['app']);			
        ]]></script>
  </xsl:template>
</xsl:stylesheet>
