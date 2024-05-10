<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Etudiant Form</title>
</head>
<body>
<h2>Etudiant Form</h2>
<form action="saveEtudiant" method="post">


    <label>Nom:</label>
    <input type="text" name="nom" required><br>


    <label>Numero:</label>
    <input type="Number" name="numero" required><br>


    <label>matricule:</label>
    <input type="text" name="matricule" required><br>

    <label>Email:</label>
    <input type="email" name="email" required><br>

    <button type="submit">Envoyer</button>
</form>
</body>
</html>
