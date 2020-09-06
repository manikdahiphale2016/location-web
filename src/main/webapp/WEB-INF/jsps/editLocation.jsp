<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page isELIgnored="false" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Location</title>
</head>
<body>
	
	
<form action="updateLoc" method="post">
<pre>
Id:<input type="text" name="id" value="${location.id}" readonly />
Code:<input type="text" name="code" value="${location.code}" />
Name:<input type="text" name="name" value="${location.name}" />
Type: <input type="radio" name="type" value="rural" ${location.type=='rural'?'checked':''} /> Rural
	  <input type="radio" name="type" value="urban" ${location.type=='urban'?'checked':''} />Urban

	<input type="submit" value="Save" />
	</pre>
</form>
	

</body>
</html>