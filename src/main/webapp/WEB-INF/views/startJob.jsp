<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Start Batch Job</title>
</head>
<body>
    <h1>Start Batch Job</h1>
    <form action="${pageContext.request.contextPath}/batch/start" method="get">
        <button type="submit">Start Job</button>
    </form>
</body>
</html>