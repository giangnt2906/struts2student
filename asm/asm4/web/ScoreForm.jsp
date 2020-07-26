<%--
  Created by IntelliJ IDEA.
  User: GIANG
  Date: 7/25/2020
  Time: 12:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Score Form</title>
</head>
<body>
<h1> Score Form</h1>

<br>
<a href="/index">Back</a>
<br>

<s:form action="sou-score" method="post">
    <div>
        <s:textfield name="score.subjectName" key="Subject Name"/>
    </div>
    <div>
        <s:textfield name="score.theory" key="Theory Point"/>
    </div>
    <div>
        <s:textfield name="score.asm" key="Assignment Point"/>
    </div>
    <div>
        <s:textfield name="score.proj" key="Project Point"/>
    </div>
    <div>
        <%--<s:textfield name="id_student" key="Student Id Key"/>--%>
        <s:select   label="Student Name"
                    headerKey="-1" headerValue="---Select Student---"
                    list="mapStudentsList"
                    name="id_student"/>
                    <%--listKey="id_student"
                    listValue="studentName"--%>
    </div>
    <div>
        <s:hidden name="score.id_score" value="%{score.id_score}"/>
    </div>
    <div>
        <s:submit value="Submit"/>
        <s:reset value="Reset"/>
    </div>
</s:form>
</body>
</html>
