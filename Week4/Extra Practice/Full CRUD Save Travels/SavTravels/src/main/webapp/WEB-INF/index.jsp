<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="/new">New Expense</a>
<div>
<table class="table table-dark">
		 <thead>
			    <tr>
			      <th>Item Name:</th>
			      <th>Vendor</th>
			      <th>Amount</th>
			      <th>Action</th>
			    </tr>
  			</thead>	
  			<tbody>
		<c:forEach items="${allExpenses}" var="expense">
			<tr>
				<td><a href="/retrieve/${expense.id}">${expense.name}</a></td>
				<td><c:out value="${expense.vendor}"></c:out></td>
				<td>$<c:out value="${expense.amount}"/></td>
				<td>
				<a href="/edit/${expense.id}">Edit</a>
				<form:form action="/delete/${expense.id}" method="delete">
					<button>Delete</button>
				</form:form>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>