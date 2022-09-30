<%@ page import="dev.PavelEA.tomcat01.servlet.config.AnswerConstructor" %>
<%@ page import="dev.PavelEA.tomcat01.servlet.config.PageConstructor" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Game of Survivor</title>
</head>
<body>
<h1>Событие: <% out.print(PageConstructor.getPage(2));%></h1>
<br>
<h3>first answer:</h3>
<ul>
    <c:forEach items="${nextPage}" var="page">
        <li>
            <form action="${pageContext.request.contextPath}/firstStory" method="post">
                <input type="hidden" name="nextPage" value="${page}">
                <button type="submit"><%out.print(AnswerConstructor.getAnswer(1)); %></button>
            </form>
        </li>
    </c:forEach>
</ul>
<br>
<H3>second answer</H3>
<ul>
    <c:forEach items="${npcs}" var="npc">
        <li>
            <form action="${pageContext.request.contextPath}/secondStory" method="post">
                <input type="hidden" name="npcName" value="${npc}">
                <button type="submit"><%out.print(AnswerConstructor.getAnswer(2)); %></button>
            </form>
        </li>
    </c:forEach>
</ul>
<br>
<H3>Quests:</H3>
<ul>
    <c:forEach items="${quests}" var="quest">
        <li>
            <form action="${pageContext.request.contextPath}/thirdStory" method="post">
                <input type="hidden" name="npcName" value="${quest.getName()}">
                <button type="submit"><%out.print(AnswerConstructor.getAnswer(3)); %></button>
            </form>
        </li>
    </c:forEach>
</ul>
</body>
</html>
