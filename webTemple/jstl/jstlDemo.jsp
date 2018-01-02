<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	pageContext.setAttribute("num",20);
%>
<c:if test="${num>20}">num>20</c:if>
<br />
<c:choose>
<c:when test="${num>20 }">num>20</c:when>
<c:when test="${num<20 }">num<20</c:when>
<c:otherwise>num=20</c:otherwise>
</c:choose>


</body>
</html>