<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String n1=request.getParameter("n1");
String n2=request.getParameter("n2");
String n3=request.getParameter("n3");
int a=Integer.parseInt(n1);  // convert to int
int b=Integer.parseInt(n2);
int c=Integer.parseInt(n3);

float avg=(a+b+c)/3;
out.println("Average="+avg);
if(avg>=60)
{
	out.println("First ");
}

else if(avg>=45 && avg<=59)
{
	out.println("Second ");
}
else
{
		out.println("Fail ");
}



%>
</body>
</html>