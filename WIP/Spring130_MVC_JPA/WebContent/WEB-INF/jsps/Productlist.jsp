<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import ="com.jp.hr.entities.Product, java.util.ArrayList" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.jp.hr.entities.Product"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Head01.jsp"></jsp:include>

<jsp:include page="Head01.jsp"></jsp:include>
	
			Welcome ${ sessionScope.userFullname }
			<jsp:include page="Head02.jsp"></jsp:include>
	<%-- ${ requestScope.empList }--%>
	<table border="1">
	<tr>
		<th>Product Id</th>
		<th>Product Name</th>
	</tr>
<c:forEach items="${ requestScope.prdList }" var="prd">
<tr>
<td><a href="prdDetails.do?id=${ prd.productId }">${ prd.productId }</a></td>
<td>${ prd.productName }</td>
</tr>
</c:forEach>

	</table>
		<a href="MainMenu.do">Back</a>
	<a href="logout.do">Logout</a>
</body>
</html>