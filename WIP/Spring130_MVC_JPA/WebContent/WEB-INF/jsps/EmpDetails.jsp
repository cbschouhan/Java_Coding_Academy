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
				<th>Employee No</th>
				<th>Employee Name</th>
				<th>Salary</th>
				<th>Department No</th>
				<th>Department Name</th>
			</tr>
			<tr>
				<td>${ requestScope.empDetails.empNo }</td>
				<td>${ requestScope.empDetails.empNm }</td>
				<td>${ requestScope.empDetails.empSal}</td>
				<td>${ requestScope.empDetails.dept.deptNo}</td>
				<td>${ requestScope.empDetails.dept.deptNm}</td>
			</tr>
	</table>
	<br/>
	<a align="center" href="getEmpList.hr">Go Back to List</a>
	</body>
</html>