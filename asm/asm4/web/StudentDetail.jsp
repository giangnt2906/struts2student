<%--
  Created by IntelliJ IDEA.
  User: GIANG
  Date: 7/26/2020
  Time: 11:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title> Student Detail</title>
    <style>
        #students {
            font-family: "Times New Roman", Times, serif;
            border-collapse: collapse;
            width: 100%;
            text-align: center;
        }

        #students td, #students th {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: center;
        }

        #students tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        #students tr:hover {
            background-color: #ddd;
        }

        #students th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: center;
            background-color: #353baf;
            color: white;
        }

        .container {
            margin: 30px;
        }
    </style>
</head>
<body class="container">
<h1>Student Info</h1>
<br>
<div>
    <s:label value="Student Name: %{student.studentName}"/>
</div>
<div>
    <s:label value="Student Id: %{student.studentId}"/>
</div>
<br>
<table id="students">
    <tr>
        <th>Subject Name</th>
        <th>Point Theory</th>
        <th>Point Assigment</th>
        <th>Point Project</th>
        <th>Created At</th>
        <th>Updated At</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>

    <s:iterator value="scoreList">
        <tr>
            <td><s:property value="subjectName"/></td>
            <td><s:property value="theory"/></td>
            <td><s:property value="asm"/></td>
            <td><s:property value="proj"/></td>
            <td><s:date name="createdAt" format="yyyy-MM-dd HH:mm:ss"/></td>
            <td><s:date name="updatedAt" format="yyyy-MM-dd HH:mm:ss"/></td>

            <td>
                <s:url action="update-score" var="urlGetIdUpdate" escapeAmp="false">
                    <s:param name="score.id_score" value="id_score">
                    </s:param>
                    <s:param name="student.id_student">
                        <s:property value="%{student.id_student}"/>
                    </s:param>
                </s:url>
                <a href="<s:property value="#urlGetIdUpdate"/>">Edit</a>
            </td>

            <td>
                <s:url action="goTo-delete-score-page" var="urlGetIdDelete" escapeAmp="false">
                    <s:param name="score.id_score" value="id_score">
                    </s:param>
                    <s:param name="student.id_student">
                        <s:property value="%{student.id_student}"/>
                    </s:param>
                </s:url>
                <a href="<s:property value="#urlGetIdDelete"/>">Delete</a>
            </td>

        </tr>
    </s:iterator>
</table>
<br>
<a href="/list-student">Back to List Student</a>
</body>
</html>
