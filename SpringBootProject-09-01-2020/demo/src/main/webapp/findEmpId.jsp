<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find By ID</title>
</head>
<body>
<center>
	<form action="/findEmpId" method="post" modelAttribute="emp">
	Enter Employee Id <input type=text name="id"required><br>
	<input type=submit value="Find Employee"><input type=reset value="Reset">
	</form>
</center>
</body>
</html>