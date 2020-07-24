<%--
  Created by IntelliJ IDEA.
  User: GIANG
  Date: 7/24/2020
  Time: 3:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>Form</title>
</head>
<body>
<s:form action="saveOrUpdate-student" method="POST">
    <s:hidden name="student.id" />
    <s:textfield name="student.studentName" label="Student Name" />
    <s:textfield name="student.studentId" label="Student Id" />
</s:form>
</body>
</html>
