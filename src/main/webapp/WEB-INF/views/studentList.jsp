<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student List</title>
</head>
<body>
<h2>Student List</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Matriculation Number</th>
        <th>Email</th>
        <th>Phone Number</th>
        <th>Address</th>
        <th>Action</th>
    </tr>
    <jsp:useBean id="students" scope="request" type="java.util.List"/>
    <c:forEach items="${students}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.matriculationNumber}</td>
            <td>${student.email}</td>
            <td>${student.phoneNumber}</td>
            <td>${student.address}</td>
            <td>
                <a href="${pageContext.request.contextPath}/students/edit/${student.id}">Edit</a>
                <a href="${pageContext.request.contextPath}/students/delete/${student.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<a href="${pageContext.request.contextPath}/students/add">Add New Student</a>
</body>
</html>
