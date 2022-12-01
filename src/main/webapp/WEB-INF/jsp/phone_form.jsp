<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Add Number</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
<body bg>
 <div class="container">
  <spring:url value="/phone/addPhone" var="addPhone" />
  <legend><h2>Add Number</h2>
  <form:form modelAttribute="phoneForm" method="post" action="${addPhone}" cssClass="form" >
   <form:hidden path="id"/>
   <div class="form-group">
    <label>Name</label>
    <form:input path="name" cssClass="form-control" id="name" />
   </div>
   <div class="form-group">
    <label>Mobile</label>
    <form:input path="mobile" cssClass="form-control" id="mobile" />
   </div>
   <div class="form-group">
    <label>Email</label>
    <form:input path="email" cssClass="form-control" id="email" />
   </div>
   <button type="submit" class="btn btn-success">Add Number</button>
  </form:form>
  </legend>
 </div>
</body>
</html>