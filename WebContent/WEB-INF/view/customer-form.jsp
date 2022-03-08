<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Registration Form</title>
<style>
	.error{
		color:red
	}
</style>
</head>
<body>
	<form:form action="processCustomer" modelAttribute="customer">
		First Name: <form:input path="firstName"/>
		</br>
		Last Name(*): <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"/>
		</br>
		Phone Number(*): <form:input path="phoneNumber"/>
		<form:errors path="phoneNumber" cssClass="error"/>
		</br>
		Postal Code(*): <form:input path="postalCode"/>
		<form:errors path="postalCode" cssClass="error"/>
		</br>
		<input type="submit" value="submit"/>
	</form:form>
</body>
</html>