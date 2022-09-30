<%@ page import="dev.PavelEA.tomcat01.servlet.config.PageConstructor" %>
<%@ page import="dev.PavelEA.tomcat01.servlet.config.AnswerConstructor" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>GameOfSurvivor</title>
    <link rel="stylesheet" href="../css/bootstrap.css" type="text/css">
</head>
<body>
<div class="jumbotron">
    <div class="mx-auto">
        <h2 class="display-4">Событие: </h2>
    </div>
    <hr class="my-4">
    <p class="nav"><% out.print(PageConstructor.getPage(26));%></p>
    <br><br><br>
    <div class="mx-auto">
        <button class="btnGreen" onclick="window.location='${pageContext.request.contextPath}/.jsp'">Далее</button>
    </div>
</div>
</body>
</html>