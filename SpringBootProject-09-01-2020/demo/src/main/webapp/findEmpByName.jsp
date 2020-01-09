<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find By Name</title>
</head>
<body>
<center>
	<form action="/findEmpByName" method="post">
	Enter Employee's Name<input type=text name="name"><br>
	<input type=submit value="Find Employee"><input type=reset value="Reset">
	</form>
</center>
</body>
</html>