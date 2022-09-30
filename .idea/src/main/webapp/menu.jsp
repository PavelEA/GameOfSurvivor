<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Game of Survivor</title>
  <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet"  type="text/css">
</head>
<body>
<div class="image-bg">
  <div class="container">
    <div class="form">
      <h1 class="title">Time runs</h1>
      <form action="${pageContext.request.contextPath}/prologue" method="get">
        <button type="submit" class="button-black">Играть</button>
      </form>
      <form action="${pageContext.request.contextPath}/statistic" method="get">
        <button type="submit" class="button-black">Статистика</button>
      </form>
      <form action="${pageContext.request.contextPath}/" method="get">
        <button type="submit" class="button-black">Информация</button>
      </form>
      <form action="${pageContext.request.contextPath}/start" method="get">
        <button type="submit" class="button-black">Выход</button>
      </form>
    </div>
  </div>
</div>
</body>
</html>