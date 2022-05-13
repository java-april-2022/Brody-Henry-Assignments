<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>${dojo.name} Dojo</h1>
<table>
<thead>
	<tr>
	  <th>First Name</th>
      <th>Last Name</th>
      <th>Age</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items = "${dojo.ninjas}" var = "ninja">
    <tr>
      <td><c:out value="${ninja.firstName}"></c:out></td>
      <td><c:out value="${ninja.lastName}"></c:out></td>
      <td><c:out value="${ninja.age}"></c:out></td>
    </tr>
    </c:forEach>
    
    </tbody>
    
</table>
	
	
	<a href ="/dojo">New Dojo</a>
	<a href ="/ninja/new">New </a>
</body>
</html>