<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>GoS</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css">
</head>
<body>
<div class="table-responsive-sm">
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th scope="col">Место</th>
            <th scope="col">Имя</th>
            <th scope="col">Попыток</th>
            <th scope="col">Побед</th>
            <th scope="col">Поражений</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th scope="row">1</th>
            <td>${username_0}</td>
            <td>${attempts_u0}</td>
            <td>${victory_u0}</td>
            <td>${defeat_u0}</td>
        </tr>
        <tr>
            <th scope="row">2</th>
            <td>${username_1}</td>
            <td>${attempts_u1}</td>
            <td>${victory_u1}</td>
            <td>${defeat_u1}</td>
        </tr>
        <tr>
            <th scope="row">3</th>
            <td>${username_2}</td>
            <td>${attempts_u2}</td>
            <td>${victory_u2}</td>
            <td>${defeat_u2}</td>
        </tr>
        <tr>
            <th scope="row">4</th>
            <td>${username_3}</td>
            <td>${attempts_u3}</td>
            <td>${victory_u3}</td>
            <td>${defeat_u3}</td>
        </tr>
        <tr>
            <th scope="row">5</th>
            <td>${username_4}</td>
            <td>${attempts_u4}</td>
            <td>${victory_u4}</td>
            <td>${defeat_u4}</td>
        </tr>
        </tbody>
    </table>
    <form action="${pageContext.request.contextPath}/menu" method="get">
    <div class="mx-auto" style="margin: 100px">
        <button type="submit" class="button-black">Назад</button>
    </div>
</form>
</div>

</body>
</html>
