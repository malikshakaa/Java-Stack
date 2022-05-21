<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Omikuji</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
    <h3>Send an Omikujix</h3>
    <form action='/login' method='POST'>
   	<label>Pick any number from 5 to 25:</label>
    	<input type="number" id="quantity" name="quantity" min="5" max="25">
	<label>Enter any name of any city:</label>
    	<input type="text" name='name'>
	<label>Enter any name of any real person:</label>
    	<input type="text" name='person'>
	<label>Enter professional endeavor or hobby:</label>
    	<input type="text" name='hobby'>
	<label>Enter any type of living thing.:</label>
	  	<input type="text" name='living'>
	<label>Say something nice to someone::</label>
		<input type="text" name='nice'>
	<label>Send and show a friend:</label>
    	<input type='submit' value='send'>
    	    </form>
</body>
</html>