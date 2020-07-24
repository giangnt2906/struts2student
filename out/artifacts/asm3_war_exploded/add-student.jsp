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
<h1>Form</h1>
<a href="/students">Back to List</a>

<s:form action="save" method="post" >
    <div>
        <s:textfield name="student.id" key="Student Id"/>
    </div>
    <div>
        <s:textfield name="student.subjectName" key="Subject Name"/>
    </div>
    <div>
        <s:textfield name="student.nameStudent" key="Student Name"/>
    </div>
    <div>
        <s:textfield name="student.theory" key="Point for Theory"/>
    </div>
    <div>
        <s:textfield name="student.asm" key="Point for Assignment"/>
    </div>
    <div>
        <s:textfield name="student.proj" key="Point for Project"/>
    </div>

    <div>
        <s:submit value="Submit"/>
        <s:reset value="Reset"/>
    </div>
</s:form>

</body>
</html>