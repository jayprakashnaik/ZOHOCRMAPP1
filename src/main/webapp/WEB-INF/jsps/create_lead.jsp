<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create</title>
</head>
   <a href="listAll">Leads</a>

<body>
<h2>Create | Lead</h2>
<form action="saveLead" method="post">
		<pre>
				First Name<input type ="text" name="firstName"/>
				Last Name<input type ="text" name="lastName"/>
				Email<input type ="email" name="email"/>
				mobile<input type ="number" name="mobile"/>
				Source:
				<select name="source">
				  <option value="news paper">News Paper</option>
				  <option value="tv commercial">TV commercial</option>
				  <option value="online">Online</option>
				  <option value="seminar">Seminar</option>
				</select>
				<input type="submit" value="save"/>
		</pre>
					
</form>
</body>
</html>