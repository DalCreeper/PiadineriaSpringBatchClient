<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Job Status</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/stylesJob.css">
</head>
<body>
    <header class="d-flex align-items-center justify-content-between">
        <a href="${pageContext.request.contextPath}/batch/startJob" class="me-auto"><button id="backStartBtn">Back</button></a>
        <h1 class="text-center flex-grow-1 mb-0 prevent-select">Batch Job Status</h1>
	</header>
    <main>
        <table class="menu-table table table-hover">
            <thead>
                <tr>
                    <th class="align-middle prevent-select text-nowrap">Job Name</th>
                    <th class="align-middle prevent-select text-nowrap">Execution ID</th>
                    <th class="align-middle prevent-select text-nowrap">Start Time</th>
                    <th class="align-middle prevent-select text-nowrap">End Time</th>
                    <th class="align-middle prevent-select text-nowrap">Status</th>
                    <th class="align-middle prevent-select text-nowrap">Exit Description</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td class="col align-middle">${jobName}</td>
                    <td class="col align-middle ">${executionId}</td>
                    <td class="col align-middle text-nowrap">${startTime}</td>
                    <td class="col align-middle text-nowrap"><c:out value="${endTime != null ? endTime : 'In Progress'}"/></td>
                    <td class="col align-middle">${status}</td>
                    <td class="col align-middle">${exitStatus}</td>
                </tr>
            </tbody>
        </table>
        <h2 class="mt-4">Step Executions</h2>
        <table class="menu-table table table-hover">
            <thead>
                <tr>
                    <th class="align-middle prevent-select text-nowrap">Step Name</th>
                    <th class="align-middle prevent-select text-nowrap">Start Time</th>
                    <th class="align-middle prevent-select text-nowrap">End Time</th>
                    <th class="align-middle prevent-select text-nowrap">Status</th>
                    <th class="align-middle prevent-select text-nowrap">Exit Code</th>
                    <th class="align-middle prevent-select text-nowrap">Records Read</th>
                    <th class="align-middle prevent-select text-nowrap">Records Written</th>
                    <th class="align-middle prevent-select text-nowrap">Records Skipped</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="step" items="${stepsCompleted}">
                    <tr>
                        <td class="col align-middle">${step.stepName}</td>
                        <td class="col align-middle text-nowrap">${step.startTime}</td>
                        <td class="col align-middle text-nowrap">${step.endTime}</td>
                        <td class="col align-middle">${step.status}</td>
                        <td class="col align-middle">${step.exitStatus.exitCode}</td>
                        <td class="col align-middle">${step.readCount}</td>
                        <td class="col align-middle">${step.writeCount}</td>
                        <td class="col align-middle">${step.skipCount}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <c:if test="${not empty error}">
            <div class="alert alert-danger mt-3">
                <strong>Error:</strong> ${error}
            </div>
        </c:if>
    </main>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>