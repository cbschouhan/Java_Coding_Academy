<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="com.jp.hr.entities.Employee, java.util.ArrayList" %>
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
				<th>Employee Id</th>
				<th>First Name</th>
				<th>Last Name</th>
			</tr>
			<tr>
				<td>${ requestScope.empDetails.empId }</td>
				<td>${ requestScope.empDetails.getFirstName() }</td>
				<td>${ requestScope.empDetails.getLastName()}</td>
			</tr>
	</table>
	<br/>
	<a align="center" href="getEmpList.hr">Go Back to List</a>
	</body>
</html>