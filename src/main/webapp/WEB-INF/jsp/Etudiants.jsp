<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Etudiants</title>
<%--<style><%@include file=""%></style>--%>
</head>
<body>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f8f9fa;
        margin: 0;
        padding: 0;
    }

    h2 {
        text-align: center;
        margin-top: 20px;
    }

    form {
        text-align: center;
        margin-bottom: 20px;
    }

    input[type="text"] {
        padding: 8px;
        border-radius: 4px;
        border: 1px solid #ced4da;
    }

    button[type="submit"] {
        padding: 8px 16px;
        border-radius: 4px;
        border: none;
        background-color: #007bff;
        color: #fff;
        cursor: pointer;
    }

    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 20px;
    }

    th, td {
        padding: 12px 8px;
        border-bottom: 1px solid #dee2e6;
        text-align: left;
    }

    th {
        background-color: #007bff;
        color: #fff;
    }

    tr:hover {
        background-color: #f2f2f2;
    }

    a {
        text-decoration: none;
        color: #007bff;
    }
</style>
<h2>Liste des Etudiants</h2>

<form action="Search" method="GET">
    <label>
        <input type="text" name="nom">
    </label>
    <button type="submit">envoyer</button>

</form>

<table>
    <tr>
        <th>Nom</th>
        <th>Numero</th>
        <th>Matricule</th>
        <th>Email</th>
    </tr>
    <c:forEach var="Etudiant" items="${Etudiants}">
        <tr>
            <td>${Etudiant.getNom()}</td>
            <td>${Etudiant.getNumero()}</td>
            <td>${Etudiant.getMatricule()}</td>
            <td>${Etudiant.getEmail()}</td>
            <td><a href="deleteEtudiant/${Etudiant.getMatricule()}">Supprimer</a></td>
            <td><a href="modifyEtudiant/${Etudiant.getMatricule()}">Modifier</a></td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
