<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@include file="common/header.jsp"%>
<div class="page-title">
	<div class="title_left">
		<h3>
			<c:forEach var="users" items="${user}">
	          欢迎你：${users.devname}<strong> | 角色：开发者账户</strong>
			</c:forEach>
		</h3>
	</div>
</div>
<div class="clearfix"></div>


<%@include file="common/footer.jsp"%>
