<%@page contentType= "text/html; charset=UTF-8" %>
<%@page import="web_basic.user" %>

<%
//リクエストスコープからのデータの取得
user objUser = (user)request.getAttribute("RequestUser");
String name = objUser.getName();
int age = objUser.getAge();
%>
<html>
	<head>
		<title>自作クラスのオブジェクトを登録する</title>
	</head>
	<body>
		名前は：<%= name %><br>
		年齢は：<%= age %><br>
	</body>
</html>