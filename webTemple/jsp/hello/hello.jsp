<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
当前时间: <%= new Date().toString() %>
<%
	String name = "kate";
	int age = 21;
%>
<%!
	private String book;
	private int number;
%>
<%= "<br />"+"name:"+name+";"+"age"+age %>
<br />
<%
	int num = 10;
	if(num>5){
		out.print("大于5");
	}else{
		out.print("小于5");
	}
%>

</body>
</html>