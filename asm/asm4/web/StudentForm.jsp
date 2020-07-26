<%--
  Created by IntelliJ IDEA.
  User: GIANG
  Date: 7/25/2020
  Time: 12:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
<h1> Student Form</h1>

<s:form action="sou-student" method="post">
    <div>
        <s:textfield name="student.studentName" key="Student Name"/>
    </div>
    <div>
        <s:textfield name="student.studentId" key="Student Id"/>
    </div>
    <div>
        <s:hidden name="student.id_student" value="%{student.id_student}"/>
    </div>
    <div>
        <s:submit value="Submit"/>
        <s:reset value="Reset"/>
    </div>
</s:form>

<br>
<a href="/index">Back</a>
</body>
</html>
