<%@ page import="dev.PavelEA.tomcat01.servlet.config.PageConstructor" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>GameOfSurvivor</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css">
</head>
<body>
<div class="image-bg-loseBear">
    <div class="mx-auto">
        <h2 class="display-4" style="margin-top: 50px">Концовка: </h2>
    </div>
    <div>
        <hr class="my-4">
        <p class="lead" style="margin-left: 200px; margin-right: 200px"><% out.print(PageConstructor.getPage(40));%></p>
        <hr class="my-4">
        <p class="px-2" style="margin: 100px"></p>
    </div>
    <div class="mx-auto">
        <div class="wrap">
            <form action="${pageContext.request.contextPath}/menu" method="get">
                <button type="submit" class="button-black">В меню</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>