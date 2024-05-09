<jsp:useBean id="student" scope="request" type="com.panchalprogrammingacademy.model.Student"/>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Student</title>
</head>
<body>
<h2>Edit Student</h2>
<form action="${pageContext.request.contextPath}/students/edit/${student.id}" method="post">
    Name: <label>
    <input type="text" name="name" value="${student.name}" required>
</label><br>
    Matriculation Number: <label>
    <input type="text" name="matriculationNumber" value="${student.matriculationNumber}" required>
</label><br>
    Email: <label>
    <input type="email" name="email" value="${student.email}">
</label><br>
    Phone Number: <label>
    <input type="text" name="phoneNumber" value="${student.phoneNumber}">
</label><br>
    Address: <label>
    <input type="text" name="address" value="${student.address}">
</label><br>
    <input type="submit" value="Save Changes">
</form>
</body>
</html>
