<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2 background-color:white;color:Red>${LoginStatus}</h2>
<br>
<br>
<br>
<br>
<form action="Datahandling">
<select name="DATA">
  <option value="Insertingdata">INSERT</option>
  <option value="Retrivingdata">RETRIEVE</option>
</select>
<input type="submit" value="Submit" name="button">
</form>



</body>
</html>