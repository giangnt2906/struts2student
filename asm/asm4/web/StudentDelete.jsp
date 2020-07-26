<%--
  Created by IntelliJ IDEA.
  User: GIANG
  Date: 7/26/2020
  Time: 10:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Delete Student</title>
</head>
<body>
<h1>Are you sure you want to delete?</h1>
<h4>Student Info</h4>
<br>
<div>
    <s:label value="Student Name: %{student.studentName}"/>
</div>
<div>
    <s:label value="Student Id: %{student.studentId}"/>
</div>
<s:form action="delete-student" method="post">
    <s:hidden name="student.id_student" value="%{student.id_student}"/>
    <div>
        <s:submit value="Delete"/>
    </div>
</s:form>
<a href="/list-student">Back to List Student</a>
</body>
</html>
