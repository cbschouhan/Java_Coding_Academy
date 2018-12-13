<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="com.jp.hr.entities.Employee" %>
    <%@ page import = "java.util.ArrayList" %>    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee List</title>
</head>
<body>
<!-- 	<Table>EMPLOYEE LIST</Table> -->
	<!-- ${ requestScope.empList }  --> 
	<jsp:include page="Head01.jsp"></jsp:include>
	<jsp:include page="Head02.jsp"></jsp:include>
	<!-- <a href="logout.do">Logout</a> -->
	 <table border = "1">
	 
	 <!--This give jstl for employee mentioned below  -->
	<!--  	<tr>
	 		<th>Employee Id</th>
	 		<th>First Name</th>
	 		<th>Last Name</th>
		 </tr> -->
		<%--  <c:forEach items="${ requestScope.empList}" var="emp">
		 	<tr>
		 	 	<td>${emp.empId}</td>  <!-- this property empId will call getEmpId -->
		 		<td>${emp.firstName}</td>
		 		<td>${emp.lastName}</td>
		 	</tr>	
		 </c:forEach> --%>
		 
		 
 <!--This give jstl for employee details link below  this shows once you click on the view details link you will get the output -->
 
			 	<tr>
			 		<th>Employee Id</th>
			 		<th>View Details</th>			 		
			 	</tr>
			 	
			 	<c:forEach items="${ requestScope.empList}" var="emp">
		 	<tr>
		 	 	<td>${emp.empId}</td>  <!-- this property empId will call getEmpId -->
		 		<td><a href="empDetails.hr?id=${emp.empId}">View</a></td>		 		
		 	</tr>	
		 </c:forEach>
		 
		 <a href="mainMenu.do">Go back to Home</a> 		
 			 
		<!-- 1. This is the first thing you have to comment up part  --> 
		 <%-- 	<%	for (Employee emp :(ArrayList<Employee>)request.getAttribute("empList")) {
		 		
		 	
		 	%>
		 <tr>
		 	<td><%=emp.getEmpId()%></td>
		 	<td><%=emp.getFirstName()%></td>
		 	<td><%=emp.getLastName()%></td>		 	
		 </tr>
		 <%}%> --%>
		 
	</table> 
	 
</body>
</html>