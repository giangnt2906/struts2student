<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Delete Student</title>
</head>
<body>
<h1>Are you sure you want to delete?</h1>

<div>
    <s:label value="Id: %{student.id}"/>
</div>
<div>
    <s:label value="Subject Name: %{student.subjectName}"/>
</div>
<div>
    <s:label value="Student Name: %{student.nameStudent}"/>
</div>
<div>
    <s:label value="Point Theory: %{student.theory}"/>
</div>
<div>
    <s:label value="Point Assignment: %{student.asm}"/>
</div>
<div>
    <s:label value="Point Project: %{student.proj}"/>
</div>

<s:form action="deleteConfirm" method="post">
    <s:hidden name="id" value="%{id}"/>
    <div>
        <s:submit value="Delete"/>
    </div>
</s:form>
<a href="students">Back to List</a>
</body>
</html>
