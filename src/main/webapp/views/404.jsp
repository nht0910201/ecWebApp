<%--
  Created by IntelliJ IDEA.
  User: Tri
  Date: 11/3/2021
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>404</title>
    <style>
        body{
            height: 100vh;

        }
    </style>
</head>
<body>
<div class="container-fluid h-100">
    <div class="row h-100 align-items-center">
        <div class="col-sm-12">
            <div class=" card shadow w-50 mx-auto">
                <div class="card-body">
                    <h1 class="card-title">Ooop!</h1>
                    <h2 class="text-danger">404 @@! Page not found</h2>
                    <p class="card-text">
                        Sorry ! There is problem, the request page not found !
                    </p>
                    <div>
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/Home" role="button">
                        <i class="fa fa-home" aria-hidden="true"></i>
                        Home
                    </a>
                        <a class="btn btn-success" href="#" role="button">
                            <i class="fa fa-envelope" aria-hidden="true"></i>
                            Contact us
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>
</body>
</html>
