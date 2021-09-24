<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.odk.servlet.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${list[1].nom}</h1>
	<% ArrayList<User> u = (ArrayList) request.getAttribute("list"); %>
	<% for(int i = 0; i< u.size();i++){ %>
	
	<p><%=u.get(i).getNom()%></p>
	<p><%=u.get(i).getLogin()%></p>
	<%} %>
	
</body>
</html>