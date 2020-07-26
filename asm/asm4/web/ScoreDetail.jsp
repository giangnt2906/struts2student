<%--
  Created by IntelliJ IDEA.
  User: GIANG
  Date: 7/26/2020
  Time: 11:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Score Detail</title>
</head>
<body>
<h1>Are you sure you want to delete?</h1>
<h4>
    Score Info
</h4>
<br>
<div>
    <s:label value="Subject Name: %{score.subjectName}"/>
</div>
<div>
    <s:label value="Theory Point: %{score.theory}"/>
</div>
<div>
    <s:label value="Assignment Point: %{score.asm}"/>
</div>
<div>
    <s:label value="Project Point: %{score.proj}"/>
</div>
<s:form action="delete-score" method="post">
    <s:hidden name="score.id_score" value="%{score.id_score}"/>
    <s:hidden name="student.id_student" value="%{student.id_student}"/>
    <div>
        <s:submit value="Delete"/>
    </div>
</s:form>
<br>
<a href="/list-student">Back to List Student</a>
</body>
</html>
