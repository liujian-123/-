<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="<%=path%>/resource/mystyles.css"/> 
<script type="text/javascript" src="<%=path%>/resource/jquery-3.2.1.js"></script>
</head>
<body>
	<input type="button" value="添加" onclick="add()">
	<table>
		<tr>
			<td>编号</td>
			<td>店铺名称</td>
			<td>创建日期</td>
			<td>销售商品</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="s">
		<tr>
			<td>${s.gid }</td>
			<td>${s.gname}</td>
			<td>${s.gdate}</td>
			<td>${s.sname }</td>
			<td>
				<input type="button" value="删除" onclick="del(${s.gid})">
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
<script type="text/javascript">
	function add(){
		location.href="/add";
	}
	function del(id){
		alert(id)
	}
</script>
</html>