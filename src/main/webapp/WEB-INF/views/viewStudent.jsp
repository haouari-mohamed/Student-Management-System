<jsp:useBean id="student" scope="request" type="com.sun.org.apache.xml.internal.security.signature.Manifest"/>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Student Details</title>
</head>
<body>
<h2>View Student Details</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Matriculation Number</th>
        <th>Email</th>
        <th>Phone Number</th>
        <th>Address</th>
    </tr>
    <tr>
        <td>${student.id}</td>
        <td>${student.name}</td>
        <td>${student.matriculationNumber}</td>
        <td>${student.email}</td>
        <td>${student.phoneNumber}</td>
        <td>${student.address}</td>
    </tr>
</table>
<br>
<a href="${pageContext.request.contextPath}/students">Back to Student List</a>
</body>
</html>
