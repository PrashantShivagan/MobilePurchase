<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<Table border=1px>
<tr>
<th>Mobile ID</th>
<th>Mobile Name</th>
<th>Mobile Price</th>
<th>Purchase</th>

</tr>
<a:forEach var="mob" items="${temp}">
<tr>
<td>${mob.mobid}</td>
<td>${mob.mobNmae}</td>
<td>${mob.mobPrice}</td>
<td><a href="purchase.jsp?mobName=${mob.mobNmae}">Purchase</a></td>
</tr>

</a:forEach>
</Table>
</body>
</html>