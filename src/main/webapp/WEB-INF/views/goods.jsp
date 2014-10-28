<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
    List of goods <br/>
    <c:forEach items="${list_of_goods}" var="good">
        name: [<c:out value="${good.name}"/>]
        <br/>
        prize: [<c:out value="${good.prize}"/>]
        <br/>
    </c:forEach>
</head>
<body>
</body>
</html>
