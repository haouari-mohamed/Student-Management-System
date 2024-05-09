<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Student</title>
</head>
<body>
<h2>Add Student</h2>
<form action="${pageContext.request.contextPath}/students/add" method="post">
    Name: <label>
    <input type="text" name="name" required>
</label><br>
    Matriculation Number: <label>
    <input type="text" name="matriculationNumber" required>
</label><br>
    Email: <label>
    <input type="email" name="email">
</label><br>
    Phone Number: <input type="text" name="phoneNumber"><br>
    Address: <label>
    <input type="text" name="address">
</label><br>
    <input type="submit" value="Add Student">
</form>
</body>
</html>
