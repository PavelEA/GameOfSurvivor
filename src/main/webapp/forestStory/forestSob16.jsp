<%@ page import="dev.PavelEA.GoS.servlet.utility.AnswerConstructor" %>
<%@ page import="dev.PavelEA.GoS.servlet.utility.PageConstructor" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>GameOfSurvivor</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/button.css" type="text/css">
</head>
<body>
<div class="image-bg-village">
  <div class="mx-auto">
    <h2 class="display-4" style="margin-top: 50px">Событие: </h2>
  </div>
  <div>
    <hr class="my-4">
    <p class="lead" style="margin-left: 200px; margin-right: 200px"><% out.print(PageConstructor.getPage(16));%></p>
    <hr class="my-4">
    <p class="px-2" style="margin: 100px"></p>
  </div>
  <div class="mx-auto">
    <div class="wrap">
      <button class="button" style="margin:0 25%;position:relative;margin-top: 20px"
              onclick="window.location='../villageStory/villageSob26.jsp'"><%out.print(AnswerConstructor.getAnswer(3)); %></button>
      <button class="button" style="margin:0 25% ;position:relative;margin-top: 20px"
              onclick="window.location='../sawmillStory/sawmillSob13.jsp'"><%out.print(AnswerConstructor.getAnswer(1)); %></button>
      <button class="button" style="margin:0 25% ;position:relative;margin-top: 20px"
              onclick="window.location='../LosingEndings/LOSE1.jsp'"><%out.print(AnswerConstructor.getAnswer(17)); %></button>
    </div>
  </div>
</div>
</body>
</html>