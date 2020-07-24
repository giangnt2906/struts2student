<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add Student</title>
</head>
<body>
<h1>Form update Student</h1>
<a href="/students">List Point Student</a>
<s:form action="update-student" method="post">
    <div>
        <s:textfield   name="student.id" key="RollNumber"  value="%{student.id}"/>
    </div>
    <div>
        <s:textfield name="student.subjects" key="Subjects" value="%{student.subjects}"/>
    </div>
    <div>
        <s:textfield name="student.nameStudent" key="Name Student" value="%{student.nameStudent}"/>
    </div>
    <div>
        <s:textfield name="student.pointLt" key="Point Lt" value="%{student.pointLt}"/>
    </div>
    <div>
        <s:textfield name="student.pointTh" key="Point Th" value="%{student.pointTh}"/>
    </div>
    <div>
        <s:textfield name="student.pointAssignment" key="Point Assignment" value="%{student.pointAssignment}"/>
    </div>
    <s:hidden name="student.createdAt" value="%{student.createdAt}"/>
    <s:hidden name="student.updatedAt" value="%{student.updatedAt}"/>

    <div>
        <s:submit value="Submit"/>
        <s:reset value="Reset"/>
    </div>
</s:form>

</body>
<s:head></s:head>
</html>
