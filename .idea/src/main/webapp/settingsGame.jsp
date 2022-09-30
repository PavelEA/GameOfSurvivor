<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Game of Survivor</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css">

</head>
<body>
<div class="section-overlay">
    <div class="container">
        <div class="form">
            <div class="title"></div>
            <form action="${pageContext.request.contextPath}/settings" method="get">
                <div class="input-group">
                    <p class="text-info text-start">
                        <input type="text" class="form-control" style="margin-top: 100px" name="username"
                               placeholder="Введите ваше имя" maxlength="20"
                               aria-label=""
                               value="" required>
                        <button class="btn btn-success" type="submit" name="startBtn" value="start">Принять</button>
                        <button class="btn btn-danger" type="submit" name="removeBtn" value="remove">Удалить</button>
                </div>
                <small>${tooltip}</small></p>
            </form>
        </div>
    </div>
</div>
</body>
</html>