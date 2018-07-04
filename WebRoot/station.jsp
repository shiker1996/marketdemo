<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'clist.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<table bordercolor="red">
		<tr>
			<td>商品名</td>
			<td>数量</td>
			<td>价格</td>
			<td>上架日期</td>
			<td>生产日期</td>
			<td>保质期</td>
		</tr>
		<tr>
			<td>${good.name }</td>
			<td>${good.num }</td>
			<td>${good.pride }</td>
			<td>${good.onshelf }</td>
			<td>${good.prodate }</td>
			<td>${good.reldate }</td>
		</tr>
		<%if(request.getParameter("customer")!=null){ %>
			<tr>
				<a href="http://localhost:8080/csgl/clist">返回商品页</a>
			</tr>
		<%} else if(request.getParameter("employee")!=null){%>
			<tr>
				<a href="http://localhost:8080/csgl/elist">返回商品页</a>
			</tr>
		<%} %>
	</table>
</body>
</html>
