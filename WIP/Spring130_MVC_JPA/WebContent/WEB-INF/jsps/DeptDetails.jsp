<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="com.jp.hr.entities.Emp, java.util.ArrayList" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Employee Details</title>
	</head>
	<br/>
	<body>
		
		<jsp:include page="Head01.jsp"></jsp:include>
			<jsp:include page="Head02.jsp"></jsp:include>
			<br/>
		<table border="1">
			<tr>
				<th>Dept Id</th>
				<th>Dept Name</th>
			
			</tr>
			<tr>
				<td>${ requestScope.deptDetails.deptNo }</td>
				<td>${ requestScope.deptDetails.deptNm }</td>
			</tr>
	</table>
	

	<table border="1">
	<tr>
		<th>Employee Id</th>
		<th>Employee Name</th>
	</tr>
	<c:forEach items="${ requestScope.deptDetails.empList }" var="emp">
		<tr>
		<td>${ emp.empNo }</td>
		<td>${ emp.empNm }</td>
		
	</tr>
	</c:forEach>
	<%--<% 
		for(Employee emp : (ArrayList<Employee>)request.getAttribute("empList")){
		<tr>
		<td><%= emp.getEmpId() %></td>
		<td><%= emp.getFirstName() %></td>
		<td><%= emp.getLastName() %></td>
	</tr>
	<%} %>--%>
	</table>
	
	<br/>
	<a align="center" href="getDeptList.hr">Go Back to List</a>
	</body>
</html>