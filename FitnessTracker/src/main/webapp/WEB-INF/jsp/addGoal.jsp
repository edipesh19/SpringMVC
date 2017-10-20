<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fitness Tracker</title>
</head>
<body>
	<!-- example of spring form tag  -->
	<!-- form take a command name here it is goal -->
	<form:form commandName="goal">
		<tr>
			<td>Enter Minutes:</td>
			<!-- minutes is an attribute present in the goal object -->
			<td><form:input path="minutes" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Enter Goal Minutes">
			</td>
		</tr>
	</form:form>
</body>
</html>