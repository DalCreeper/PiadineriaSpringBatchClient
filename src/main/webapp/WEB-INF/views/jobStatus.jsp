<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Job Status</title>
</head>
<body>
    <h1>Batch Job Status</h1>
    <p>Status: ${status}</p>
    <c:if test="${not empty error}">
        <p>Error: ${error}</p>
    </c:if>
    <a href="${pageContext.request.contextPath}/batch/start">Back</a>
</body>
</html>
