<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>compose email</title>
</head>
<body>
	<form action="sendEmail" method="post">
		<pre>
			To<input type="email" name="to" value="${email}" />
			Subject<input type="text" name="subject" />
			Body:
			<textarea name="body" rows="30" cols="30">   </textarea>
			<input type="submit" value="send" />
		</pre>
	</form>


</body>
</html>