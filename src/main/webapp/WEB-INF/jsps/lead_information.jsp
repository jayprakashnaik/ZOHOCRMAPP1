<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead info</title>
</head>
<body>
	<pre>
	First Name  :${lead.firstName }<br/>
	Last Name	:${lead.lastName }<br/>
	Email	    :${lead.email }<br/>
	Mobile      :${lead.mobile }<br/>		
	Source		:${lead.source }<br/>
	</pre>
	
	<form action="composeEmail" method="post">
	<input type="hidden" name="email" value="${lead.email }"/>
	<input type="submit" value="send email"/>
	</form>
	
	<form action="convertContact" method="post">
		<input type="hidden" name="contact" value="${lead.id}"/>
		<input type="submit" value="contact"/>
	</form>
</body>
</html>