<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@include file="common/header.jsp"%>
<div class="clearfix"></div>
<div class="row">
	<div class="col-md-12">
		<div class="x_panel">
			<div class="x_title">
				<h2>
					APP 信息管理维护 <i class="fa fa-user"></i><small>${devUserSession.devName}
					- 您可以通过搜索或者其他的筛选项对APP的信息进行修改、删除等管理操作。^_^</small>
				</h2>
				<div class="clearfix"></div>
			</div>
			<div class="x_content">
				<form method="get" action="/dev/ListAll" id="fom1">
					<input type="hidden" name="currPage" value="1" />
					<ul>
						<li>
							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12">软件名称</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input name="softwarename" type="text" class="form-control col-md-7 col-xs-12" value="">
								</div>
							</div>
						</li>

						<li>
							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12">APP状态</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<select id="queryStatus" name="status" class="form-control">
										<option value="">--请选择--</option>
									</select>
								</div>
							</div>
						</li>
						<li>
							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12">所属平台</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<select id="queryFlatformId" name="flatformid" class="form-control">
											<option value="">--请选择--</option>
									</select>
								</div>
							</div>
						</li>
						<li>
							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12">一级分类</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<select id="queryCategoryLevel1" name="categorylevel1" class="form-control">
											<option value="">--请选择--</option>
									</select>
								</div>
							</div>
						</li>
						<li>
							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12">二级分类</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<select name="categoryLevel2" id="queryCategoryLevel2" class="form-control">
											<option value="">--请选择--</option>
									</select>
								</div>
							</div>
						</li>
						<li>
							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12">三级分类</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<select name="categoryLevel3" id="queryCategoryLevel3" class="form-control">
											<option value="">--请选择--</option>
									</select>
								</div>
							</div>
						</li>
						<li><button type="submit" class="btn btn-primary"> 查 &nbsp;&nbsp;&nbsp;&nbsp;询 </button></li>
					</ul>
				</form>
			</div>
		</div>
	</div>
	<div class="col-md-12 col-sm-12 col-xs-12">
		<div class="x_panel">
			<div class="x_content">
				<p class="text-muted font-13 m-b-30"></p>
				<div id="datatable-responsive_wrapper"
					 class="dataTables_wrapper form-inline dt-bootstrap no-footer">
					<div class="row">
						<div class="col-sm-12">
							<a href="${pageContext.request.contextPath}/dev/flatform/app/appinfoadd" class="btn btn-success btn-sm">新增APP基础信息</a>
							<table id="datatable-responsive" class="table table-striped table-bordered dt-responsive nowrap dataTable no-footer dtr-inline collapsed"
								   cellspacing="0" width="100%" role="grid" aria-describedby="datatable-responsive_info" style="width: 100%;">
								<thead>
								<tr role="row">
									<th class="sorting_asc" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										aria-label="First name: activate to sort column descending"
										aria-sort="ascending">软件名称</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										aria-label="Last name: activate to sort column ascending">
										APK名称</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										aria-label="Last name: activate to sort column ascending">
										软件大小(单位:M)</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										aria-label="Last name: activate to sort column ascending">
										所属平台</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										aria-label="Last name: activate to sort column ascending">
										所属分类(一级分类、二级分类、三级分类)</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										aria-label="Last name: activate to sort column ascending">
										状态</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										aria-label="Last name: activate to sort column ascending">
										下载次数</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										aria-label="Last name: activate to sort column ascending">
										最新版本号</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										style="width: 124px;"
										aria-label="Last name: activate to sort column ascending">
										操作</th>
								</tr>
								</thead>
								<tbody>
								<c:forEach var="appInfo" items="${list}" varStatus="status">
									<tr role="row" class="odd">
										<td tabindex="0" class="sorting_1">${appInfo.softwarename}</td>
										<td>${appInfo.apkname }</td>
										<td>${appInfo.softwaresize }</td>
										<td>${appInfo.flatfromname }</td>
										<td>${appInfo.l1 } -> ${appInfo.l2 } -> ${appInfo.l3 }</td>
										<td><span id="appInfoStatus${appInfo.id}">${appInfo.status2 }</span></td>
										<td>${appInfo.downloads }</td>
										<td>${appInfo.versionid2 }</td>
										<td>


											<div class="btn-group">
												<button type="button" class="btn btn-danger">点击操作</button>
												<button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
													<span class="caret"></span>
													<span class="sr-only">Toggle Dropdown</span>
												</button>
												<ul class="dropdown-menu" role="menu">
													<li>
														<c:choose>
															<c:when test="${appInfo.status == 2 || appInfo.status == 5}">
																<a class="saleSwichOpen" saleSwitch="open" appinfoid=${appInfo.id }  appsoftwarename=${appInfo.softwarename } data-toggle="tooltip" data-placement="top" title="" data-original-title="恭喜您，您的审核已经通过，您可以点击上架发布您的APP">上架</a>
															</c:when>
															<c:when test="${appInfo.status == 4}">
																<a class="saleSwichClose" saleSwitch="close" appinfoid=${appInfo.id }  appsoftwarename=${appInfo.softwarename } data-toggle="tooltip" data-placement="top" title="" data-original-title="您可以点击下架来停止发布您的APP，市场将不提供APP的下载">下架</a>
															</c:when>
														</c:choose>
													</li>
													<li><a class="addVersion" appinfoid="${appInfo.id }" data-toggle="tooltip" data-placement="top" title="" data-original-title="新增APP版本信息">新增版本</a>
													</li>
													<li><a class="modifyVersion"
														   appinfoid="${appInfo.id }" versionid="${appInfo.versionid }" status="${appInfo.status }"
														   statusname="${appInfo.status2 }"
														   data-toggle="tooltip" data-placement="top" title="" data-original-title="修改APP最新版本信息">修改版本</a>
													</li>
													<li><a  class="modifyAppInfo"
															appinfoid="${appInfo.id }" status="${appInfo.status }" statusname="${appInfo.status2 }"
															data-toggle="tooltip" data-placement="top" title="" data-original-title="修改APP基础信息">修改</a></li>
													<li><a  class="viewApp" appinfoid=${appInfo.id }  data-toggle="tooltip" data-placement="top" title="" data-original-title="查看APP基础信息以及全部版本信息">查看</a></li>
													<li><a  class="deleteApp" appinfoid=${appInfo.id }  appsoftwarename=${appInfo.softwarename } data-toggle="tooltip" data-placement="top" title="" data-original-title="删除APP基础信息以及全部版本信息">删除</a></li>
												</ul>
											</div>
										</td>
									</tr>
								</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
			</div>
		</div>
	</div>
</div>
<%@include file="common/footer.jsp"%>
	<script>

		$(function () {
			$.post("/getAppStatue",null,function (data) {
              for (var i=0;i<data.length;i++){
                  var option = "<option value="+data[i].valueid+">"+data[i].valuename+"</option>";
                  $("#queryStatus").append(option);
			  }
            },"json");
            $.post("/getAppPing",null,function (data) {
                for (var i=0;i<data.length;i++){
                    var option = "<option value="+data[i].valueid+">"+data[i].valuename+"</option>";
                    $("#queryFlatformId").append(option);
                }
            },"json");
			//一级分类
            $.post("/getcategory",null,function (data) {
                for (var i=0;i<data.length;i++){
                    var option = "<option value="+data[i].id+">"+data[i].categoryname+"</option>";
                    $("#queryCategoryLevel1").append(option);
                }
            },"json");
            //二级分类
            $("#queryCategoryLevel1").change(function () {
                var parentId = $(this).val();
				$("#queryCategoryLevel2 option:gt(0)").remove();
				if (parentId!="") {
                    $.post("/getcategory", {"id": parentId}, function (data) {
                        for (var i = 0; i < data.length; i++) {
                            var option = "<option value=" + data[i].id + ">" + data[i].categoryname + "</option>";
                            $("#queryCategoryLevel2").append(option);
                        }
                    }, "json");
                }
            });
            //三级分类
            $("#queryCategoryLevel2").change(function () {
                var parentId = $(this).val();
                $("#queryCategoryLevel3 option:gt(0)").remove();
                if (parentId!="") {
                    $.post("/getcategory", {"id": parentId}, function (data) {
                        for (var i = 0; i < data.length; i++) {
                            var option = "<option value=" + data[i].id + ">" + data[i].categoryname + "</option>";
                            $("#queryCategoryLevel3").append(option);
                        }
                    }, "json");
                }
            });
        })
	</script>
<%--<script src="${pageContext.request.contextPath }/statics/localjs/rollpage.js"></script>
<script src="${pageContext.request.contextPath }/statics/localjs/appinfolist.js"></script>--%>
