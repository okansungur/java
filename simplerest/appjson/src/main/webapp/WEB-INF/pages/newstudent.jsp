<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page isELIgnored="false" %>

<html>
<head>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">

    <title>Add Students Page </title>
</head>
<body>
<div class="container">
    <a href="<c:url value="/logout" />" class="btn btn-info" role="button">Logout</a>
    <a href="<c:url value='/student' />" class="btn btn-info" role="button">Students</a>

    <h2>Students:</h2>

    <form action="<c:url value="/addnewStudent" />" method="post">
        <div class="form-group">
            <input type="text" class="form-control form-control-sm" placeholder="name" name="studentName">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" placeholder="address" name="studentAddress">
        </div>
        <div class="form-group">
            <input type="text" class="form-control form-control-lg" placeholder="age" name="age">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>


</div>


</body>

</html>