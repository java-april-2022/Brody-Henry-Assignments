<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/CSS/main.css"/>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Send an Omikuji</h2>
	<div class = "form-control">
	    <form action='/omikujiPost' method='post'>
	   <div>
		<label >Pick any number from 5 to 25</label>
	    	<input type="number" name='number'>
	    </div>
		<label  >Enter the name of any City</label>
	    	<input type='text' name='city'>
	    <div>	
	    <label >Enter the name of any real person</label>
	    	<input type='text' name='person'>
	    </div>	
	    <label >Enter professional endeavor or hobby</label>
	    	<input type='text' name='hobby'>
	    <div>	
	    <label >Enter any type of living thing</label>
	    	<input type='text' name='thing'>
	    </div>	
	    <label >say something nice to someone</label>
	    <div>
	    <textarea name="nice" rows="4" cols="10"></textarea>
	    </div>
	    	<input type='submit' value='sumbit'>
	    </form>
	    </div>
</body>
</html>