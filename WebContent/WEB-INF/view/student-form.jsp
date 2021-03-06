<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>
<body>
	
	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName"/>
		</br>
		Last Name: <form:input path="lastName"/>
		</br>
		<%-- Country: <form:select path="country">
			<form:option value="Brazil"  label="Brazil" />
			<form:option value="France"  label="France" />
			<form:option value="Germany"  label="Germany" />
			<form:option value="India"  label="India" />
		</form:select> --%>
		Country: <form:select path="country">
			<form:options items="${student.countryOptions}" />
		</form:select>
		</br>
		<input type="submit" value="submit"/>
	</form:form>
	
</body>
</html>