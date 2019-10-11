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
	<form >
		点名:<input type="text" name="gname"><br><br>
		创建日期:<input type="date" name="gdate"><br><br>
		商品:<c:forEach items="${typees}" var="s">
			<input type="checkbox" value="${s.sid }" name="sid">${s.sname }
			<input type="text" value="${s.sid }">
		</c:forEach><br><br>
		<input type="button" value="添加" onclick="tijiao()"> 
	</form>
</body>
<script type="text/javascript">

	function tijiao(){
		$.post(
			"/addgoods",
			$("form").serialize(),
			function (flag){
				alert("添加陈")
				location="/list"
			},
			"json"
		)
	}
</script>
</html>