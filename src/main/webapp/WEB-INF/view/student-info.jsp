<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student-form</title>
</head>
<body>
<h2>Student info</h2>
<form:form action="saveStudent" modelAttribute="student">

    <form:hidden path="id"/>

    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Age <form:input path="age"/>
    <br><br>
    Group <form:input path="groupId"/>
    <br><br>
    <input type="submit" value="ok">
</form:form>
</body>
</html>
