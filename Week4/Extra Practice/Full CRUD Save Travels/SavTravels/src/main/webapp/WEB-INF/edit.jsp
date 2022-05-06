<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Expense</h1>
	<form:form action="/update/${editExpense.id}" method="put" modelAttribute="editExpense">
		<p>
			<form:label path="name">Item Name</form:label>
			<form:input path="name" />
			<form:errors class="text-danger" path="name" />
		</p>
		<p>
			<form:label path="description">Description</form:label>
			<form:textarea path="description" />
			<form:errors class="text-danger" path="description" />
		</p>
		<p>
			<form:label path="vendor">vendor</form:label>
        	<form:input path="vendor"/>
            <form:errors class="text-danger" path="vendor"/>
		</p>
		 <p>
        <form:label path="amount">amount</form:label>
        <form:input path="amount" type="double"/>
         <form:errors  class="text-danger" path="amount"/>
   		 </p>
		<button>Update Art</button>

	</form:form>
	
	<a href= "/"> GO Back</a>
</body>
</html>