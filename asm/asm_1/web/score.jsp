<%--
  Created by IntelliJ IDEA.
  User: GIANG
  Date: 7/24/2020
  Time: 11:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Score</title>
    <style type="text/css">
        .errorMessage{
            color: red;
        }
    </style>
</head>
<body>
<s:form method="POST" action="score">
    <s:textfield name="subjectName" label="Ten mon hoc"/>
    <s:textfield name="asm" label="Diem thuc hanh"/>
    <s:textfield name="proj" label="Diem bai tap lop"/>
    <s:textfield name="theory" label="Diem thi ly thuyet"/>
    <s:textfield name="id" label="Ma sinh vien"/>

    <s:submit value="Save"/>
</s:form>
</body>
</html>
