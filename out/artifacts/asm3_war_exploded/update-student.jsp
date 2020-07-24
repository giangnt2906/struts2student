<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Update Student</title>
</head>
<body>
<h1>Form</h1>
<a href="/students">List</a>
<s:form action="update-student" method="post">
    <div>
        <s:textfield   name="student.id" key="Student Id"  value="%{student.id}"/>
    </div>
    <div>
        <s:textfield name="student.subjectName" key="Subject Name" value="%{student.subjectName}"/>
    </div>
    <div>
        <s:textfield name="student.nameStudent" key="Student Name" value="%{student.nameStudent}"/>
    </div>
    <div>
        <s:textfield name="student.theory" key="Point for Theory" value="%{student.theory}"/>
    </div>
    <div>
        <s:textfield name="student.asm" key="Point for Assignment" value="%{student.asm}"/>
    </div>
    <div>
        <s:textfield name="student.proj" key="Point for Project" value="%{student.proj}"/>
    </div>
    <s:hidden name="student.createdAt" value="%{student.createdAt}"/>
    <s:hidden name="student.updatedAt" value="%{student.updatedAt}"/>

    <div>
        <s:submit value="Submit"/>
        <s:reset value="Reset"/>
    </div>
</s:form>

</body>
</html>
