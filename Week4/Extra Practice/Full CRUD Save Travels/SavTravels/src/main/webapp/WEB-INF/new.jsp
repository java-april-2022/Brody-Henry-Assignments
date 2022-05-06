<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>

<title>Insert title here</title>
</head>
<body>
<h1>New Expense</h1>
		<form:form action="/create" method="post" modelAttribute="newExpense">
 	<p>
        <form:label path="name">item name</form:label>
    
        <form:input path="name"/>
            <form:errors class="text-danger" path="name"/>
    </p>
    <p>
        <form:label path="vendor">vendor</form:label>
    
        <form:input path="vendor"/>
            <form:errors class="text-danger" path="vendor"/>
    </p>
    <p>
        <form:label path="description">Description</form:label>
       
        <form:textarea path="description"/>
         <form:errors  class="text-danger"  path="description"/>
    </p>
     <p>
        <form:label path="amount">amount</form:label>
        <form:input path="amount" type="double"/>
         <form:errors  class="text-danger" path="amount"/>
    </p>
    <button>Create Expense</button>
</form:form>

	
</body>
</html>