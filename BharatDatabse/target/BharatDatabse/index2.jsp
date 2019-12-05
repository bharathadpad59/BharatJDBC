<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<h1>${Result}</h1>
<form  action="Detailsofinsertion">
<div class="row">
<div class="col-4">
    <label for="Name">Name:</label><br>
    <input type="text"  name="NAME">
</div>

 <div class="col-4">
    <label for="Id">Id:</label><br>
    <input type="text"  name="ID">
</div>

 <div class="col-4">
    <label for="Skills">Skills:</label><br>
    <input type="text"  name="SKILLS">
</div>
</div>

<div class="row">
<div  class="col-4">
    <label for="YEAR_OF_PASSOUT">YEAR_OF_PASSOUT:</label><br>
    <input type="text"  name="YEAR_OF_PASSOUT">
</div>

 <div  class="col-4">
    <label for="NATIVE_PLACE">NATIVE_PLACE:</label><br>
    <input type="text"  name="NATIVE_PLACE">
</div>

 <div  class="col-4">
    <label for="FAVSUBJECT">FAVSUBJECT:</label><br>
    <input type="text"  name="FAVSUBJECT">
</div>

</div>

 
 
 <br>
 <br>

  <input type="submit" value="submit">



</form>
</body>
</html>