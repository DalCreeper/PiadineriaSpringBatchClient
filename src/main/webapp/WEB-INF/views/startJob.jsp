<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Batch Job Starter</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/stylesStart.css">
</head>
<body>
    <header>
        <h1>Start Your Batch Job</h1>
    </header>
    <main>
        <p>Click the button below to start the batch job.</p>
        <form id="form" action="${pageContext.request.contextPath}/batch/start" method="get">
            <div id="overlay" style="display: none;">
                <div class="mover"></div>
            </div>
            <button id="start-btn" type="submit">Start Job</button>
        </form>
    </main>
    <script src="${pageContext.request.contextPath}/js/scriptStart.js"></script>
</body>
</html>