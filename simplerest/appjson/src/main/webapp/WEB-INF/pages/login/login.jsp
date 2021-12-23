<%@ page language="java" pageEncoding="ISO-8859-9" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>


    <link href="css/main.css" rel="stylesheet"></link>
</head>
<body>
<center>
    <br/><br/>
    Welcome to login page
    <br/><br/><br/><br/>

    <form action="login" method="post">

        User Name:<input type="text" name="email" id="email" required /> <br/><br/>
        Password:<input type="password" name="password" id="password"  required /> <br/><br/>

        <input type="submit" value="login"/>


        <br/><br/>

        <a href="showRegistration"> Register</a>

.....
        ${msg}
...


</center>


</body>