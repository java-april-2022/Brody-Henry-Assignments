<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>New Ninja</h1>

<form:form action="/ninja/save" method="post" modelAttribute="ninja" class="form-group">
	<form:label path="firstName">First Name:</form:label>
    <form:input path="firstName" class="form-control"/>
    <form:errors class ="text-danger" path="firstName"/>
    
    <form:label path="lastName">Last Name:</form:label>
    <form:input path="lastName" class="form-control"/>
    <form:errors class ="text-danger" path="lastName"/>
    
     <form:label path="age">Age:</form:label>
    <form:input path="age" class="form-control"/>
    <form:errors class ="text-danger" path="age"/>
    
    <form:select path="dojo">
   		<c:forEach items="${dojo}" var="dojo">
   		<option value="${dojo.id}">${dojo.name}</option>
   		</c:forEach>
    </form:select>
    
    <button>Create Ninja</button>
</form:form>
</body>
</html>