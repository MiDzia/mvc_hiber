<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Students</title>
</head>
<body>
<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Age</th>
        <th>Group</th>
        <th>Operations</th>

    </tr>
    <c:forEach var="student" items="${allStudents}">
        <c:url var="updateButton" value="/updateInfo">
            <c:param name="studentId" value="${student.id}"/>
        </c:url>
        <c:url var="deleteButton" value="/deleteStudent">
            <c:param name="studentId" value="${student.id}"/>
        </c:url>

        <tr>
            <td>${student.name}</td>
            <td>${student.surname}</td>
            <td>${student.age}</td>
            <td>${student.groupId}</td>
            <td>
                <input type="button" value="Update"
                       onclick="window.location.href='${updateButton}'"/>
                <input type="button" value="Delete"
                       onclick="window.location.href='${deleteButton}'"/>
            </td>
        </tr>

    </c:forEach>

    <input type="button" value="add" onclick="window.location.href='addNewStudent'"/>
</table>
</body>
</html>
