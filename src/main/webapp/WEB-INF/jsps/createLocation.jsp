<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Location</title>
</head>
<body>

<form action="saveLoc" method="post">
<pre>
Id:<input type="text" name="id" />
Code:<input type="text" name="code" />
Name:<input type="text" name="name" />
Type: <input type="radio" name="type" value="rural"/> Rural
	  <input type="radio" name="type" value="urban"/>Urban

	<input type="submit" value="Save" />
	</pre>
</form>
${msg}

<a href="displayLocations">View All</a>

</body>
</html>