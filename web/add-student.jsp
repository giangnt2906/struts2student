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
<h1>Form add Student</h1>
<a href="/students">List Point Student</a>

<s:form action="save" method="post" >
    <div>
        <s:textfield name="student.id" key="RollNumber"/>
    </div>
    <div>
        <s:textfield name="student.subjects" key="Subjects"/>
    </div>
    <div>
        <s:textfield name="student.nameStudent" key="Name Student"/>
    </div>
    <div>
        <s:textfield name="student.pointLt" key="Point Lt"/>
    </div>
    <div>
        <s:textfield name="student.pointTh" key="Point Th"/>
    </div>
    <div>
        <s:textfield name="student.pointAssignment" key="Point Assignment"/>
    </div>

    <div>
        <s:submit value="Submit"/>
        <s:reset value="Reset"/>
    </div>
</s:form>

</body>
<s:head></s:head>
</html>