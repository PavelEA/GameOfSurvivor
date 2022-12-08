<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<%@ include file="/scripts/header.jsp" %>
<body>
<div class="section-overlay">
    <div class="container">
        <div class="form">
            <div class="title"></div>
            <form action="${pageContext.request.contextPath}/registration" method="get">
                <div class="input-group">
                    <p class="text-info text-start">
                        <input type="text" class="form-control" style="margin-top: 100px" name="username"
                               placeholder="Введите ваше имя" maxlength="20"
                               aria-label=""
                               value="" required>
                        <button class="btn btn-succes" type="submit" name="startBtn" value="start">Принять</button>
                        <button class="btn btn-dange" type="submit" name="removeBtn" value="remove">Удалить</button>
                </div>
                <small>${tooltip}</small></p>
                <small>${user}</small></p>
            </form>
        </div>
    </div>
</div>
<%@ include file="scripts/index_navbar.jsp" %>

<%@ include file="scripts/users_list_modal.jsp" %>

<%@ include file="scripts/description_modal.jsp" %>

<%@ include file="scripts/common_scripts.jsp" %>
</body>
</html>