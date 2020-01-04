<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%! int a=10,b=20,c=0; %>

<% c=a+b; %>
<b>Total of Given Two Nos:<%=c %></b>
<br>
Output Using Implicit Object of JspWriter 
<h1>Total of Nos <%out.println(c);
out.println("<br>To test Realoding of Java Content..");
out.println(request.getMethod());
%></h1>

</body>
</html>