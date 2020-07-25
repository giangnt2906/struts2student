<%--
  Created by IntelliJ IDEA.
  User: GIANG
  Date: 7/25/2020
  Time: 1:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Student List</title>
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
    </style>
</head>
<body>
<h1>Student List</h1>
<a href="/create-student">Add New</a>
<br>
<table id="students">
    <tr>
        <th>Id</th>
        <th>Student Name</th>
        <th>Student Id</th>
        <th>Subject Name</th>
        <th>Point Theory</th>
        <th>Point Assigment</th>
        <th>Point Project</th>
        <th>Created At</th>
        <th>Updated At</th>
    </tr>

    <s:iterator value="studentList">
    <tr>
        <td><s:property value="id_student"/></td>
        <td><s:property value="studentName"/></td>
        <td><s:property value="studentId"/></td>

        <td>
            <s:iterator value="scores">
                <s:property value="subjectName"/>
                <br>
            </s:iterator>
        </td>
        <td>
            <s:iterator value="scores">
                <s:property value="theory"/>
                <br>
            </s:iterator>
        </td>
        <td>
            <s:iterator value="scores">
                <s:property value="asm"/>
                <br>
            </s:iterator>
        </td>
        <td>
            <s:iterator value="scores">
                <s:property value="proj"/>
                <br>
            </s:iterator>
        </td>
        <td>
            <s:iterator value="scores">
                <s:date name="createdAt" format="dd-MM-yyyy HH:mm:ss"/>
                <br>
            </s:iterator>
        </td>
        <td>
            <s:iterator value="scores">
                <s:date name="updatedAt" format="yyyy-MM-dd HH:mm:ss"/>
                <br>
            </s:iterator>
        </td>

    </tr>
    </s:iterator>

    <br>
    <a href="/index">Back</a>

</body>
</html>
