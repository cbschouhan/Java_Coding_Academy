<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form"
    prefix="springForm"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Save Page</title>
<style>
.error {
    color: #ff0000;
    font-style: italic;
    font-weight: bold;
}
</style>
</head>
<body>
 	<p>
 		Employee ID: <br/>
 		Employee First Name: <br/>
 		Employee Last Name: <br/>

 	</p>
    <springForm:form method="POST" commandName="command"
        action="submitRegistrationData.hr">
        <table>
            <tr>
                <td>Employee ID:</td>
                <td><springForm:input path="empId" /></td>
                <td><springForm:errors path="empId" cssClass="error" /></td>
            </tr>
            <tr>
                <td>Employee First Name:</td>
                <td><springForm:input path="firstName" /></td>
                <td><springForm:errors path="firstName" cssClass="error" /></td>
            </tr>
            <tr>
            	<td>Employee Last Name:</td>
                <td><springForm:input path="lastName"/></td>
                <td><springForm:errors path="lastName" cssClass="error" /></td>
            </tr>
          
            <%-- <tr>
                <td>Employee Role:</td>
                <td><springForm:select path="role">
                        <springForm:option value="" label="Select Role" />
                        <springForm:option value="ceo" label="CEO" />
                        <springForm:option value="developer" label="Developer" />
                        <springForm:option value="manager" label="Manager" />
                    </springForm:select></td>
                <td><springForm:errors path="role" cssClass="error" /></td>
            </tr> --%>
            <tr>
                <td colspan="3"><input type="submit" value="Save"></td>
            </tr>
        </table>
 
    </springForm:form>
 
</body>
</html>
