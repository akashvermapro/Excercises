<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find By Designation</title>
</head>
<body>
<center>
	<form action="/findEmpByDesig" method="post">
	Enter Employee's Designation <input type=text name="desig"><br>
	<input type=submit value="Find Employee"><input type=reset value="Reset">
	</form>
</center>
</body>
</html>