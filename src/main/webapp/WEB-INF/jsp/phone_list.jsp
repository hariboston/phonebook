<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mobile Number List</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<table class="table table-dark">
			<thead class="table-dark">
				<th scope="row">Name</th>
				<th scope="row">Mobile</th>
				<th scope="row">Email</th>

				<th scope="row">Update</th>
				<th scope="row">Delete</th>
			</thead>
			<tbody>
				<c:forEach items="${phoneList}" var="phone">
					<tr>

						<td>${phone.name}</td>
						<td>${phone.mobile}</td>
						<td>${phone.email}</td>
						<td><spring:url value="/phone/editPhone/${phone.id}"
								var="editURL" /> <a class="btn btn-info" href="${editURL}"
							role="button">Update</a></td>
						<td><spring:url value="/phone/deletePhone/${phone.id}"
								var="deleteURL" /> <a class="btn btn-danger"
							href="${deleteURL}" role="button">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<spring:url value="/phone/addPhone/" var="addPhone" />
		<a class="btn btn-dark" href="${addPhone}" role="button">Add
			New Number</a>
	</div>
</body>
</html>