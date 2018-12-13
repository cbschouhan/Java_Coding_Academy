<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Employee Saved Successfully</title>
</head>
<body>
	<h3>
	    Employee Saved Successfully.
	</h3>
	 
	<strong>Employee ID:${command.empId}</strong><br>
	<strong>Employee First Name:${command.firstName}</strong><br>
	<strong>Employee Last Name:${command.lastName}</strong><br>
 
</body>
</html>
