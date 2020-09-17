<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Chenzhimei
  Date: 2020/8/14
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<h1>success</h1>
${name }
<c:forEach items="${students}" var="stu">
    ${stu}<br>
</c:forEach>
${num}
</body>
</html>