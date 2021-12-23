<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page isELIgnored="false" %>

<html>
<head>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

    <title>Students Page </title>
</head>
<body>
<div class="container">
    <a href="<c:url value='/showStudent' />" class="btn btn-info" role="button">addStudent</a>
    <a href="<c:url value='/main' />" class="btn btn-outline-danger" role="button">Home</a>


    <h2>Students:</h2>
    <table class="table">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Address</th>
            <th>Age</th>

        </tr>

        <c:forEach items="${studentlist}" var="student">
            <tr>
                <td>${student.studentId}</td>
                <td>${student.studentName}</td>
                <td>${student.studentAddress}</td>
                <td>${student.age}</td>
                <td><a href="<c:url value="/student/${student.studentId}" />">Select</a></td>
                <td><a href="<c:url value="/deleteStudent/${student.studentId}" />">Delete</a></td>

            </tr>

        </c:forEach>
    </table>


    <a href="<c:url value="/logout" />" class="link-info" role="button">Logout</a>

</div>


</body>

</html>