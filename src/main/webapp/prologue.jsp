<%@ page contentType="text/html; ISO-8859-1;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Game of Survivor</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css">
</head>
<body>
<div class="image-bg-2">
    <div class="mx-auto">
        <h2 class="display-4" style="margin-top: 50px">Пролог</h2>
    </div>
    <div>
        <hr class="my-4">
        <p class="lead " style="margin-left: 300px; margin-right: 300px">${prologue}</p>
        <hr class="my-4">
        <p class="px-2" style="margin: 150px">Вы лидер выжившей группы из 5 человек. Ваша группа заняла руины некогда существовавшей маленькой деревни. Ваша основная задача - выжить. Каким будет ваш путь?</p>
    </div>
    <form action="${pageContext.request.contextPath}/origin" method="get">
        <div class="mx-auto" style="margin: -100px">
            <button type="submit" class="button-black">Начать</button>
        </div>
    </form>
   <!-- <form action="${pageContext.request.contextPath}/menu" method="get">
        <div class="mx-auto">
            <button type="submit" class="button-black">В меню</button>
        </div>
    </form>-->
</div>
</body>
</html>











