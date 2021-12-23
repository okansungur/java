<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Register User</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h2>User Registration:</h2>

    <form action="registerUser" method="post" class="was-validated">
        <div class="form-group">
            <label for="firstName">Username</label>
            <input type="text" name="firstName" id="firstName" required class="form-control"/>
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>
        <div class="form-group">
            <label for="lastName">Last Name</label>
            <input type="text" name="lastName" id="lastName" required class="form-control"/>
        </div>
        <div class="form-group">
            <label for="email">User Mail</label>
            <input type="text" name="email" id="email" required class="form-control"/>
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" name="password" id="password" required class="form-control"/>
        </div>
        <div class="form-group">
            <label for="confirmPassword">Confirm Password</label>
            <input type="password" name="confirmPassword" id="confirmPassword" required class="form-control"/>
        </div>
        <button type="submit" class="btn btn-primary">Register</button>

    </form>
</div>
</body>
</html>