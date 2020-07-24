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
<h1>Are you sure you want to delete?</h1>

<div>
    <s:label value="RollNumber: %{student.id}"/>
</div>
<div>
    <s:label value="RollNumber: %{student.subjects}"/>
</div>
<div>
    <s:label value="Name Student: %{student.nameStudent}"/>
</div>
<div>
    <s:label value="Point Lt: %{student.pointLt}"/>
</div>
<div>
    <s:label value="Point Th: %{student.pointTh}"/>
</div>
<div>
    <s:label value="Point Assignment: %{student.pointAssignment}"/>
</div>

<s:form action="deleteConfirm" method="post">
    <s:hidden name="id" value="%{id}"/>
    <div>
        <s:submit value="Delete"/>
    </div>
</s:form>
<a href="/students">List Point Student</a>
</body>
<s:head></s:head>
</html>
