<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>

<head>
    <title>Game of Survivor</title>
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="image-bg">
    <div class="container">
        <div class="form">
            <h1 class="title">Time runs</h1>
            <form action="${pageContext.request.contextPath}/settingsGame.jsp" method="get">

                <button type="submit" class="button-black">Начать</button>
            </form>
        </div>
    </div>
</div>

</body>
</html>