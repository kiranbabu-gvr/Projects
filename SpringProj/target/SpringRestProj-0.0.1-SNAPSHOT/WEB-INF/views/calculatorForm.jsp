<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processCalcForm" method="post"
		modelAttribute="calculator">

		<table>
			<tr>
				<td><form:label path="firstNumber">First Number</form:label></td>
				<td><form:input path="firstNumber" /></td>
			</tr>
			<tr>
				<td><form:label path="secondNumber">Second Number</form:label></td>
				<td><form:input path="secondNumber" /></td>
			</tr>
			<tr>
				<td><form:label path="result">Result</form:label></td>
				<td>${calculator.result}</td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td><input type="submit" name="add" value="Add" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="substract" value="Substract" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="multiply" value="Multiply" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="divide" value="Divivde" /></td>
			</tr>

			<table>
				</form:form>
</body>
</html>