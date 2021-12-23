<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page isELIgnored="false" %>

<html>
<head>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">

    <title>Welcome</title>
</head>
<body>

<div id="page-content" class="page-content">
    <div class="jumbotron text-center">
        <h1>Welcome to the Main Page</h1>
        <a href="<c:url value="/logout" />" class="btn btn-outline-warning" role="button">Logout</a>
    </div>

    <div class="container">
        <div class="row">
            <div class="col-sm-4">
                <h3>Rest Service</h3>
                <p><a href="<c:url value="/ships"  />" class="btn btn-outline-primary" role="button">Ships</a></p>
            </div>
            <div class="col-sm-4">
                <h3>Encyrption</h3>
                <p><a href="<c:url value="/encyrpt" />" class="btn btn-outline-secondary" role="button">encyrption</a>
                </p>
            </div>

            <div class="col-sm-4">
                <h3>Students</h3>
                <p><a href="<c:url value="/student" />" class="btn btn-outline-success" role="button">Go To Students
                    Page</a></p>
            </div>

            <hr/>


        </div>

</body>
</html>